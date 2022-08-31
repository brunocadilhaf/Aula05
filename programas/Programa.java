package programas;

import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;
    Pessoa[] lista = new Pessoa[3];
    int i = 0;

    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER q fica na entrada

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
          if (i >= 3) {
            System.out.println("Lista de contatos cheia!");
            break;
          }

          System.out.println("Informe o nome da pessoa:");
          String nome = sc.next();
          System.out.println("Informe o sobrenome da pessoa:");
          String sobrenome = sc.next();
          System.out.println("Informe o telefone da pessoa:");
          String telefone = sc.next();
          
          Pessoa contato = new Pessoa();
          contato.setNome(nome);
          contato.setSobrenome(sobrenome);
          contato.setTelefoneContato(telefone);
          lista[i] = contato;
          i++;
          break;
        case 2:
          for (int j = 0; j < 3; j++){
            Pessoa itemLista = lista[j];
            System.out.println("Contato " + j);
            System.out.println("Contato nome: " + itemLista.getNome());
            System.out.println("Contato sobrenome: " + itemLista.getSobrenome());
            System.out.println("Contato telefone: " + itemLista.getTelefoneContato());
          }
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}