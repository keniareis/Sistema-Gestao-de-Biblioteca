package org.example.model;

import java.util.Date;
import java.util.UUID;

public class Emprestimo {
    private UUID id;
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(UUID id, Livro livro, Membro membro, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
