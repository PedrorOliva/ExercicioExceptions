package exercicioDois;

import java.math.BigDecimal;

public interface Cotacao {
  public abstract BigDecimal valorCotacao();
  public abstract BigDecimal converte(BigDecimal valor);
}
