package exercicioDois;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MoedaController {

  public void MenuUsuario(){
    System.out.println("** === Bem vindo ao conversor de moedas === **");
    System.out.println("Esse conversor só sabe converter dinhairo para Real (R$)!!");
    System.out.println("Moedas disponíveis: \nDólar Americano \nDólar Canadense \nEuro \nLibra Esterlina");
  }

  public void validaMoeda(String escolha){
    if(!escolha.equalsIgnoreCase("Dolar americano") &&
        !escolha.equalsIgnoreCase("Dolar " +
        "canadense") && !escolha.equalsIgnoreCase("Euro")&&
        !escolha.equalsIgnoreCase(
            "Libra esterlina")){
      throw new IllegalArgumentException("Tipo de moeda inválido");
    }
  }

  public void validaValor(BigDecimal valor){
    if(valor == null){
      throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal.");
    }
    if(valor.compareTo(BigDecimal.ZERO) <= 0){
      throw new NumberFormatException("Valor inválido, por favor tente novamente.");
    }
  }

  public BigDecimal conversor(Moeda escolha, BigDecimal valor) {
    BigDecimal valorConveritdo = escolha.valorCotacao();
    return valor.multiply(valorConveritdo).setScale(2, RoundingMode.HALF_EVEN);
  }
  public String fomataValor(BigDecimal valor){
    DecimalFormat formatter = new DecimalFormat("#,##0.00");
    return formatter.format(valor);
  }
}
