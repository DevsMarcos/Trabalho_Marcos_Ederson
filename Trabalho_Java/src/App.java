import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;
        

        do {
            System.out.println("""
                Escolha uma das opções abaixo: 
                1. Adcionar
                2. Listar Todos.
                3. Alterar 
                4. Excluir
                """);
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    
                    break;
                case 2:

                    break;

                case 3: 

                    break;

                case 4: 

                    break;
            
                default:
                    System.out.println("Opção Inválida tenten novamente");
                    break;
            }

        } while (escolha != 5);
    

        
    }
}
