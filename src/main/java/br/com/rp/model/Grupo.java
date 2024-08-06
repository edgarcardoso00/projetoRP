package br.com.rp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

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

    public Grupo(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Grupo() {
    }

    public Grupo(Long id) {
        this.id = id;
    }
}
