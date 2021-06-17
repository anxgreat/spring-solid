package solidtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import solidtutorial.supports.impl.CalculationMessage;
import solidtutorial.supports.impl.FoodCalculationImpl;
import solidtutorial.supports.impl.WeightCalculationGarutImpl;
import solidtutorial.supports.impl.WeightCalculationSayurImpl;

@Controller
public class CalculationController extends CalculationMessage{

	@RequestMapping("/calculation")
	public ModelAndView garutCalculation(@RequestParam("type") String spesies, @RequestParam("bobot") Integer bobot) {
		FoodCalculationImpl foodCalculationImpl = new FoodCalculationImpl();
		this.bobot = bobot;
		this.konsentratWeight = foodCalculationImpl.getKonsentratCalculate(bobot);
		this.hijauanWeight = foodCalculationImpl.getHijauanCalculate(bobot);
		if (spesies.equals("garut")) {
			WeightCalculationGarutImpl weightCalculationGarutImpl = new WeightCalculationGarutImpl();
			this.dagingWeight =  weightCalculationGarutImpl.getDagingWeight(bobot);
			this.tulangWeight =  weightCalculationGarutImpl.getTulangWeight(bobot);
		} else if(spesies.equals("sayur")) {
			WeightCalculationSayurImpl weightCalculationSayurImpl = new WeightCalculationSayurImpl();
			this.dagingWeight =  weightCalculationSayurImpl.getDagingWeight(bobot);
			this.tulangWeight =  weightCalculationSayurImpl.getTulangWeight(bobot);
		} else {
			this.dagingWeight = Double.valueOf(0);
			this.tulangWeight = Double.valueOf(0);
		}
		
		return new ModelAndView("calculation", "message", this.getMessage());
	}
}
