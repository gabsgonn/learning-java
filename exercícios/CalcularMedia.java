/*
### **3. Função para Calcular a Média de Três Números**
Escreva uma função chamada `calcularMedia` que receba três números
decimais como parâmetros e retorne a média deles.*/

import javax.swing.JOptionPane;

public class CalcularMedia {

    public static void main(String[] args) {
        calcularMedia();
    }

    public static void calcularMedia() {

        // Apresentação do programa:
        JOptionPane.showMessageDialog(null, "Calcular Média de Três Números");

        // Entrada dos números:
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        Double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));

        // Calculo:
        double num4 = num1+num2+num3;
        double media = num4/3;

        // Saída
        JOptionPane.showMessageDialog(null,
                "A média dos números:\n"+num1+", "+
                        num2+" e "+num3+" é:\n"+media);

    }
}
