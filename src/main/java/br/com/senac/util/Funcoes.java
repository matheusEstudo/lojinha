package br.com.senac.util;

public class Funcoes {

    public static boolean quantidadeCaracteres(String texto, int quantidade) {
        return texto.length() >= quantidade;
    }

    public static boolean validarCpf(String texto, int quantidade) {
        return texto.length() == quantidade;
    }

}
