package com.retail.store.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.retail.domain.Purchase;
import com.retail.store.dao.PurchaseDao;

public class PurchaseDaoImpl implements PurchaseDao {
	
	private List<Purchase> purchases = new ArrayList<>();

	@Override
	public List<Purchase> getPurchases() {
		return this.purchases;
	}

	@Override
	public List<Purchase> getUserPurchases(Long userId) {
		List<Purchase> userPurchases = purchases.stream().filter(purchase -> purchase.getUser().getId().equals(userId)).collect(Collectors.toList()); 
		return userPurchases;
	}

	@Override
	public void save(Purchase purchase) {
		this.purchases.add(purchase);
	}

	@Override
	public Long getNextId() {
		return (long) purchases.size() + 1;
	}
	
}
