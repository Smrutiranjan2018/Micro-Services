package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Employee;
import com.example.repository.ServiceInterface;

@RestController
public class ZipkinController3 {
	
	@Autowired
	private ServiceInterface repository;
	
	@RequestMapping("/service/3/{id}")
	public String callService3(@PathVariable int id) {
		Employee data=repository.findById(id).get();
		return "Returning data from Service 3 "+data.toString();
	}
	
    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }
	
}
