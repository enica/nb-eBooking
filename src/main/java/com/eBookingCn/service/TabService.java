package com.eBookingCn.service;

import java.util.ArrayList;

import com.eBookingCn.po.ConsignAddCompleteResult;
import com.eBookingCn.po.Tab;

public interface TabService {

	public Tab getTab(int id);
	
	public Tab getConsign();
	
	public ArrayList<Tab> getConsigns();
	
	public void updateConsigns(ConsignAddCompleteResult result);
}