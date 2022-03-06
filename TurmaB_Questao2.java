import java.util.Scanner;

public class TurmaB_Questao2 {
    public static void main(String[] args) {

             
        // Leitura dos Valores 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores do array separados por espaco: ");
        String[] input = scanner.nextLine().split(" ");  // Faz a leitura da string e a divide em um array. 
        
        System.out.println("\nDigite o valor de x: ");
        int x = scanner.nextInt();  // Leitura de números inteiros.


        scanner.close(); // fechamento do scanner que foi aberto.
        
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            // Transformando o array de strings em um array de inteiros.

            arr[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Verificação da diferença dos números, onde caso seja igual a x, irá somar +1 ao contador.

                if(arr[i]-arr[j] == x){
                    count++;
                }
                
            }
        }
        
        System.out.println("\nSaida: "+count);
    }
}