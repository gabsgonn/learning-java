/*
### **5. Função para Calcular o Fatorial de um Número**
Implemente uma função chamada `calcularFatorial` que receba um número inteiro positivo e retorne o fatorial desse número. O fatorial de `n` é calculado como `n! = n * (n-1) * (n-2) * ... * 1`.
*/

import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {
        numeroFatorial();
    }

    public static void numeroFatorial() {

        // Apresentação do programa:
        JOptionPane.showMessageDialog(null, "Calcular Fatorial de um Número");

        // Entrada do número:
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu número"));

        // Cálculo:
        double f = num1;
        while (num1>1){
        f = f * (num1-1);
        num1--;
        }

        // Saída:
        JOptionPane.showMessageDialog(null, "O Fatorial do seu número é: "+f+".");

    }
}
