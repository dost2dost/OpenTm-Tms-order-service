package com.openport.opentm.order.microservice.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="transporter")
public class Transporter {
	
	@Id
	@GeneratedValue
	@Column(name="transporter_id")
	private long transporterId;
	
	@Column(name="transporter_cd")
	private String transporterCd;
	
	@Column(name="transporter_name")
	private String transporterName;
	
	@Column(name="shipper_cd")
	private String shipperCd;
	
	@Column(name="tranporter_email_address")
	private String TransporterEmail;
	
	@Column(name="is_active")
	private byte isActive;
	
	  @ManyToMany(targetEntity = Shipper.class, cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER )
	    @JoinTable(
	            name="shipper_transporter",
	            joinColumns=
	            @JoinColumn( name="transporter_id", referencedColumnName="transporter_id"),
	            inverseJoinColumns=@JoinColumn(name="shipper_id", referencedColumnName="shipper_id"))
	    private List<Shipper> shippers;

}
