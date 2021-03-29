package janelas;

import repositorio.RepositorioLivro;
import servicos.ServicoLivro;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaLivros extends JanelaInput {

    JLabel rotuloAutor = new JLabel();

    JTextField campoAutor = new JTextField();

    JButton botaoRevistas = new JButton("Revistas");

    ServicoLivro servicoLivro;
    RepositorioLivro repositorioLivro;

    public JanelaLivros(EntityManager entityManager) {
        super(entityManager);
        repositorioLivro = new RepositorioLivro(entityManager);
        servicoLivro = new ServicoLivro(entityManager);
        montaCabecalho("Livros");
        montaAno();
        montaAutor();
        montaTitulo();
        montaBotoes(botaoRevistas);
        montaFrameInput();
    }

    private void montaAno() {
        configuraRotulo(rotuloAno, "Ano:", 20);
        rotuloAno.setBounds(20,130, 65, 25);
        add(rotuloAno);
        campoAno.setBounds(90, 130, 60, 25);
        add(campoAno);
    }

    private void montaAutor() {
        configuraRotulo(rotuloAutor, "Autor:", 20);
        rotuloAutor.setBounds(20,90, 65, 25);
        add(rotuloAutor);
        campoAutor.setBounds(90, 90, 380, 25);
        add(campoAutor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(botaoRevistas)) {
            trocaParaJanelaRevistas();
        } else if (source.equals(botaoListagem)) {
            trocaParaJanelaListagem();
        } else if (source.equals(botaoIncluir)) {
            tentaIncluirLivroNoAcervo();
        }
    }

    private void trocaParaJanelaRevistas() {
        dispose();
        new JanelaRevistas(entityManager);
    }

    private void tentaIncluirLivroNoAcervo() {
        try {
            validaParseInteiroCampoAno();
            apresentaTelaOpcional();
        } catch (Exception excecaoTratadaNaFuncaoValidaParse) {}
    }

    private void apresentaTelaOpcional() {
        int ano = Integer.parseInt(campoAno.getText());
        String autor = campoAutor.getText();
        String titulo = campoTitulo.getText();
        try {
            servicoLivro.adicionaLivro(autor, titulo, ano);
            JOptionPane.showMessageDialog(this, "Livro adicionado ao acervo.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
        } catch (Exception campoInvalido) {
            JOptionPane.showMessageDialog(this, campoInvalido.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpaCampos() {
        limpaCamposComuns();
        campoAutor.setText("");
    }
}
