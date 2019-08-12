package com.manpreet.microservices.currencyconversionservivce.services;

import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;

@Configuration
class LocalRibbonClientConfiguration {
	@Bean
	public ServerList<Server> ribbonServerList() {
		StaticServerList<Server> staticServerList = new StaticServerList<>((new Server("localhost", 8001)),
				new Server("localhost", 8000));
		return staticServerList;
	}
}