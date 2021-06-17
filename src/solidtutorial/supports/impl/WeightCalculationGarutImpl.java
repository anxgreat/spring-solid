package solidtutorial.supports.impl;

import solidtutorial.supports.iface.KarkasWeightCalculation;
import solidtutorial.supports.iface.PercentageCalculationIface;

public class WeightCalculationGarutImpl implements PercentageCalculationIface, KarkasWeightCalculation{

	Integer karkasPercentage = 70;
	Integer karkasTulangPercentage = 50;
	Integer karkasDagingPercentage = 50;

	Integer karkasSayurPercentage = 50;
	Integer karkasTulangSayurPercentage = 60;
	Integer karkasDagingSayurPercentage = 40;
	
	@Override
	public Double calculate(Integer bobot, Integer percentage) {
		// TODO Auto-generated method stub
		return Double.valueOf(((Double.valueOf(bobot)*Double.valueOf(percentage))/100.00));
	}

	@Override
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
	
	public String getWeightClass(Integer bobot) {
		if (bobot>= 90) {
			return "Kelas A";
		} else if (bobot>= 70) {
			return "Kelas B";
		}  else if (bobot>= 50) {
			return "Kelas C";
		}  else {
			return "Kelas D";
		}
	}

}
