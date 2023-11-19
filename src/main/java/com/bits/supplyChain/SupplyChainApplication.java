package com.bits.supplyChain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bits.*")
public class SupplyChainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplyChainApplication.class, args);
	}

}
