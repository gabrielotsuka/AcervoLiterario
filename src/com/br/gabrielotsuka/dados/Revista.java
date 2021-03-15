package com.br.gabrielotsuka.dados;

public class Revista extends ObraLiteraria {
    private String orgao;
    private int volume;
    private int numero;

    public Revista(String titulo, int ano, String orgao, int volume, int numero) {
        super(titulo, ano);
        this.orgao = orgao;
        this.volume = volume;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista:" +
                "\n   Titulo: " + titulo +
                "\n   Ano: " + ano +
                "\n   Orgao: " + orgao +
                "\n   Volume: " + volume +
                "\n   Numero: " + numero + "\n\n";
    }
}
