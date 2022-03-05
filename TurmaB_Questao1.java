import java.util.Arrays;
import java.util.Scanner;

public class TurmaB_Questao1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os numeros do array separados por espaço: ");
        String input = scanner.nextLine();
        String[] arrInput = input.split(" ");
        scanner.close();

        if (arrInput.length % 2 == 0) {
            System.out.println("Error! Digite uma quantidade impar de numeros");
        }else{

            int[] arr = new int[arrInput.length];
    
            for (int i = 0; i < arrInput.length; i++) {
    
                arr[i] = Integer.parseInt(arrInput[i]);
            }
            
            Arrays.sort(arr);
            System.out.println("Mediana -> " + arr[(arr.length -1) / 2]);
        }
        
    }
}