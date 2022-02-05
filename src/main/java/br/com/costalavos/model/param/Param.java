package br.com.costalavos.model.param;

public class Param {
    private int pagina;
    private int registroPorPagina;
    private char apenasImportadoApi;

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getRegistroPorPagina() {
        return registroPorPagina;
    }

    public void setRegistroPorPagina(int registroPorPagina) {
        this.registroPorPagina = registroPorPagina;
    }

    public char getApenasImportadoApi() {
        return apenasImportadoApi;
    }

    public void setApenasImportadoApi(char apenasImportadoApi) {
        this.apenasImportadoApi = apenasImportadoApi;
    }
}
