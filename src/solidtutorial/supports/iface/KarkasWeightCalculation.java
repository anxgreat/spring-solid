package solidtutorial.supports.iface;

public interface KarkasWeightCalculation {

	Double calculate(Double bobot, Integer percentage);
	Double getKarkasWeight(Integer bobot);
	Double getTulangWeight(Integer bobot);
	Double getDagingWeight(Integer bobot);
}
