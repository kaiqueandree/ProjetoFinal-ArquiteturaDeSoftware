package br.usjt.Veiculos.model.utils;

public class Calculadora {
	public double calculaMedia (double...notas) {
	double m = 0;
	for (Double d : notas) {
		m += d;
	}
		return m / notas.length;
	}
}
