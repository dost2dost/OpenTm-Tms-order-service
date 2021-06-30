package com.openport.opentm.order.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openport.opentm.order.microservice.model.OrderStaging;

public interface OrderStagingRepository extends JpaRepository<OrderStaging, Long> {

}