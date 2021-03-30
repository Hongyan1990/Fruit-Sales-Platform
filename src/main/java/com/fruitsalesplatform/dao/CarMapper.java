package com.fruitsalesplatform.dao;

import com.fruitsalesplatform.po.CarModel;

public interface CarMapper {
	CarModel queryDoCar(int uId);
	int addCar(CarModel carModel);
	int updateCar(CarModel carModel);
	
}
