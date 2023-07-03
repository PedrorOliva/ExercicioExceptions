package exercicioUm;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    ListaCompras lista = new ListaCompras();
    boolean continuar = true;

    while (continuar){
      menuAlimentos(lista);
      System.out.println("Adicionar mais alimentos? Sim ou Não");
      String adiciona = inputUsuario.next();
      if(adiciona.equalsIgnoreCase("Sim")){
        menuAlimentos(lista);
      }else if(adiciona.equalsIgnoreCase("Não")){
        System.out.println("Lista de compras: ");
        lista.mostraLista();
        continuar = false;
        break;
      }
    }

  }
  private static void menuAlimentos(ListaCompras lista){
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Verduras - Legumes - Grãos - Outros");
    System.out.println("Digite a opção desejada: ");
    String escolha = inputUsuario.nextLine();
    try {
      lista.validaTipoAlimento(escolha);
      if (escolha.equalsIgnoreCase("Verduras")) {
        System.out.println("Nome: ");
        String nome = inputUsuario.next();
        System.out.println("Quantidade em gramas: ");

        try {
          double quantidade = inputUsuario.nextDouble();
          lista.validaQtdGrama(quantidade);
          lista.adicionaGrama(nome, quantidade);
        } catch (NumberFormatException e1) {
          System.out.println("Erro: " + e1.getMessage());
        }
      } else if (escolha.equalsIgnoreCase("Legumes")) {
        System.out.println("Nome: ");
        String nome = inputUsuario.next();
        System.out.println("Quantas unidades? ");

        try {
          int quantidade = inputUsuario.nextInt();
          lista.validaQtdUnidade(quantidade);
          lista.adicionaUnidade(nome, quantidade);
        } catch (NumberFormatException e1) {
          System.out.println("Erro: " + e1.getMessage());
        }
      } else if (escolha.equalsIgnoreCase("Grãos")) {
        System.out.println("Nome: ");
        String nome = inputUsuario.next();
        System.out.println("Quantidade em gramas: ");

        try {
          double quantidade = inputUsuario.nextDouble();
          lista.validaQtdGrama(quantidade);
          lista.adicionaGrama(nome, quantidade);
        } catch (NumberFormatException e1) {
          System.out.println("Erro: " + e1.getMessage());
        }
      } else if (escolha.equalsIgnoreCase("Outros")) {
        System.out.println("Nome: ");
        String nome = inputUsuario.next();
        System.out.println("Quantas unidades? ");

        try {
          int quantidade = inputUsuario.nextInt();
          lista.validaQtdUnidade(quantidade);
          lista.adicionaUnidade(nome, quantidade);
        } catch (NumberFormatException e1) {
          System.out.println("Erro: " + e1.getMessage());
        }
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}


