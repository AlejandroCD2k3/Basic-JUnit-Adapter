package com.mycompany.calculadoralegacy;

public class CalculadoraAdapter implements Calculadora{
    
    private final SistemaExterno sistemaExterno;
    
    public CalculadoraAdapter(SistemaExterno sistemaExterno){
        this.sistemaExterno = sistemaExterno;
    }
    
    @Override
    public int sumar(int a, int b){
        double resultado = sistemaExterno.sumar(a, b);
        
        return (int) resultado;
    }
}






