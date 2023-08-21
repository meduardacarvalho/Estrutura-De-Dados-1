public class ListaDeFiguras {
    private int qtd;
private Circulo [ ] dados;
public ListaDeFiguras (int tam) { // Construtor da classe ListaDeFiguras
dados = new Circulo[tam];
}
public void inserir(Circulo circulo) {
    dados[qtd] = circulo;
    qtd++;
  }
  public void exibir() {
    for (int i = 0; i < qtd; i++) {
      System.out.println(dados[i]);
    }
  }
  public void ordenar() {
    for (int i = 0; i < figuras.length-1; i++) {
        for (int j = 0; j < figuras.length-i-1; j++) {
            if (figuras[j].calcularArea() > figuras[j+1].calcularArea()) {
                Circulo temp = figuras[j];
                figuras[j] = figuras[j+1];
                figuras[j+1] = temp;
            }
        }
    }
  }

}