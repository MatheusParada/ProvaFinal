package br.com.provafinal;

public class AchadoPerdido {
    String descricao;
    String tipo;
    String status;

    public AchadoPerdido(String descricao, String tipo, String status, String titulo) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
        this.titulo = titulo;
    }
    String titulo;

    String foto;
    String local_achado;
    String data_hora;

    public AchadoPerdido(String foto, String local_achado, String data_hora) {
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
    }
}