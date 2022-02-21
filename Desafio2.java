import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        boolean senhaSegura = false;
        Scanner scanner = new Scanner(System.in);

        while(!senhaSegura){
            // Laço de repetição até que a senha cumpra todos os critérios
            System.out.print("Digite a senha: ");
            String entrada = scanner.nextLine();

            int faltaCriterio = 0;
            // Utilizado como contador que será somado a cada critério NÃO atendido.

            // Condicionais com cada critério utilizando expressões regulares
            if (!entrada.matches("(.*)[0-9](.*)")) {
                faltaCriterio++;
            }
            if (!entrada.matches("(.*)[a-z](.*)")) {
                faltaCriterio++;
            }
            if (!entrada.matches("(.*)[A-Z](.*)")) {
                faltaCriterio++;
            }
            if (!entrada.matches("(.*)[!@#$%^&*()-+](.*)")) {
                faltaCriterio++;
            }

            // Cálculo para o caso da senha ser menor do que 6
            if (entrada.length() + faltaCriterio < 6) {
                faltaCriterio = 6 - (entrada.length() + faltaCriterio) + faltaCriterio;
            }

            System.out.print(faltaCriterio);
            System.out.println("");

            if (faltaCriterio == 0) {
                // Caso todos os critérios forem atendidos, o laço se encerrará, sendo assim uma senha segura
                senhaSegura = true;
            }
        }
        System.out.println("Senha segura!");
        scanner.close();
    }
}