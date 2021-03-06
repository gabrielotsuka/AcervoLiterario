package dados;

import javax.persistence.Entity;

@Entity
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

    public Revista() {
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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