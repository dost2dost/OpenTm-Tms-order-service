package com.openport.opentm.order.microservice.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openport.opentm.order.microservice.dto.OrderStagingDto;
import com.openport.opentm.order.microservice.dto.SkuDetailDto;
import com.openport.opentm.order.microservice.model.OrderStaging;
import com.openport.opentm.order.microservice.model.SkuDetail;
import com.openport.opentm.order.microservice.repository.OrderStagingRepository;
import com.openport.opentm.order.microservice.repository.SkuDetailRepository;
import com.openport.opentm.order.microservice.response.ResponseCode;
import com.openport.opentm.order.microservice.response.ServiceResponse;

@Service
public class OrderService {
	
	@Autowired
	private OrderStagingRepository orderStagingRepository;
	
	@Autowired
	private SkuDetailRepository skuDetailRepository;
	
	public ServiceResponse insertOrder(OrderStagingDto orderStagingDto) throws Exception{
		
		 // setting create timestamp
		Timestamp createDt=new Timestamp(System.currentTimeMillis());
		List<SkuDetail> skuDetailList=new ArrayList<SkuDetail>();	
		OrderStaging order= new OrderStaging();	
		order.setCustomerCd(orderStagingDto.getCustomerCd());
		order.setOrderNumber(orderStagingDto.getOrderNumber());
		order.setReleaseNumber(orderStagingDto.getReleaseNumber());
		order.setTransporterCd(orderStagingDto.getTransporterCd());
		order.setPickupLocationCd(orderStagingDto.getPickupLocationCd());
		order.setDeliveryLocationCd(orderStagingDto.getDeliveryLocationCd());
		order.setPickupDt(orderStagingDto.getPickupDt());
		order.setDeliveryDt(orderStagingDto.getDeliveryDt());
		order.setCreateDt(createDt);
		order.setDriverName(orderStagingDto.getDriverName());
		order.setDriverPhoneNumber(orderStagingDto.getDriverPhoneNumber());
		order.setVehicleNumber(orderStagingDto.getVehicleNumber());
		order.setProcessStatusCd("P");
		if(orderStagingDto.getSkuDetails() != null) {
		if(orderStagingDto.getSkuDetails().size()>0) {
		for(SkuDetailDto skuDetailDto: orderStagingDto.getSkuDetails()) {
			SkuDetail skuDetail=new SkuDetail();
			skuDetail.setSkuCd(skuDetailDto.getSkuCd());
			skuDetail.setSkuDescription(skuDetailDto.getSkuDescription());
			skuDetail.setQuantity(skuDetailDto.getQuantity());
			skuDetail.setQuantityUom(skuDetailDto.getQuantityUom());
			skuDetail.setVolume(skuDetailDto.getVolume());
			skuDetail.setVolumeUom(skuDetailDto.getQuantityUom());
			skuDetail.setOrder(order);
			skuDetailList.add(skuDetail);
		}
		order.setSkuDetails(skuDetailList);
		}
		}
		
		//saving order and its skus in child table
		OrderStaging orderCreated=orderStagingRepository.save(order);
		
		List<SkuDetailDto> skuDetails=new ArrayList<SkuDetailDto>();
		
		if(orderCreated.getId()>0) {
			OrderStagingDto finalOrder=new OrderStagingDto();
			finalOrder.setId(orderCreated.getId());
			finalOrder.setCustomerCd(orderCreated.getCustomerCd());
			finalOrder.setOrderNumber(orderCreated.getOrderNumber());
			finalOrder.setReleaseNumber(orderCreated.getReleaseNumber());
			finalOrder.setPickupDt(orderCreated.getPickupDt());
			finalOrder.setDeliveryDt(orderCreated.getDeliveryDt());
			finalOrder.setCreateDt(orderCreated.getCreateDt());
			finalOrder.setPickupLocationCd(orderCreated.getPickupLocationCd());
			finalOrder.setDeliveryLocationCd(orderCreated.getDeliveryLocationCd());
			finalOrder.setProbillNumber(orderCreated.getProbillNumber());
			finalOrder.setTransporterCd(orderCreated.getTransporterCd());
			finalOrder.setDriverName(orderCreated.getDriverName());
			finalOrder.setDriverPhoneNumber(orderCreated.getDriverPhoneNumber());
			finalOrder.setVehicleNumber(orderCreated.getVehicleNumber());
			finalOrder.setProcessStatusCd(orderCreated.getProcessStatusCd());
			
			if(orderCreated.getSkuDetails() != null) {
			for(SkuDetail sku:orderCreated.getSkuDetails()) {
				SkuDetailDto s=new SkuDetailDto();
				s.setSkuId(sku.getSkuId());
				s.setSkuCd(sku.getSkuCd());
				s.setSkuDescription(sku.getSkuDescription());
				s.setQuantity(sku.getQuantity());
				s.setQuantityUom(sku.getQuantityUom());
				s.setVolume(sku.getVolume());
				s.setVolumeUom(sku.getQuantityUom());
				skuDetails.add(s);
			}
			
			finalOrder.setSkuDetails(skuDetails);
			}
			return new ServiceResponse(ResponseCode.SUCCESS,finalOrder);
		}
		else {
			return new ServiceResponse(ResponseCode.FAILURE);
		}
		
		
	}
	
	public boolean validateLocationCd(String locationCd)  {
		
		return false;
	}

}
