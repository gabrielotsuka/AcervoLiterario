package dados;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ObraLiteraria implements Serializable {
    @Id
    private Long idObraLiteraria;
    protected String titulo;
    protected int ano;

    public ObraLiteraria() {}

    public ObraLiteraria(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

}
