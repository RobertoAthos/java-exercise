package Cofrinho.Moedas;

import Cofrinho.Moeda;

/**
 * A classe Dolar representa uma moeda do tipo Dólar.
 * Essa classe herda da classe Moeda e implementa métodos específicos para o Dólar.
 */
public class Dolar extends Moeda {

    private static final double VALOR_DOLAR = 4.93;

    /**
     * Cria uma nova instância da classe Dolar com o valor especificado.
     * 
     * @param valor O valor da moeda em Dólar.
     */
    public Dolar(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna uma string contendo informações sobre a moeda Dólar.
     * 
     * @return Uma string no formato "Moeda: Dolar | Valor: {valor}".
     */
    @Override
    public String getInfo() {
        return "Moeda: Dolar | Valor: " + valor;
    }

    /**
     * Converte o valor da moeda Dólar para Real.
     * 
     * @return O valor convertido para Real.
     */
    @Override
    public double converterParaReal() {
        return valor * VALOR_DOLAR;
    }
}
