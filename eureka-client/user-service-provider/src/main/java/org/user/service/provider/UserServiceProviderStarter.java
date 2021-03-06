package org.user.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserServiceProviderStarter.class, args);
	}
}
