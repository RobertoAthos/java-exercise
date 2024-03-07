package Cofrinho.Moedas;

import Cofrinho.Moeda;

/**
 * A classe Real representa uma moeda do tipo Real  brasileiro.
 * Ela herda da classe abstrata Moeda.
 */
public class Real extends Moeda {

    /**
     * Cria uma nova instância da classe Real com o valor especificado.
     * 
     * @param valor O valor da moeda Real.
     */
    public Real(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna uma string com as informações da moeda Real.
     * 
     * @return Uma string contendo o tipo da moeda e o seu valor.
     */
    @Override
    public String getInfo() {
        return "Moeda: Real | Valor: " + valor;
    }

    /**
     * Converte o valor da moeda Real para Real.
     * 
     * @return O valor da moeda Real.
     */
    @Override
    public double converterParaReal() {
        return valor;
    }
}
