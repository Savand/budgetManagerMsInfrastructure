package org.savand.budget_manager.BudgetManagerServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BudgetManagerServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetManagerServiceDiscoveryApplication.class, args);
	}
}
