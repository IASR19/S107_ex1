package br.inatel.cdg.teste.compras;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import br.inatel.cdg.compras.CompraGratuita;
import br.inatel.cdg.compras.CompraTrans;
import br.inatel.cdg.compras.CompraFull;
import br.inatel.cdg.compras.CompraExpress;
import br.inatel.cdg.compras.frete.impl.FreteExpress;
import br.inatel.cdg.compras.frete.impl.FreteFull;
import br.inatel.cdg.compras.frete.impl.FreteGratuito;
import br.inatel.cdg.compras.frete.impl.FreteTrans;
import org.junit.Test;
import br.inatel.cdg.compras.CarrinhoDeCompras;

public class TestCarrinhoDeCompras {
	
	CarrinhoDeCompras carrinhoDeCompras;
	
	@Test
	public void testeCompraExpress() {
		carrinhoDeCompras = new CompraExpress();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FreteExpress);
	}

	@Test
	public void testeCompraExpressValor() {
		carrinhoDeCompras = new CompraExpress();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 250.0, 0.1);

	}

	@Test
	public void testeCompraTrans() {
		carrinhoDeCompras = new CompraTrans();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FreteTrans);
	}

	@Test
	public void testeCompraTransValor() {
		carrinhoDeCompras = new CompraTrans();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 229.0, 0.1);

	}

	@Test
	public void testeCompraFull() {
		carrinhoDeCompras = new CompraFull();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FreteFull);
	}

	@Test
	public void testeCompraFullValor() {
		carrinhoDeCompras = new CompraTrans();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 229.0, 0.1);

	}

	@Test
	public void testeCompraGratuita() {
		carrinhoDeCompras = new CompraGratuita();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FreteGratuito);
	}

	@Test
	public void testeCompraGrauitoValor() {
		carrinhoDeCompras = new CompraGratuita();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 100.0, 0.1);

	}
}
