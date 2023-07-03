package exercicioDois;

import java.math.BigDecimal;

public class Euro extends Moeda implements Cotacao{
  @Override
  public String nomeMoeda() {
    return "Euro";
  }

  @Override
  public BigDecimal valorCotacao() {
    return new BigDecimal("6.15");
  }

  @Override
  public BigDecimal converte(BigDecimal valor) {
    return valor.multiply((valorCotacao()));
  }
}
