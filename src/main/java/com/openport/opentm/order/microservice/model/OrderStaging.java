package com.openport.opentm.order.microservice.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="order_staging")
public class OrderStaging{

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="order_id")
	 private long id;
	 
	 @Column(name="process_status_cd")
	 private String processStatusCd;
	 
	 @Column(name="probill_number")
	 private String probillNumber;
	 
	 @Column(name="order_number")
	 private String orderNumber;
	 
	 @Column(name="release_number")
	 private String releaseNumber;
	 
	 @Column(name="customer_cd")
	 private String customerCd;
	 
	 @Column(name="pickup_loc_cd")
	 private String  pickupLocationCd;
	 
	 @Column(name="delivery_loc_cd")
	 private String  deliveryLocationCd;
	 
	 @Column(name="transporterCd")
	 private String transporterCd;
	 
	 //@Temporal(TemporalType.TIMESTAMP)
	 @Column(name="create_dt")
	 private Timestamp createDt;
	 
	 //@Temporal(TemporalType.TIMESTAMP)
	 @Column(name="pickup_dt")
	 private Timestamp pickupDt;
	 
	 //@Temporal(TemporalType.TIMESTAMP)
	 @Column(name="delivery_dt")
	 private Timestamp deliveryDt;
	  
	 @Column(name="driver_name")
	 private String driverName;
	 
	 @Column(name="driver_phone_number")
	 private String driverPhoneNumber;
	 
	 @Column(name="vehicle_number")
	 private String vehicleNumber;
	 
	 //CascadeType.MERGE,CascadeType.REFRESH
	 @OneToMany(mappedBy = "order", cascade = {CascadeType.ALL})
	private List<SkuDetail> skuDetails;

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

	public List<SkuDetail> getSkuDetails() {
		return skuDetails;
	}

	public void setSkuDetails(List<SkuDetail> skuDetails) {
		this.skuDetails = skuDetails;
	}
	 
}
