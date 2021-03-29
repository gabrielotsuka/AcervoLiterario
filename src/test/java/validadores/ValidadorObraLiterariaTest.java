package validadores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.fail;

class ValidadorObraLiterariaTest {

    String NOME_CAMPO = "nomeQualquer";

    @Test
    void validaStringVazia_campoPreenchido() {
        try {
            String campo = "campoPreenchido";
            ValidadorObraLiteraria.validaStringVazia(campo, NOME_CAMPO);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

    @Test
    void validaStringVazia_campoVazio() {
        try {
            String campo = "";
            ValidadorObraLiteraria.validaStringVazia(campo, NOME_CAMPO);
            fail("Should throw exception");
        } catch (Exception e) {
            Assertions.assertEquals(NOME_CAMPO + " não pode ser vazio.", e.getMessage());
        }
    }

    @Test
    void validaNegativo_campoPositivo() {
        try {
            int campo = 0;
            ValidadorObraLiteraria.validaNegativo(campo, NOME_CAMPO);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

    @Test
    void validaNegativo_campoNegativo() {
        try {
            int campo = -1;
            ValidadorObraLiteraria.validaNegativo(campo, NOME_CAMPO);
            fail("Should throw exception");
        } catch (Exception e) {
            Assertions.assertEquals(NOME_CAMPO + " deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void validaAno_anoMenorQueAtual() {
        try {
            int ano = 0;
            ValidadorObraLiteraria.validaAno(ano);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

    @Test
    void validaAno_anoMaiorQueAtual() {
        try {
            Calendar calendar = Calendar.getInstance();
            int ano = calendar.get(Calendar.YEAR) + 1;
            ValidadorObraLiteraria.validaAno(ano);
            fail("Should throw exception");
        } catch (Exception e) {
            Assertions.assertEquals("Ano não pode ser maior que ano atual.", e.getMessage());
        }
    }
}