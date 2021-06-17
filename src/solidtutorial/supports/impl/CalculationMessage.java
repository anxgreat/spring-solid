package solidtutorial.supports.impl;

public class CalculationMessage extends AnimalData {
	
	public String getMessage() {
		String message = "<br><br><br><div style='text-align:center;'>"
				+ "<h2>Domba "+spesies+" Bobot = "+bobot+"</h3>"
					+ "<h3>Total Pakan Konsentrat = " +konsentratWeight+"</h3>"
					+ "<h3>Total Pakan Hijauan = " +hijauanWeight+"</h3>"
					+ "<h3>Total Daging = " +dagingWeight+"</h3>"
					+ "<h3>Total Tulang = " +tulangWeight+"</h3>"
				+ "<h3>"
				+ "	<a href=\"http://localhost:8080/solidtutorial\">Kembali</a>" 
				+ "	</h3>"
				+ "</div><br><br>";
		return message;
	}
}
