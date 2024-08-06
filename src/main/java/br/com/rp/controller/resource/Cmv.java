package br.com.rp.controller.resource;

public class Cmv {
    private String mes;
    private Long total;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cmv(String mes, Long total) {
        this.mes = mes;
        this.total = total;
    }

    public Cmv() {
    }
}
