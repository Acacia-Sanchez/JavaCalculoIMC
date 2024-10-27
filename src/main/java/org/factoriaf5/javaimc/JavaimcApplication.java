package org.factoriaf5.javaimc;

public class JavaimcApplication {

	public static void main(String[] args) {

		double weight = 29;
		double height = 1.55;
		double imc;

		imc = weight / height;
		System.out.println(imc);

		int imcRedondeado = (int) Math.round(imc); // redondea el entero más cercano
		System.out.println(imcRedondeado);

		if (imcRedondeado < 16) {
			String tabla1 = "Delgadez severa";
			System.out.println(tabla1);
		} else if (imcRedondeado == 16 || imcRedondeado < 17) {
			String tabla2 = "Delgadez moderada";
			System.out.println(tabla2);
		} else if (imcRedondeado == 17 || imcRedondeado < 18.5) {
			String tabla3 = "Delgadez leve";
			System.out.println(tabla3);
		} else if (imcRedondeado == 18.5 || imcRedondeado < 25) {
			String tabla4 = "Peso normal";
			System.out.println(tabla4);
		} else if (imcRedondeado == 25 || imcRedondeado < 30) {
			String tabla5 = "Sobrepeso";
			System.out.println(tabla5);
		} else if (imcRedondeado == 30 || imcRedondeado < 35) {
			String tabla6 = "Obesidad leve";
			System.out.println(tabla6);
		} else if (imcRedondeado == 35 || imcRedondeado < 40) {
			String tabla7 = "Obesidad moderada";
			System.out.println(tabla7);
		} else {
			String tabla8 = "Obesidad mórbida";
			System.out.println(tabla8);
		}

	}
}
