package br.com.provafinal;

import java.util.ArrayList;

import static br.com.provafinal.Publicacao.getContadorPublicacao;

public class RedeSocial {

    String dataCriacao;
    String nomeUsuario;
    String dataNascimento;
    String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<> ();


    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha, ArrayList<Publicacao> publicacoes) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = publicacoes;
    }

    public void inserePublicacao(Publicacao publi) {

    }

    public void imprimePublicacoes() {
        getContadorPublicacao = getContadorPublicacao;
    }
}
