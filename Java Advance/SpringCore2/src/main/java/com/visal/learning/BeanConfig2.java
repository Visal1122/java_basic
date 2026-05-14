package com.visal.learning;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanConfig2 {
		
		@Bean
		List<Integer> score(){
			
			return List.of(12 , 45 , 17 , 24);
		}
		
}
