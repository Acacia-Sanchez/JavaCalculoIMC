package org.factoriaf5.javaimc;

public class JavaimcApplication {

	public String calculoIMC(double weight, double height) {

		double imc = weight / Math.pow(height, 2);

		if (imc < 16) {
			return "Delgadez severa";
		} else if (imc < 17) {
			return "Delgadez moderada";
		} else if (imc < 18.5) {
			return "Delgadez leve";
		} else if (imc < 25) {
			return "Peso normal";
		} else if (imc < 30) {
			return "Sobrepeso";
		} else if (imc < 35) {
			return "Obesidad leve";
		} else if (imc < 40) {
			return "Obesidad moderada";
		} else if (imc > 40) {
			return "Obesidad mórbida";
		} else {
			return "Estás fuera de rango";
		}

	}
}
