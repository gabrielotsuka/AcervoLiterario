package com.br.gabrielotsuka.validadores;

import java.util.Calendar;

public class ValidadorObraLiteraria {

    public static void validaStringVazia(String campo, String nomeCampo) throws Exception {
        if (campo.isEmpty())
            throw new Exception(nomeCampo + " não pode ser vazio.");
    }

    public static void validaAno(int ano) throws Exception {
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        if (ano > anoAtual) {
            throw new Exception("Ano não pode ser maior que ano atual.");
        }
    }

    public static void validaNegativo(int campo, String nomeCampo) throws Exception {
        if (campo < 0) {
            throw new Exception(nomeCampo + " deve ser maior que zero");
        }
    }
}
