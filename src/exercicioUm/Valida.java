package exercicioUm;

public class Valida {

  public String validaTipoAlimento(String nomeAlimento){
    if(nomeAlimento.isEmpty()){
      throw new IllegalArgumentException("Nenhuma opção digitada!");
    }
    else if(!nomeAlimento.equalsIgnoreCase("Verduras")&&
        !nomeAlimento.equalsIgnoreCase("Legumes") &&
        !nomeAlimento.equalsIgnoreCase("Grãos") &&
        !nomeAlimento.equalsIgnoreCase("Outros")) {
      throw new IllegalArgumentException("Tipo de alimento inválido!");
    }
    return nomeAlimento;
  }

  public int validaQtdUnidade(int unidadeAlimento){
    if(Math.floor(unidadeAlimento) != unidadeAlimento){
      throw new NumberFormatException("Para legumes ou outros, a quantidade deve ser informada em unidades.");
    }
    return unidadeAlimento;
  }

  public double validaQtdGrama(double gramaAlimento){
    if(gramaAlimento == (int)gramaAlimento){
      throw new NumberFormatException("Para verduras e grãos, a quantidade deve ser informada com ponto.");
    }
    return gramaAlimento;
  }
}
