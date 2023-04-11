package br.inatel.cdg.compras.frete.impl;

import br.inatel.cdg.compras.Frete;


public class FreteTrans implements Frete {
    @Override
	public double calculaFrete(double peso) {
		double valor = 2.29;
		return peso * valor;
	}
    
}
