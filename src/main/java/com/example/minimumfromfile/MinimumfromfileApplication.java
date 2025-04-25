package com.example.minimumfromfile;

import com.example.minimumfromfile.controller.GetQueryForxlsx;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MinimumfromfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimumfromfileApplication.class, args);
	}

}
