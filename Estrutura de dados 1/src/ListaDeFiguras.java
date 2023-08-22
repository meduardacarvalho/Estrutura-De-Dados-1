import figurasgeometricas.Circulo;

public class ListaDeFiguras {
    private int qtd;
private Circulo [ ] dados;
public ListaDeFiguras (int tam) { // Construtor da classe ListaDeFiguras
this.dados = new Circulo[tam]; // não esquecer do this
}
// FUNÇÃO DE INSERÇÃO
public void inserir(Circulo circulo) { //verificar se vetor ta cheio
    if (this.qtd == this.dados.length) { // LEMBRAR!!!!!!!!!!!!!!
        System.out.println("lista cheia. inserção não efetuada");
    }  
    else {
       this.dados[this.qtd] = circulo; // LEMBRAR DO THIS
        this.qtd++;
        System.out.println("inserção efetuada");
    }
}
// FUNÇÃO DE EXIBIÇÃO 
  public void exibir() {
    for (int i = 0; i < this.qtd; i++) { // nao esquecer do this, 
        //como a inserção é de um em um tem que ser pela quantidade senão aparece vetor null
      System.out.println(this.dados[i]);
    }
  }
  public void ordenar(int[] figuras) {
    
    for (int i = 0; i < qtd - 1; i++) {
        for (int j = 0; j < qtd - i - 1; j++) {
          if (dados[j].getRaio() > dados[j + 1].getRaio()) {
            Circulo temp = dados[j];
            dados[j] = dados[j + 1];
            dados[j + 1] = temp;
            }
        }
    }
  }

}