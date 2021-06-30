package com.openport.opentm.order.microservice.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="shipper")
public class Shipper {
	
	@Id
	@GeneratedValue
	@Column(name="shipper_id")
	private long shipperId;
	
	@Column(name="shipper_cd")
	private String shipperCd;
	
	@Column(name="shipper_name")
	private String shipperName;
	
	@Column(name="shipper_email_address")
	private String shipperEmail;
	
	@Column(name="is_active")
	private byte isActive;
	
	@ManyToMany(targetEntity = Transporter.class, mappedBy = "shippers", cascade = {CascadeType.MERGE,CascadeType.REFRESH})
	private List<Transporter> transporters;

	public long getShipperId() {
		return shipperId;
	}

	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}

	public String getShipperCd() {
		return shipperCd;
	}

	public void setShipperCd(String shipperCd) {
		this.shipperCd = shipperCd;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getShipperEmail() {
		return shipperEmail;
	}

	public void setShipperEmail(String shipperEmail) {
		this.shipperEmail = shipperEmail;
	}

	public byte getIsActive() {
		return isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public List<Transporter> getTransporters() {
		return transporters;
	}

	public void setTransporters(List<Transporter> transporters) {
		this.transporters = transporters;
	}
	
}
