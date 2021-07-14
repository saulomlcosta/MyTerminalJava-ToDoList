/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saulo Costa
 */    


public class TodoList {
  public static void MainMenu()
         {
               System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                 Meu ToDo-List");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n"
                + "1 - Adicionar uma tarefa.\n"
                + "2 - Listar tarefas.\n"
                + "3 - Marcar tarefa como concluída.\n"
                + "4 - Finalizar o dia.\n");
         }

  public static void main(String[] args) {          
    Scanner ler = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    String menuChoice = "0";
    
    MainMenu();
    
    // Declarando e instanciando a lista de tarefas
    ArrayList<String> toDo = new ArrayList();
    
    while (!menuChoice.equals("4")) {
                menuChoice = input.nextLine();

                switch (menuChoice) {                    
                    case "1":
                        System.out.println("Qual tarefa deseja adicionar?");
                        toDo.add(input.nextLine());
                        MainMenu();                       
                        break;
                    case "2":
                         int i;

                    // Mostrando as "n" tarefas (usando o índice)
                    // número de elementos do ArrayList: método size()
                    System.out.printf("Verificando as tarefas pendentes...\n");
                    int n = toDo.size();
                    for (i=0; i<n; i++) {
                      System.out.printf("%d- %s\n", i, toDo.get(i));
                    }                    
                      
                        break;
                    case "3": 
                         System.out.printf("\nInforme a posição a ser excluída:\n");
                            i = ler.nextInt();

                            try {
                              // Remove o i-ésimo contato da lista de tarefas.
                              toDo.remove(i);
                              MainMenu();
                            } catch (IndexOutOfBoundsException e) {
                                // exceção lançada para indicar que um índice (i)
                                // está fora do intervalo válido.
                                System.out.printf("\nErro: posição inválida (%s).",
                                  e.getMessage());
                            }
                        break;
                    case "4":
                          if (toDo.isEmpty()) {
                            System.out.println("Até a próxima !");                            
                          } else {
                            System.out.println("Você tem " + String.valueOf(toDo.size()) + " tarefa(s) para completar antes de ir:");
                            System.out.println("Enter para retornar ao menu");
                            menuChoice = input.nextLine();                            
                            MainMenu();
                              }
                          break;
                  
                    default:
                        System.out.println("Não consegui compreender o que você quer , por gentileza, um número válido.");
                }
            }      
   
    }
  }


    

