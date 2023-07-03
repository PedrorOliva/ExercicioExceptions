package exercicioDois;

import java.math.BigDecimal;

public class LibraEs extends Moeda implements Cotacao{
  @Override
  public String nomeMoeda() {
    return "Libra esterlina";
  }

  @Override
  public BigDecimal valorCotacao() {
    return new BigDecimal("7.50");
  }

  @Override
  public BigDecimal converte(BigDecimal valor) {
    return valor.multiply(valorCotacao());
  }
}
