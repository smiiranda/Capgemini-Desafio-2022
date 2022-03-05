import java.util.Scanner;

public class TurmaB_Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores do array separados por espaco: ");
        String[] input = scanner.nextLine().split(" ");
        System.out.println("\nDigite o valor de x: ");
        int x = scanner.nextInt();
        scanner.close();
        
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]-arr[j] == x){
                    count++;
                }
                
            }
        }
        
        System.out.println("\nSaida: "+count);
    }
}