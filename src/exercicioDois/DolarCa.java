package exercicioDois;

import java.math.BigDecimal;

public class DolarCa extends Moeda implements Cotacao{
  @Override
  public String nomeMoeda() {
    return "Dólar canadense";
  }

  @Override
  public BigDecimal valorCotacao() {
    return new BigDecimal("4.15");
  }

  @Override
  public BigDecimal converte(BigDecimal valor) {
    return valor.multiply(valorCotacao());
  }
}
