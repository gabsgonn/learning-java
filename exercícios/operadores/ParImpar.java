package operadores;/*
### **2. Função para Verificar se um Número é Par ou Ímpar**
Implemente uma função chamada `ehPar` que receba um número inteiro e retorne
`true` se ele for par, ou `false` caso contrário. Use essa função para imprimir
uma mensagem no método main.
*/

import javax.swing.JOptionPane;

public class ParImpar { 

  public static void main(String[] args) {
    ehPar();
  }


  public static void ehPar() {
    
    // Entrada de valor
    int x = Integer.parseInt(JOptionPane.showInputDialog("Enter your number"));

    // Cálculo e Saída
    if (x % 2 == 0) {
    JOptionPane.showMessageDialog(null, "Result is true!"+"\n"+x+" is Par.");
    }
    else { 
    JOptionPane.showMessageDialog(null, "Result is false!"+"\n"+x+" is Impar.");
  }
}
}
