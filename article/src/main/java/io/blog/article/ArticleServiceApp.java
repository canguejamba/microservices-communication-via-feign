/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: microservices-communication-via-feign
 */
package io.blog.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "io.clients.feign.comment"
)
public class ArticleServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ArticleServiceApp.class, args);
    }
}
