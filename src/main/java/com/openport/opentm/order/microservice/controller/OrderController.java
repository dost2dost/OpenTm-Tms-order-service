package com.openport.opentm.order.microservice.controller;

import com.openport.opentm.order.microservice.dto.OrderStagingDto;
import com.openport.opentm.order.microservice.response.ResponseCode;
import com.openport.opentm.order.microservice.response.ResponseDesc;
import com.openport.opentm.order.microservice.response.ServiceResponse;
import com.openport.opentm.order.microservice.service.OrderService;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/saveOrder", method= RequestMethod.POST)
	
	public ServiceResponse saveOrder(@RequestBody OrderStagingDto orderStagingDto) {
		
		if(orderStagingDto != null) {
		//checking mandatory fields
		if(StringUtils.isBlank(orderStagingDto.getCustomerCd()) || StringUtils.isBlank(orderStagingDto.getPickupLocationCd())
		   || orderStagingDto.getPickupDt() == null) {
			return new ServiceResponse(ResponseCode.ERR_CODE_REQUIRED_FIELDS_EMPTY, ResponseDesc.ERR_DESC_REQUIRED_FIELDS_EMPTY);
		}
		
		//validating data
		
		//inserting order
		try {
			ServiceResponse serviceResponse= orderService.insertOrder(orderStagingDto);
			return serviceResponse;
		}
		catch(Exception ex){
			return new ServiceResponse(ResponseCode.FAILURE, ex);
		}
		}
		else {
			return new ServiceResponse(400,"Bad Request");
		}
		
	} 

}
