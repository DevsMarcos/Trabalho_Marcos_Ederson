import java.util.Scanner;

import Classes.Adicionar;
import Classes.Alterar;
import Classes.ListarTodos;
import Classes.Excluir; 


public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;
        Adicionar listarAdcionar = new Adicionar();
        ListarTodos listarUsuarios = new ListarTodos();
        Alterar listaAlterar = new Alterar();
        Excluir listaExcluir = new Excluir();

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
                    String frase = listarAdcionar.Printar();
                    System.out.println(frase);
                    escolha = 0;
                    break;
                case 2:
                    String fraseUser = listarUsuarios.ListarTodosDaLista(); 
                    System.out.println(fraseUser);
                    escolha = 0;
                    break;

                case 3: 
                String fraseUser2 = listaAlterar.listaAlterar(); 
                System.out.println(fraseUser2);
                escolha = 0;
                break;

                case 4: 
                String fraseUser3 = listaExcluir.listarExcluir(); 
                System.out.println(fraseUser3);
                escolha = 0;
                    break;
            
                default:
                    System.out.println("Opção Inválida tenten novamente");
                    break;
            }

        } while (escolha != 5);
    

        
    }
}
