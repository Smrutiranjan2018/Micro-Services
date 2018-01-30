package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Employee;

public interface ServiceInterface extends JpaRepository<Employee,Integer> {

}
