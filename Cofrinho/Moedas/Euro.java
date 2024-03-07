package Cofrinho.Moedas;

import Cofrinho.Moeda;

/**
 * A classe Euro representa uma moeda do tipo Euro.
 * 
 * Esta classe herda da classe Moeda e implementa métodos específicos para a moeda Euro.
 */
public class Euro extends Moeda {

    private static final double VALOR_EURO = 5.40;

    /**
     * Cria uma nova instância da classe Euro com o valor especificado.
     * 
     * @param valor O valor da moeda Euro.
     */
    public Euro(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna uma string contendo informações sobre a moeda Euro.
     * 
     * @return Uma string no formato "Moeda: Euro | Valor: {valor}".
     */
    @Override
    public String getInfo() {
        return "Moeda: Euro | Valor: " + valor;
    }

    /**
     * Converte o valor da moeda Euro para Real.
     * 
     * @return O valor convertido para Real.
     */
    @Override
    public double converterParaReal() {
        return valor * VALOR_EURO;
    }
}
