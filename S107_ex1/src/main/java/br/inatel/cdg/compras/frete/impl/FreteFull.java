package br.inatel.cdg.compras.frete.impl;

import br.inatel.cdg.compras.Frete;


public class FreteFull implements Frete {
    @Override
	public double calculaFrete(double peso) {
		double valor = 5.55;
		return peso * valor;
	}
    
}
