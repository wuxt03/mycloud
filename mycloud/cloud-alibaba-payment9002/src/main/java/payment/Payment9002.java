package payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-31 14:38
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9002.class, args);
    }
}
