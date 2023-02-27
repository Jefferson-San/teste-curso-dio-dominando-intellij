package br.com.dio.model;

public class Gato {
    private String name;
    private String color;
    private Integer old;

    public Gato() {

    }

    public Gato(String name, String color, Integer old) {
        this.name = name;
        this.color = color;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }
}

