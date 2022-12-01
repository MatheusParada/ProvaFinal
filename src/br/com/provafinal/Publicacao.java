package br.com.provafinal;

public class Publicacao {
    public static Object getContadorPublicacao;
    public final String textoPublicacao;
    public final String midiaLink;
    public String dataPublicacao;
    public String nomeUsuario;
    public String dataNascimento;
    public String senha;

    public Publicacao(String textoPublicacao, String midiaLink, String dataPublicacao, String nomeUsuario, String dataNascimento, String senha) {
        this.textoPublicacao = textoPublicacao;
        this.midiaLink = midiaLink;
        this.dataPublicacao = dataPublicacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public static double contadorPublicacao;


    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getMidiaLink() {
        return midiaLink;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void setContadorPublicacao(double contadorPublicacao) {
        Publicacao.contadorPublicacao = contadorPublicacao;
    }

    public Publicacao(String textoPublicacao, String midiaLik) {
        this.textoPublicacao = textoPublicacao;
        this.midiaLink = midiaLik;
    }
}


