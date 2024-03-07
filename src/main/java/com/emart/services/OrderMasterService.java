package com.emart.services;

import java.util.List;

import com.emart.entities.OrderMaster;

public interface OrderMasterService {

	public OrderMaster saveOrder(OrderMaster o);
	public OrderMaster getOrderById(int id);
	public List<OrderMaster>getAllOrders();
	public void deleteOrder(int id);
	public OrderMaster update(OrderMaster o,int id);
	
	
}
