package br.com.dio.estudos;

public class TiposVariaveis {
    /*Variaveis do tipo number:
        inteiros:
            byte, short, int, long.
        fracionados:
            float, double.
    Existe casting de variáveis do tipo number:
        O casting de variaveis de um tipo menor para o maior acontece de maneira
        automática;
        Já o casting de variaveis de um tipo maior para o menor deve ser feira de
        forma manual:
            ex: */
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }

}
