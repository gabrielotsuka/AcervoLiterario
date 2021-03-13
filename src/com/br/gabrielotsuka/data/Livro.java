package com.br.gabrielotsuka.data;

public class Livro extends ObraLiteraria {
    private String autor;

    public Livro(String autor, String titulo, Integer ano) {
        super(titulo, ano);
        this.autor = autor;
    }
}
