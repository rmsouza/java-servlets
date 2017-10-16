/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ra21067003
 */
public class Acao {
    private String codigo;
    private double precoMin;
    private double precoMax;
    private double precoAbertura;
    private double precoFechamento;
    
    public Acao (String codigo, double precoMin, double precoMax, double precoAbertura, double precoFechamento) {
        this.codigo = codigo;
        this.precoMin = precoMin;
        this.precoMax = precoMax;
        this.precoAbertura = precoAbertura;
        this.precoFechamento = precoFechamento;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the precoMin
     */
    public double getPrecoMin() {
        return precoMin;
    }

    /**
     * @param precoMin the precoMin to set
     */
    public void setPrecoMin(double precoMin) {
        this.precoMin = precoMin;
    }

    /**
     * @return the precoMax
     */
    public double getPrecoMax() {
        return precoMax;
    }

    /**
     * @param precoMax the precoMax to set
     */
    public void setPrecoMax(double precoMax) {
        this.precoMax = precoMax;
    }

    /**
     * @return the precoAbertura
     */
    public double getPrecoAbertura() {
        return precoAbertura;
    }

    /**
     * @param precoAbertura the precoAbertura to set
     */
    public void setPrecoAbertura(double precoAbertura) {
        this.precoAbertura = precoAbertura;
    }

    /**
     * @return the precoFechamento
     */
    public double getPrecoFechamento() {
        return precoFechamento;
    }

    /**
     * @param precoFechamento the precoFechamento to set
     */
    public void setPrecoFechamento(double precoFechamento) {
        this.precoFechamento = precoFechamento;
    }
    
    
}
