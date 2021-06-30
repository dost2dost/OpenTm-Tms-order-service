package com.openport.opentm.order.microservice.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class OrderStagingDto implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	 private String processStatusCd;
	 private String probillNumber;
	 private String orderNumber;
	 private String releaseNumber;
	 private String customerCd;
	 private String  pickupLocationCd;
	 private String  deliveryLocationCd;
	 private String transporterCd;
	 private Timestamp createDt;
	 private Timestamp pickupDt;
	 private Timestamp deliveryDt;
	 private String driverName;
	 private String driverPhoneNumber;
	 private String vehicleNumber;
	 private List<SkuDetailDto> skuDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProcessStatusCd() {
		return processStatusCd;
	}

	public void setProcessStatusCd(String processStatusCd) {
		this.processStatusCd = processStatusCd;
	}

	public String getProbillNumber() {
		return probillNumber;
	}

	public void setProbillNumber(String probillNumber) {
		this.probillNumber = probillNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getReleaseNumber() {
		return releaseNumber;
	}

	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}

	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getPickupLocationCd() {
		return pickupLocationCd;
	}

	public void setPickupLocationCd(String pickupLocationCd) {
		this.pickupLocationCd = pickupLocationCd;
	}

	public String getDeliveryLocationCd() {
		return deliveryLocationCd;
	}

	public void setDeliveryLocationCd(String deliveryLocationCd) {
		this.deliveryLocationCd = deliveryLocationCd;
	}

	public String getTransporterCd() {
		return transporterCd;
	}

	public void setTransporterCd(String transporterCd) {
		this.transporterCd = transporterCd;
	}

	public Timestamp getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}

	public Timestamp getPickupDt() {
		return pickupDt;
	}

	public void setPickupDt(Timestamp pickupDt) {
		this.pickupDt = pickupDt;
	}

	public Timestamp getDeliveryDt() {
		return deliveryDt;
	}

	public void setDeliveryDt(Timestamp deliveryDt) {
		this.deliveryDt = deliveryDt;
	}

	
	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhoneNumber() {
		return driverPhoneNumber;
	}

	public void setDriverPhoneNumber(String driverPhoneNumber) {
		this.driverPhoneNumber = driverPhoneNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public List<SkuDetailDto> getSkuDetails() {
		return skuDetails;
	}

	public void setSkuDetails(List<SkuDetailDto> skuDetails) {
		this.skuDetails= skuDetails;
	}


}
