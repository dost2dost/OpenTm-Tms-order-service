package com.openport.opentm.order.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openport.opentm.order.microservice.model.SkuDetail;


public interface SkuDetailRepository extends JpaRepository<SkuDetail, Long>{

}
