package com.hhr.vmhike.common.aop;

import com.hhr.vmhike.common.interfac.NoRepeatSubmit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@Aspect
@Component

/**
 * aop解析注解
 */
public class NoRepeatSubmitAop {

    private Log logger = LogFactory.getLog(getClass());

    @Autowired
    private RedisTemplate<String,Integer> redisTemplate;

    @Around("execution(* com.hhr..*Controller.*(..)) && @annotation(noRepeatSubmit)")
    public Object arround(ProceedingJoinPoint pjp , NoRepeatSubmit noRepeatSubmit){

        ValueOperations<String,Integer> opsForValue = redisTemplate.opsForValue();
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            String sessionId = RequestContextHolder.getRequestAttributes().getSessionId();
            HttpServletRequest request = attributes.getRequest();
            String key = sessionId + "-" + request.getServletPath();
            if (opsForValue.get(key) == null) {// 如果缓存中有这个url视为重复提交
                Object o = pjp.proceed();
                opsForValue.set(key, 0, 2, TimeUnit.SECONDS);
                return o;
            } else {
                logger.error("重复提交");
                return null;
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
            logger.error("验证重复提交时出现未知异常！");
            return "{\"code\":-889,\"message\":\"验证重复提交时出现未知异常!\"}";
        }

    }
}
