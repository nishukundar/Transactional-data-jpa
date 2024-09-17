package com.nischitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nischitha.service.EmployeeService;

@SpringBootApplication
public class DataJpaTransactionAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaTransactionAppApplication.class, args);
		EmployeeService bean = context.getBean(EmployeeService.class);
	    bean.saveData();
	}

}
