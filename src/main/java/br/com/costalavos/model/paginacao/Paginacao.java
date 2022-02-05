package br.com.costalavos.model.paginacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paginacao {
    @JsonProperty("pagina")
    private int pagina;

    @JsonProperty("registros_por_pagina")
    private int registros_por_pagina;

    @JsonProperty("apenas_importado_api")
    private char apenas_importado_api;

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getRegistros_por_pagina() {
        return registros_por_pagina;
    }

    public void setRegistros_por_pagina(int registros_por_pagina) {
        this.registros_por_pagina = registros_por_pagina;
    }

    public char getApenas_importado_api() {
        return apenas_importado_api;
    }

    public void setApenas_importado_api(char apenas_importado_api) {
        this.apenas_importado_api = apenas_importado_api;
    }
}
