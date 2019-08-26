package com.retail.store.service;

import com.retail.domain.User;

public interface PurchaseService {
	
	public void makeSale(Double amount, User user);

}
