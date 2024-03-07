package Cofrinho;

import Cofrinho.Moedas.Dolar;
import Cofrinho.Moedas.Euro;
import Cofrinho.Moedas.Real;

/**
 * Classe que contém o método principal para execução do programa.
 */
public class Principal {
    public static void main(String[] args) {
        // cria uma instância de um novo cofrinho
        Cofrinho cofrinho = new Cofrinho();
        Real real = new Real(6.12);
        Dolar dolar = new Dolar(20.0);
        Euro euro = new Euro(42.0);

        // adiciona algumas moedas ao cofrinho
        cofrinho.adicionar(real);
        cofrinho.adicionar(dolar);
        cofrinho.adicionar(euro);

        // remove a moeda Real do cofrinho
        cofrinho.remover(real);

        // lista as moedas no cofrinho
        cofrinho.listarMoedas();

        // exibe o valor total das moedas convertido para Real
        System.out.println("Total em reais: " + cofrinho.totalConvertido());
    }

}
