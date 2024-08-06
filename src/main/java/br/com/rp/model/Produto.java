package br.com.rp.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "grupo_id", updatable = false, nullable = false)
    private Grupo grupo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Produto(Long id, String description, BigDecimal preco, Grupo grupo) {
        this.id = id;
        this.descricao = description;
        this.preco = preco;
        this.grupo = grupo;
    }

    public Produto() {
    }

    public Produto(Long id) {
        this.id = id;
    }
}
