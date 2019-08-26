package com.manpreet.microservices.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manpreet.microservices.currencyexchangeservice.domain.ExchangeValue;

public interface ExchangeServiceRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
