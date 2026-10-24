package org.emanoel.animeprojeto.dto;

public class AnimeResponseDTO<Lond> {
    private Lond id ;
    private String titulo;
    private String sinopse;
    private Integer AnoLancamento;
    private String status;

    public Lond getId() {
        return id;
    }

    public void setId(Lond id) {
        this.id = id;
    }

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

    public Integer getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        AnoLancamento = anoLancamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void atualizarDados(){}
}
