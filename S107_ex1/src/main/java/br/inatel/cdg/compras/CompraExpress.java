package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.FreteExpress;

public class CompraExpress extends CarrinhoDeCompras{

    public CompraExpress() {
        frete = new FreteExpress();
    }
}
