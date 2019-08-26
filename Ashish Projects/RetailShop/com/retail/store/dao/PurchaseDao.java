package com.retail.store.dao;

import java.util.List;

import com.retail.domain.Purchase;

public interface PurchaseDao {
	
	public Long getNextId();
	
	public List<Purchase> getPurchases();
	
	public List<Purchase> getUserPurchases(Long userId);
	
	public void save(Purchase purchase);

}
