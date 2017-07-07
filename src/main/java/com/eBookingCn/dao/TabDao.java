package com.eBookingCn.dao;

import java.util.ArrayList;

import com.eBookingCn.po.ConsignAddCompleteResult;
import com.eBookingCn.po.Tab;

public interface TabDao {

	public Tab getTab(int id);
	
	public Tab getConsign();
	
	public ArrayList<Tab> getConsigns();
	
	public void updateConsigns(ConsignAddCompleteResult result);
}