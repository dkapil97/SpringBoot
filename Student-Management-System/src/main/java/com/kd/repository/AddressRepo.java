package com.kd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kd.model.Address;

public interface AddressRepo  extends JpaRepository<Address, Long>{

}
