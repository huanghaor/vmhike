package com.hhr.search.controller;

import com.hhr.vmhike.common.interfac.NoRepeatSubmit;
import org.apache.commons.collections4.map.LRUMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    // 最大容量 100 个，根据 LRU 算法淘汰数据的 Map 集合
    private LRUMap<String, Integer> reqCache = new LRUMap<>(100);

    @RequestMapping("/add")
    @NoRepeatSubmit
    public String addUser(String id) {
        // 非空判断(忽略)...
        synchronized (this.getClass()) {
            // 重复请求判断
            if (reqCache.containsKey(id)) {
                // 重复请求
                System.out.println("请勿重复提交！！！" + id);
                return "执行失败";
            }
            // 存储请求 ID
            reqCache.put(id, 1);
        }
        // 业务代码...
        System.out.println("添加用户ID:" + id);
        return "执行成功！";
    }
}
