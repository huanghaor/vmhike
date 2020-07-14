import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 全文检索服务
 */
@EnableDiscoveryClient
@SpringBootApplication
public class VmhikeSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmhikeSearchApplication.class);
    }
}
