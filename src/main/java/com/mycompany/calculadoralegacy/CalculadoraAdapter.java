package com.mycompany.calculadoralegacy;

public class CalculadoraAdapter implements Calculadora{
    
    private final SistemaAntiguo sistemaAntiguo;
    
    public CalculadoraAdapter(SistemaAntiguo sistemaAntiguo){
        this.sistemaAntiguo = sistemaAntiguo;
    }
    
    @Override
    public int sumar(int a, int b){
        double resultado = sistemaAntiguo.sumar(a, b);
        
        return (int) resultado;
    }
}


