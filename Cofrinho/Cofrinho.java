package Cofrinho;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe "Cofrinho" representa um cofrinho que contém uma coleção de moedas.
 * Ela fornece métodos para adicionar e remover moedas, listar as moedas e
 * calcular o valor total das moedas.
 */
public class Cofrinho {

    private List<Moeda> moedas;

    /**
     * Cria um cofrinho vazio.
     */
    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    /**
     * Método para adicionar moedas ao cofre
     */
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    /**
     * Método para remover moedas do cofre
     */
    public void remover(Moeda moeda) {
        moedas.remove(moeda);
    }

    /**
     * Método para listar as moedas do cofre
     */
    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda.getInfo());
        }
    }

    /**
     * Método que calcula o valor total das moedas em reais
     */
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
