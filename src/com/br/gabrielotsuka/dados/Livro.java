package com.br.gabrielotsuka.dados;

public class Livro extends ObraLiteraria {
    private String autor;

    public Livro(String autor, String titulo, int ano) {
        super(titulo, ano);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro:" +
                "\n   Titulo: " + titulo +
                "\n   Autor: " + autor +
                "\n   Ano: " + ano + "\n\n";
    }
}
