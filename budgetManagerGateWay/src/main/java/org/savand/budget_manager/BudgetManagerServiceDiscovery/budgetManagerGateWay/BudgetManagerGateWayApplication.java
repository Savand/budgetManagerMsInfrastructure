package org.savand.budget_manager.BudgetManagerServiceDiscovery.budgetManagerGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@Controller
public class BudgetManagerGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetManagerGateWayApplication.class, args);
	}
	
}
