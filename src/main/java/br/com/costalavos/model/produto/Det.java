package br.com.costalavos.model.produto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Det {

    @JsonProperty("produto")
    private Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
