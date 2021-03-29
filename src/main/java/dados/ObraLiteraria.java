package dados;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ObraLiteraria implements Serializable {
    @Id
    @GeneratedValue
    private Long idObraLiteraria;
    protected String titulo;
    protected int ano;

    public ObraLiteraria() {}

    public ObraLiteraria(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Long getIdObraLiteraria() {
        return idObraLiteraria;
    }

    public void setIdObraLiteraria(Long idObraLiteraria) {
        this.idObraLiteraria = idObraLiteraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
