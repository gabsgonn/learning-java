package operadores;// ** AJUDA DO GPT **
/* 1. Função para Calcular o Dobro de um Número
Crie uma função chamada `calcularDobro` que receba um número inteiro como parâmetro e retorne o dobro desse número. Teste a função chamando-a no método `main`.*/

import javax.swing.JOptionPane;

public class Palindromo {

    public static void main(String[] args) {
        ehPalindromo();
    }

    public static boolean ehPalindromo() {

        // Entrada de valor
        String palavra = JOptionPane.showInputDialog("Enter your word");

        // Cálculo
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = palavra.length() - 1;

        // Saída
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                JOptionPane.showMessageDialog(null, "No, this word isn't a Palindromo:\n"+palavra);
                return false;
            }
            inicio++;
            fim--;
        }

        JOptionPane.showMessageDialog(null,  "Yes, this word is a Palindromo:\n"+palavra);
        return true;

    }
}

/*
public static boolean ehPalindromo(String palavra) {
    // Remove espaços e converte para letras minúsculas
    palavra = palavra.replaceAll("\\s+", "").toLowerCase();

    int inicio = 0;
    int fim = palavra.length() - 1;

    while (inicio < fim) {
        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false; // Não é palíndromo
        }
        inicio++;
        fim--;
    }

    return true; // É palíndromo
}*/