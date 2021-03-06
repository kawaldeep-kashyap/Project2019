package com.lbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"com.lbs.rest","com.lbs.repository","com.lbs.entity"})
@EntityScan(basePackages= {"com.lbs.entity"})
public class LunchBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LunchBookingSystemApplication.class, args);
	}

}
