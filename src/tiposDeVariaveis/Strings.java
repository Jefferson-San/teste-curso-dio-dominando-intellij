package tiposDeVariaveis;

public class Strings {
    public static void main(String[] args) {
        String x = "Eu sou o jefferson";
        String z = "Eu sou muito lindo";
        int len = x.length();
        String toUperCase = x.toUpperCase();
        String toLowCase = x.toLowerCase();
        int index = x.indexOf("J");
        String concatenacao = x.concat(" ").concat(z);
        String a = "13";
        int b = 7;

        System.out.println(len);
        System.out.println(toUperCase);
        System.out.println(toLowCase);
        System.out.println(index);
        //System.out.println(x.concat(" e ").concat(z));
        System.out.println(x + " " + z);
        System.out.println(x + " " + z);

        System.out.println(a + b);

    }
}
