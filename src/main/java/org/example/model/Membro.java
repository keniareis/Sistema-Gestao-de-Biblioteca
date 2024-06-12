package org.example.model;

import java.util.UUID;

public class Membro {
        private UUID id;
        private String nome;
        private String endereco;
    private int contato;

    public Membro() {
    }

    public Membro(UUID id, String nome, String endereco, int contato) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }
}