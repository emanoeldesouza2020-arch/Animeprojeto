package org.emanoel.animeprojeto.dto;


public class AnimeRequestDTO {
     private String titulo;
     private String sinopse;
     private Integer Anolancamento;
     private String status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getAnolancamento() {
        return Anolancamento;
    }

    public void setAnolancamento(Integer anolancamento) {
        Anolancamento = anolancamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void atualizarDados(){}


}


