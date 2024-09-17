package com.nischitha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nischitha.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
