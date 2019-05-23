package com.randika.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyCovnersionBean {
	private long id;
	private String from,to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantitiy;
	private BigDecimal totalAmount;
	private int port;
	
	
	
	protected CurrencyCovnersionBean() {
		super();
	}
	
	public CurrencyCovnersionBean(long id, String from, String to, BigDecimal conversionMultiple,
			BigDecimal quantitiy, BigDecimal totalAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantitiy = quantitiy;
		this.totalAmount = totalAmount;
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantitiy() {
		return quantitiy;
	}
	public void setQuantitiy(BigDecimal quantitiy) {
		this.quantitiy = quantitiy;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
