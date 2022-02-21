import java.util.Scanner;
import java.lang.StringBuilder;
public class Desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int n = entrada.nextInt();
        entrada.close();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<=n; i++){
            /**
             * Preenchimento da String utilizando espaços.
             */
            str.append(" ");
        }

        for(int i=n-1; i>=0; i--){
            /**
             * Substituição dos espaços por asteriscos (*) das respectivas linhas.
             */
            str.deleteCharAt(i);
            str.append("*");
            System.out.println(str);
        }
    }
}