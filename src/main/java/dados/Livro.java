package dados;

import javax.persistence.Entity;

@Entity
public class Livro extends ObraLiteraria {
    private String autor;

    public Livro(String autor, String titulo, int ano) {
        super(titulo, ano);
        this.autor = autor;
    }

    public Livro() {}

    @Override
    public String toString() {
        return "Livro:" +
                "\n   Titulo: " + titulo +
                "\n   Autor: " + autor +
                "\n   Ano: " + ano + "\n\n";
    }
}
