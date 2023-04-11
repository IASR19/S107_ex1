package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.FreteFull;

public class CompraFull extends CarrinhoDeCompras{

    public CompraFull() {
        frete = new FreteFull();
    }
}