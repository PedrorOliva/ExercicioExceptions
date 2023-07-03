package exercicioDois;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    MoedaController controller = new MoedaController();

    controller.MenuUsuario();
    try {
      Scanner inputUsuario = new Scanner(System.in);
      System.out.println("Informe qual moeda deseja converter: ");
      String escolha = inputUsuario.nextLine();
      controller.validaMoeda(escolha);


      System.out.println("Informe o valor que deseja converter: ");
      String valorAConverter = inputUsuario.nextLine();
      BigDecimal valor = new BigDecimal(valorAConverter);
      controller.validaValor(valor);
      //controller.conversor(escolha ,valor);
      controller.fomataValor(valor);
    } catch (NumberFormatException e) {
      System.out.println("Erro: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
