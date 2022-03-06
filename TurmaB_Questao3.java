import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TurmaB_Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a string de abertura: ");
        String input = scanner.nextLine();
        scanner.close();
        
        
        // Retirando os espaços " " da string utilizando replace().
         
        input = input.replace(" ", "");

        /** 
         * Lista para guardar a grid, ou seja, organizar os componentes divididos pela raiz quadrada.
         * */ 
        List<String> subs = new ArrayList<>();
        String result = "";


        // Cáculo da raiz quadrada.
        int raizInput = (int) Math.ceil(Math.sqrt(input.length())); 
        

        // Criando e organizando em divisões a grid da string, a partir da raiz quadrada.
        for (int start = 0; start <= input.length(); start += raizInput) {
            if(start+raizInput > input.length()){
                subs.add(input.substring(start, start+(input.length()) - start));
            }
            else 
                subs.add(input.substring(start, start+raizInput));
        }


        // Utilizando as regras para junção das colunas do grid, em direção ao resultado final.
        for (int i = 0; i < subs.size(); i++) {
            for (int j = 0; j < raizInput; j++) {
                
                if(subs.get(j).length() > i){
                    result += subs.get(j).toCharArray()[i];
                }
            }
            result += " ";
        }

        // Resultado final
        System.out.println("\nSaida: "+result);
    }

}