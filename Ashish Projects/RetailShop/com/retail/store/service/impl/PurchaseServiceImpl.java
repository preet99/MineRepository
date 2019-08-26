package com.retail.store.service.impl;

import com.retail.domain.Purchase;
import com.retail.domain.User;
import com.retail.store.dao.PurchaseDao;
import com.retail.store.service.PurchaseService;

public class PurchaseServiceImpl implements PurchaseService {
	
	private PurchaseDao purchaseDao;
	
	public PurchaseServiceImpl(PurchaseDao purchaseDao) {
		super();
		this.purchaseDao = purchaseDao;
	}

	@Override
	public void makeSale(Double amount, User user) {
		Purchase purchase = new Purchase();
		
		Long rewardPoints = user.getRewardPoints();
		
		while(rewardPoints > 1000l) {
			
		}
		
		purchase.setId(purchaseDao.getNextId());
		purchase.setValue(amount);
		
	}

}
