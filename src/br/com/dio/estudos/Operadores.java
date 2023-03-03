package br.com.dio.estudos;

public class Operadores {
    public static void main(String[] args) {
        /*Operadores Lógicos*/
        /*String nome = "Jefferson" + 12;
        System.out.println(nome);
        /////////////////////*/

        /*int number = 4;

        System.out.println(++number);
        System.out.println(number);*/

        //negação:

        /*boolean variavel;

        //System.out.println(!variavel);
        System.out.println(variavel);*/

        //operador ternario:
        /*//o operador ternario ajuda a gente a colocar um valor em uma variavel atravez de uma condicao mais
        //enxuta:
        int a = 13;
        int b = 123;
        String resultado = a != b ? "verdadeiro" : "falso";

        System.out.println(resultado);*/

        boolean number = false;
        boolean numberTwo = true;

        if (number || numberTwo) {
            System.out.println("Uma das variaveis é verdadeira");
        }
    }
}
