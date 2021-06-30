package com.openport.opentm.order.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openport.opentm.order.microservice.model.Transporter;

public interface TransporterRepository extends JpaRepository<Transporter, Long> {

}
