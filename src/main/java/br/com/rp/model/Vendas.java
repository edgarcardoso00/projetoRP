package br.com.rp.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Vendas {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "meses", updatable = false, nullable = false)
    private LocalDateTime meses;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "produto_id", updatable = false, nullable = false)
    private Produto produto;

    @Column(name = "total", nullable = false)
    private Long total;

    public LocalDateTime getMeses() {
        return meses;
    }

    public void setMeses(LocalDateTime meses) {
        this.meses = meses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotal() {
        return total;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Vendas(Long id, Produto produto, Long total, LocalDateTime meses) {
        this.id = id;
        this.produto = produto;
        this.total = total;
        this.meses = meses;
    }

    public Vendas() {
    }
}
