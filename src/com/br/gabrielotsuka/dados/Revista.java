package com.br.gabrielotsuka.dados;

public class Revista extends ObraLiteraria {
    private String orgao;
    private String volume;
    private String numero;

    public Revista(String titulo, String ano, String orgao, String volume, String numero) {
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
