package com.openport.opentm.order.microservice.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="sku_detail")
public class SkuDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sku_id")
	private long skuId;
	
	@Column(name="sku_cd")
	private String skuCd;
	
	@Column(name="sku_description")
	private String skuDescription;
	
	@Column(name="quantity")
	private Double quantity;
	
	@Column(name="quantity_uom")
	private String quantityUom;
	
	@Column(name="volume")
	private Double volume;
	
	@Column(name="volume_uom")
	private String volumeUom;
	
  @ManyToOne(fetch = FetchType.LAZY,optional=false)
  @JoinColumn( name="order_id")
  private OrderStaging order;

	public long getSkuId() {
		return skuId;
	}

	public void setSkuId(long skuId) {
		this.skuId = skuId;
	}

	public String getSkuCd() {
		return skuCd;
	}

	public void setSkuCd(String skuCd) {
		this.skuCd = skuCd;
	}

	public String getSkuDescription() {
		return skuDescription;
	}

	public void setSkuDescription(String skuDescription) {
		this.skuDescription = skuDescription;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUom() {
		return quantityUom;
	}

	public void setQuantityUom(String quantityUom) {
		this.quantityUom = quantityUom;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getVolumeUom() {
		return volumeUom;
	}

	public void setVolumeUom(String volumeUom) {
		this.volumeUom = volumeUom;
	}

	public OrderStaging getOrder() {
		return order;
	}

	public void setOrder(OrderStaging order) {
		this.order = order;
	}
}
