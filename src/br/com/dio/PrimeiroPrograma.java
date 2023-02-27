package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        int a = 4;
        int b = 3;
        System.out.println("Hello world " + (a + b));
        Book book = new Book("O problema dos 3 corpos",300);
        System.out.println(book);
    }
}
class Book {
    private String name;
    private Integer numPg;

    public Book(String name, Integer numPg) {
        this.name = name;
        this.numPg = numPg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPg() {
        return numPg;
    }

    public void setNumPg(Integer numPg) {
        this.numPg = numPg;
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", numPg=" + numPg +
            '}';
    }
}