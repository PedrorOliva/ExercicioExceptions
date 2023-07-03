package exercicioDois;

import java.math.BigDecimal;

public class DolarAm extends Moeda implements Cotacao{
  @Override
  public String nomeMoeda() {
    return "Dólar americano";
  }

  @Override
  public BigDecimal valorCotacao() {
    return new BigDecimal("5.25");
  }

  @Override
  public BigDecimal converte(BigDecimal valor) {
    return valor.multiply(valorCotacao());
  }
}
