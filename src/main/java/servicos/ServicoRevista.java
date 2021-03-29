package servicos;

import dados.Revista;
import repositorio.RepositorioRevista;
import validadores.ValidadorObraLiteraria;

import javax.persistence.EntityManager;

public class ServicoRevista {

    private RepositorioRevista repositorioRevista;

    public ServicoRevista(EntityManager entityManager) {
        repositorioRevista = new RepositorioRevista(entityManager);
    }

    public void adicionaRevista(String titulo, int ano, String orgao, int volume, int numero) throws Exception {
        validaCamposRevista(titulo, ano, orgao, volume, numero);
        Revista revista = new Revista(titulo, ano, orgao, volume, numero);
        repositorioRevista.save(revista);
    }

    private void validaCamposRevista(String titulo, int ano, String orgao, int volume, int numero) throws Exception {
        ValidadorObraLiteraria.validaNegativo(volume, "Volume");
        ValidadorObraLiteraria.validaNegativo(numero, "Número");
        ValidadorObraLiteraria.validaAno(ano);
        ValidadorObraLiteraria.validaStringVazia(titulo, "Titulo");
        ValidadorObraLiteraria.validaStringVazia(orgao, "Orgão");
    }
}
