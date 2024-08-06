package br.com.rp.controller.resource;

public class MaisVendidos {
    private String produto;
    private Long total;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public MaisVendidos(String produto, Long total) {
        this.produto = produto;
        this.total = total;
    }

    public MaisVendidos() {
    }
}
