package br.com.dio.estudos.logica_condicional_e_controle_de_fluxo;
public class OperadoresLogicos {
    public static void main(String[] args) {
        /*Operadores lógicos são aqueles que aplicam logica a nossa aplicação:
        %% -> and, || -> or.*/
        /*boolean x = true;
        boolean c = false;
        boolean z = true;
        boolean b = false;

        String resultado = x && z ? "essa espressão é verdadeira" : "essa expressão " +
            "é falsa";
        System.out.println(resultado);*/
        //if - else
        int month = 8;
        String day = "Tuesday";
        int number = 1;

        if (month == 1){
            System.out.println("Janeiro, Mês de férias");
        }else if (month == 2){
            System.out.println("Fevereiro");
        }else if (month == 3){
            System.out.println("Março");
        }else if (month == 4){
            System.out.println("Abriu");
        }else if (month == 5){
            System.out.println("Maio");
        }else if (month == 6){
            System.out.println("Junho");
        }else if (month == 7){
            System.out.println("Julho, Mês de férias");
        }else if (month == 8){
            System.out.println("Agosto");
        }else if (month == 9){
            System.out.println("Setembro");
        }else if (month == 10){
            System.out.println("Outubro");
        }else if (month == 11){
            System.out.println("Novembro");
        }else if (month == 12){
            System.out.println("Dezembro, Mês de férias");
        }

        switch (day) {
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor inválido!");
        }

        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }
        String month2 = "Agosto";
        switch ("Dezembro"){
            case "Dezembro":
            case "Janeiro":
            case "Julho":
                System.out.println("Mês de férias!");
                break;
            default:
                System.out.println("Comportamento inesperado");
        }

        //Swich:
        /*String name = "lindo";
        switch ( "buenos dias" ) {
            case "pá":
                System.out.println("eu sou o jonatam");
                break;
            case "joao":
                System.out.println("eu sou o joao");
                break;
            case "lindo":
                System.out.println("eu sou o lindo");
                break;
            case "Jefferson":
                System.out.println("Eu sou o Jefferson");
                break;
            default:
                System.out.println("Não consegui encontrar nada");
        }*/
    }
}