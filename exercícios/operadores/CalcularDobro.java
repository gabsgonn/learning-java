package operadores;/* 1. Função para Calcular o Dobro de um Número
Crie uma função chamada `calcularDobro` que receba um número inteiro como parâmetro e retorne o dobro desse número. Teste a função chamando-a no método `main`.*/

import javax.swing.JOptionPane;

public class CalcularDobro { 

  public static void main(String[] args) {
    calcularDobro();
  }

  public static void calcularDobro() {
    
    // Entrada de valor
    long x = Integer.parseInt(JOptionPane.showInputDialog("Enter your number"));

    // Cálculo
    long y = x * 2;

    // Saída
    JOptionPane.showMessageDialog(null, "Double of your number is "+y);
    
    
  }
}






