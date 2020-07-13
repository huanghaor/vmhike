package com.hhr.vmhikeregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务中心
 * @author hhr
 * 2020-07-13
 */
@SpringBootApplication
@EnableEurekaServer
public class VmhikeRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmhikeRegisterApplication.class, args);
    }

}
