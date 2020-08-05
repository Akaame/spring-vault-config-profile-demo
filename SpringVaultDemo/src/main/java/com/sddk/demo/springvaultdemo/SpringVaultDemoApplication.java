package com.sddk.demo.springvaultdemo;

import com.sddk.demo.springvaultdemo.config.PublicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringVaultDemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(SpringVaultDemoApplication.class);

	@Autowired
	private PublicConfig publicConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(publicConfig.getKey());
	}
}
