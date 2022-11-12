package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

@SpringBootApplication//this includes @Configuration
public class TicketingProjectDataSumeyeApplication {

    public static void main(String[] args) {

        SpringApplication.run(TicketingProjectDataSumeyeApplication.class, args);
    }

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }



}
