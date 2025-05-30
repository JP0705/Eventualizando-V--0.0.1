package com.Eventualizando.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private LocalDate data;
    @Column(length = 1000)
    private String imagemUrl;
    @Column(length = 1000)
    private String localizacaoUrl;
    @Lob
    private String descricao;

    // Getters e Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getImagemUrl() { return imagemUrl; }
    public void setImagemUrl(String imagemUrl) { this.imagemUrl = imagemUrl; }

    public String getLocalizacaoUrl() { return localizacaoUrl; }
    public void setLocalizacaoUrl(String localizacaoUrl) { this.localizacaoUrl = localizacaoUrl; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}