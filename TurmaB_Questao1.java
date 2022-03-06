import java.util.Arrays;
import java.util.Scanner;

public class TurmaB_Questao1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os numeros do array separados por espaço: ");
        String input = scanner.nextLine();            // lê a string até encontrar uma quebra de linha. 


        String[] arrInput = input.split(" ");        /* Divisão  do texto em todo lugar que houver um espaço “ ”,
                                                        separando o array por palavra. */

        scanner.close(); // fechamento do scanner que foi aberto

        if (arrInput.length % 2 == 0) { 
        // Verificação do número de elementos para permitir apenas quantidades ímpares 
        
            System.out.println("Error! Digite uma quantidade impar de numeros");
        }else{

            int[] arr = new int[arrInput.length];
    
            for (int i = 0; i < arrInput.length; i++) {
        // Transformando o array de strings em um array de inteiros 
    
                arr[i] = Integer.parseInt(arrInput[i]);
            }
            
            Arrays.sort(arr); // Método para ordenação crescente do array 

            System.out.println("Mediana -> " + arr[(arr.length -1) / 2]);
        }
        
    }
}