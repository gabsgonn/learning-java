/*1. Soma dos Números de 1 até N
Crie um programa que receba um número inteiro `N` e calcule a soma de todos os números de 1 até `N` utilizando uma função chamada `calcularSoma`.
*/

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        // calcularSoma();
	
    }

    public static int 

    public static int calcularSoma() {
	Scanner scanner = new Scanner(System.in);
	
	// entrada do número inteiro
	System.out.println("Digite um número: ");
	int sumN = scanner.nextInt();
	int f = sumN;

	// Enquanto o número for maior que 1, somar outra função com o mesmo valor dele a ele
        while (sumN>1){
        f = f + (sumN-1);
        sumN--;
        }

	System.out.println(f);
	
	scanner.close();
	
	return sumN;
    }
}


/*
import java.util.Scanner;

public class Ambiente {
    public static void main(String[] args) {
        calcularSoma();
    }

    public static int calcularSoma() {
	// Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Perguntando o nome
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        // Perguntando a idade
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        // Exibindo a mensagem final
        System.out.println("Olá " + nome + ", você tem " + idade + " anos de idade.");

        // Fechando o scanner
        scanner.close();
    }
}

*/

/*
Aqui estão 5 exercícios matemáticos básicos que você pode implementar em Java para praticar:
1. Soma dos Números de 1 até N
Crie um programa que receba um número inteiro `N` e calcule a soma de todos os números de 1 até `N` utilizando uma função chamada `calcularSoma`.

---

### **2. Verificar se um Número é Primo**
Implemente uma função chamada `ehPrimo` que receba um número inteiro e determine se ele é primo ou não. O programa deve imprimir uma mensagem indicando o resultado.

---

### **3. Tabuada de um Número**
Crie uma função chamada `gerarTabuada` que receba um número inteiro como parâmetro e imprima a tabuada desse número de 1 a 10.

---

### **4. Maior Divisor Comum (MDC)**
Escreva uma função chamada `calcularMDC` que receba dois números inteiros como parâmetros e retorne o maior divisor comum entre eles. Utilize o algoritmo de Euclides para a solução.

---

### **5. Soma dos Dígitos de um Número**
Implemente uma função chamada `somaDigitos` que receba um número inteiro positivo e calcule a soma de todos os seus dígitos. Por exemplo, se o número for 123, o resultado deve ser 1 + 2 + 3 = 6.

---

* */

/*
O erro no código ocorre porque o método `calcularSoma` foi declarado como retornando um `int`, mas ele não está retornando nenhum valor. Em Java, quando você declara o retorno de um método como `int`, é obrigatório que o método tenha uma instrução `return` que forneça um valor inteiro.

### Correção:

Se você não precisa que o método retorne um valor, altere o tipo de retorno para `void`. O código corrigido ficaria assim:

```java
import java.util.Scanner;

public class Ambiente {
    public static void main(String[] args) {
        calcularSoma();
    }

    public static void calcularSoma() {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Perguntando o nome
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        // Perguntando a idade
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        // Exibindo a mensagem final
        System.out.println("Olá " + nome + ", você tem " + idade + " anos de idade.");

        // Fechando o scanner
        scanner.close();
    }
}
```

Se você realmente deseja que o método retorne um valor inteiro (por exemplo, a idade), adicione uma instrução `return` no método e ajuste seu uso no método `main`:

```java
import java.util.Scanner;

public class Ambiente {
    public static void main(String[] args) {
        int idade = calcularSoma();
        System.out.println("A idade retornada foi: " + idade);
    }

    public static int calcularSoma() {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Perguntando o nome
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        // Perguntando a idade
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        // Exibindo a mensagem final
        System.out.println("Olá " + nome + ", você tem " + idade + " anos de idade.");

        // Fechando o scanner
        scanner.close();

        // Retornando a idade
        return idade;
    }
}
```
*/