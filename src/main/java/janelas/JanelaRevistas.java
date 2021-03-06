package janelas;

import servicos.ServicoRevista;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaRevistas extends JanelaInput {

    JLabel rotuloOrgao = new JLabel();
    JLabel rotuloVolume = new JLabel();
    JLabel rotuloNumero = new JLabel();

    JTextField campoOrgao = new JTextField();
    JTextField campoVolume = new JTextField();
    JTextField campoNumero = new JTextField();

    JButton botaoLivros = new JButton("Livros");

    ServicoRevista servicoRevista;

    public JanelaRevistas(EntityManager entityManager) {
        super(entityManager);
        servicoRevista = new ServicoRevista(entityManager);
        montaTitulo();
        montaBotoes(botaoLivros);
        montaCabecalho("Revistas");
        montaAno();
        montaNumero();
        montaOrgao();
        montaVolume();
        montaFrameInput();
    }

    private void montaAno() {
        configuraRotulo(rotuloAno, "Ano:", 20);
        rotuloAno.setBounds(325,130, 50, 25);
        add(rotuloAno);
        campoAno.setBounds(375, 130, 95, 25);
        add(campoAno);
    }

    private void montaNumero() {
        configuraRotulo(rotuloNumero, "Nro.:", 20);
        rotuloNumero.setBounds(170,130, 65, 25);
        add(rotuloNumero);
        campoNumero.setBounds(225, 130, 60, 25);
        add(campoNumero);
    }

    private void montaOrgao() {
        configuraRotulo(rotuloOrgao, "Org:", 20);
        rotuloOrgao.setBounds(20,90, 65, 25);
        add(rotuloOrgao);
        campoOrgao.setBounds(90, 90, 380, 25);
        add(campoOrgao);
    }

    private void montaVolume() {
        configuraRotulo(rotuloVolume, "Vol.:", 20);
        rotuloVolume.setBounds(20,130, 65, 25);
        add(rotuloVolume);
        campoVolume.setBounds(90, 130, 60, 25);
        add(campoVolume);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source.equals(botaoLivros))
            trocaParaJanelaLivros();
        else if (source.equals(botaoListagem))
            trocaParaJanelaListagem();
        else if (source.equals(botaoIncluir)) {
            tentaIncluirRevistaNoAcervo();
        }
    }

    private void trocaParaJanelaLivros() {
        dispose();
        new JanelaLivros(entityManager);
    }

    private void tentaIncluirRevistaNoAcervo() {
        try {
            validaParseInteiros();
            apresentaTelaOpcional();
        } catch (Exception excecaoTratadaNaFuncaoDValidaParse){}
    }

    private void validaParseInteiros() throws Exception {
        validaParseInteiroCampoAno();
        try {
            Integer.parseInt(campoVolume.getText());
            Integer.parseInt(campoNumero.getText());
        } catch (NumberFormatException erroParse) {
            JOptionPane.showMessageDialog(
                    this,
                    "Campos n??mero e volume devem ser n??meros v??lidos",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
    }

    private void apresentaTelaOpcional() {
        String titulo = campoTitulo.getText();
        String orgao = campoOrgao.getText();
        int ano = Integer.parseInt(campoAno.getText());
        int volume = Integer.parseInt(campoVolume.getText());
        int numero = Integer.parseInt(campoNumero.getText());
        try {
            servicoRevista.adicionaRevista(titulo, ano, orgao, volume, numero);
            JOptionPane.showMessageDialog(this, "Revista adicionada ao acervo.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
        } catch (Exception campoInvalido) {
            JOptionPane.showMessageDialog(this, campoInvalido.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void limpaCampos() {
        limpaCamposComuns();
        campoOrgao.setText("");
        campoVolume.setText("");
        campoNumero.setText("");
    }
}
