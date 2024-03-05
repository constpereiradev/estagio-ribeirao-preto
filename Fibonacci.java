import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int indice = 13;
        int soma = 0;
        int k = 0;
        
        while(k < indice){
            k++;
            soma += k;
        }
        System.out.println("************* Exercício 1 *************");
        System.out.println(soma);
        System.out.println("****************************************");
        
        //Exercício 2
        System.out.println("************* Exercício 2 *************");
        System.out.println("Digite o número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInput = scanner.nextInt();

        if(verificarNumero(numeroInput)){
            System.out.println(numeroInput + " pertence à sequência.");
            System.out.println("****************************************");
        }else {
            System.out.println(numeroInput + " não pertence à sequência.");
            System.out.println("****************************************");
        }
        scanner.close();

        
        //Exercício 3
        System.out.println("************* Exercício 3 *************");
        System.out.println("a) 1, 3, 5, 7, 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64, 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, 77");
        System.out.println("d) 4, 16, 36, 64, 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8, 13");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, 20");
        System.out.println("****************************************");

        //Exercício 4
        System.out.println("************* Exercício 4 *************");
        System.out.println("Ida 1: Ligaria uma lâmpada e deixaria por alguns segundos, " +
        "Ida 2: Ligaria a segunda e deixaria ligada.");
        System.out.println("Conseguiria saber se uma das lâmpadas ficassem acesas ou " +
        "se a lâmpada ainda estivesse quente ao tocar.");
        System.out.println("****************************************");

        //Exercício 5
        System.out.println("************* Exercício 5 *************");
        String string = "Tecnologia da Informação";
        String stringInvertida = "";

        for (int i = string.length() - 1; i >= 0;  i--) {
            stringInvertida += string.charAt(i);
        }
        System.out.println("String invertida: " + stringInvertida);
        System.out.println("****************************************");
    }

    public static boolean verificarNumero(int numero) {
        if (numero == 0 || numero == 1){
            return true;
        }

        int a = 0, b = 1, resultado =  0;
        for (int i = 0; i < numero; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado == numero;
        
    }
}
