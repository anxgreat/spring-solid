package solidtutorial.supports.impl;

import solidtutorial.supports.iface.KarkasWeightCalculation;
import solidtutorial.supports.iface.PercentageCalculationIface;

public class WeightCalculationSayurImpl implements PercentageCalculationIface, KarkasWeightCalculation{

	Integer karkasPercentage = 50;
	Integer karkasTulangPercentage = 60;
	Integer karkasDagingPercentage = 40;
	
	@Override
	public Double calculate(Integer bobot, Integer percentage) {
		// TODO Auto-generated method stub
		return Double.valueOf(((Double.valueOf(bobot)*Double.valueOf(percentage))/100.00));
	}

	public Double calculate(Double bobot, Integer percentage) {
		// TODO Auto-generated method stub
		return  Double.valueOf(((bobot*Double.valueOf(percentage))/100.00));
	}

	@Override
	public Double getKarkasWeight(Integer bobot) {
		return calculate(bobot, karkasPercentage);
	}

	@Override
	public Double getTulangWeight(Integer bobot) {
		return calculate(getKarkasWeight(bobot), karkasTulangPercentage);
	}

	@Override
	public Double getDagingWeight(Integer bobot) {
		return calculate(getKarkasWeight(bobot), karkasDagingPercentage);
	}

}
