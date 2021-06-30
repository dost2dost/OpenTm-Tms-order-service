package com.openport.opentm.order.microservice.dto;

import java.io.Serializable;

public class SkuDetailDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long skuId;
	private long orderId;
	private String skuCd;
	private String skuDescription;
	private Double quantity;
	private String quantityUom;
	private Double volume;
	private String volumeUom;
	
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
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	 
	
}
