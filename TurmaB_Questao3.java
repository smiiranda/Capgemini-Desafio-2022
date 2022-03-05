import java.util.Arrays;
import java.util.Scanner;

public class TurmaB_Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = Arrays.toString(scanner.nextLine().split(" ")).replace("[", "").replace("]", "").replace(", ", "");
        scanner.close();

        int raizInput = (int) Math.ceil(Math.sqrt(input.length()));

        
        System.out.println(raizInput);
    }
}
