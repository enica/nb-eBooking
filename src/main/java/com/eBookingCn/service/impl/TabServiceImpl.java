package com.eBookingCn.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eBookingCn.dao.TabDao;
import com.eBookingCn.po.ConsignAddCompleteResult;
import com.eBookingCn.po.Tab;
import com.eBookingCn.service.TabService;

@Service
public class TabServiceImpl implements TabService{

@Resource
private TabDao tabDao;

  public Tab getTab(int id) {
	  return tabDao.getTab(id);
  }
  
  public Tab getConsign() {
	  return tabDao.getConsign();
  }
  
  public ArrayList<Tab> getConsigns() {
	  return tabDao.getConsigns();
  }
  
  public void updateConsigns(ConsignAddCompleteResult result) {
	  tabDao.updateConsigns(result); 
  }
  
}