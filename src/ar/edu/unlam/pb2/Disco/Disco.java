package ar.edu.unlam.pb2.Disco;
//prueba
public class Disco {
	private Double radioInterior;
	private Double radioExterior;

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Disco() {

	}

	public void calcularPerimetroInterior(Double radioInterior) {
		Double perimetroInterior = (2 * 3.14 * this.radioInterior);

	}

	public void calcularPerimetroExterior(Double radioExterior) {
		Double perimetroExterior = (2 * 3.14 * this.radioExterior);
	}

	public Double calcularSuperficie(Double radioInterior, Double radioExterior) {
		Double superficieTotal = 0.0;
		Double superficie1 = (3.14 * this.radioInterior * this.radioInterior);
		Double superficie2 = (3.14 * this.radioExterior * this.radioExterior);
		if (radioInterior < radioExterior && radioInterior > 0)
			superficieTotal = (superficie2 - superficie1);
		return superficieTotal;
		// return (superficie2 - superficie1);

	}

}