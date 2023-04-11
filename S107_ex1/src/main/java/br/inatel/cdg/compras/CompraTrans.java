package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.FreteTrans;

public class CompraTrans extends CarrinhoDeCompras{

    public CompraTrans() {
        frete = new FreteTrans();
    }
}