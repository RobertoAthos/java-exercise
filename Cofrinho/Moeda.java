package Cofrinho;

/**
 * Classe abstrata que representa uma moeda.
 */
public abstract class Moeda {

    protected double valor;

    /**
     * Retorna informações sobre a moeda.
     * 
     * @return informações sobre a moeda.
     */
    public abstract String getInfo();

    /**
     * Converte o valor da moeda para a moeda Real.
     * 
     * @return valor da moeda convertido para Real.
     */
    public abstract double converterParaReal();
}
