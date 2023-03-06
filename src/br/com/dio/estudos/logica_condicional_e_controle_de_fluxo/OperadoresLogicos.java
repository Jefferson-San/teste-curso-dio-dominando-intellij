package br.com.dio.estudos.logica_condicional_e_controle_de_fluxo;
public class OperadoresLogicos {
    public static void main(String[] args) {
        /*Operadores lógicos são aqueles que aplicam logica a nossa aplicação:
        %% -> and, || -> or.*/
        boolean x = true;
        boolean c = false;
        boolean z = true;
        boolean b = false;

        String resultado = x && z ? "essa espressão é verdadeira" : "essa expressão " +
            "é falsa";
        System.out.println(resultado);
    }
}