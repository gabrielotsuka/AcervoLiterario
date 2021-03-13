package com.br.gabrielotsuka.data;

public class Revista extends ObraLiteraria {
    private String orgao;
    private Integer volume;
    private Integer numero;

    public Revista(String titulo, Integer ano, String orgao, Integer volume, Integer numero) {
        super(titulo, ano);
        this.orgao = orgao;
        this.volume = volume;
        this.numero = numero;
    }
}
