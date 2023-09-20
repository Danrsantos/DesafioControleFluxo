import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digeite sou sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //Imprimindo dados:
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " m ");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");

        }

    }
}