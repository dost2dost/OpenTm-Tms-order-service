package com.openport.opentm.order.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openport.opentm.order.microservice.model.Shipper;

public interface ShipperRepository extends JpaRepository<Shipper, Long> {

}
