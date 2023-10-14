import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o nome do Ganhador");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade em anos luz");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura em anos luz");
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
            }
            catch(InputMismatchException exception){
            System.err.println("Digita correto usa numero ok?");
        }
        }
        
        
    }

