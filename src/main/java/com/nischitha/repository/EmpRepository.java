package com.nischitha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nischitha.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
