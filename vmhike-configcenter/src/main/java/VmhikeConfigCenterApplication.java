import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 配置中心
 */
@EnableConfigServer
@SpringCloudApplication
@EnableEurekaClient
public class VmhikeConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmhikeConfigCenterApplication.class, args);
    }
}
