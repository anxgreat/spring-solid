package solidtutorial.supports.impl;

import solidtutorial.supports.iface.PercentageCalculationIface;

public class FoodCalculationImpl implements PercentageCalculationIface{

	static Integer hijauanWeight = 7;
	static Integer konsentratWeight = 7;
	
	@Override
	public Double calculate(Integer bobot, Integer percentage) {
		// TODO Auto-generated method stub
		return  Double.valueOf(((Double.valueOf(bobot)*Double.valueOf(percentage)*20)/100.00));
	}
	
	public Double getHijauanCalculate(Integer bobot) {
		return calculate(bobot, hijauanWeight);
	}

	public Double getKonsentratCalculate(Integer bobot) {
		return calculate(bobot, konsentratWeight);
	}
}
