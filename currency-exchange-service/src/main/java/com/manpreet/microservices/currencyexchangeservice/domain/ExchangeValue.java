package com.manpreet.microservices.currencyexchangeservice.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	public void setPort(int port) {
		this.port = port;
	}

	@Id
	private Long id;
	@Column(name ="currency_from")
	private String from;

	@Column(name = "currency_to")
	private String to;
	private int port;

	public int getPort() {
		return port;
	}

	public ExchangeValue() {

	}

	public long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	private BigDecimal conversionMultiple;

	public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
}
