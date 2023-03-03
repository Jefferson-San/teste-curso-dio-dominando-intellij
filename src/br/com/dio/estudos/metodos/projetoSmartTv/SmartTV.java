package br.com.dio.estudos.metodos.projetoSmartTv;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    int nome;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
        }
    }
    public void diminuirVolume() {
        if (ligada) {
            volume--;
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
        }
    }
    public void diminuirCanal() {
        if (ligada) {
            canal--;
        }
    }
    public void mudarCanal(int numeroCanal) {
        if (ligada) {
            canal = numeroCanal;
        }
    }
}
