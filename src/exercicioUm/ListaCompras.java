package exercicioUm;

import java.util.HashMap;
import java.util.Map;

public class ListaCompras extends Valida{

  Valida valida = new Valida();
  Map<String, Double> listaComprasGramas = new HashMap<>();
  Map<String, Integer> listaComprasUnidades = new HashMap<>();

  public void adicionaGrama(String nome, Double grama){
    valida.validaTipoAlimento(nome);
    valida.validaQtdGrama(grama);
    listaComprasGramas.put(nome, grama);
  }

  public void adicionaUnidade(String nome, Integer unidade){
    valida.validaTipoAlimento(nome);
    valida.validaQtdUnidade(unidade);
    listaComprasUnidades.put(nome, unidade);
  }

  public void mostraLista(){
    for (String item: listaComprasGramas.keySet()){
      System.out.println("Nome" + item + " - Quantidade:  " + listaComprasGramas.get(item));
    }
    for (String item: listaComprasUnidades.keySet()){
      System.out.println("Nome" + item + " - Quantidade:  " + listaComprasUnidades.get(item));
    }
  }
}
