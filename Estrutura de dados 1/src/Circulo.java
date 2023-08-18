
package figurasgeometricas;

public class Circulo  implements Comparable <Circulo>{

    
    private double raio;
    private double coordx;
    private double coordy;

    public Circulo(double x, double y, double r){
        this.coordx = x;
        this.coordy = y;
        this.raio = r;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularVolumeEsfera() {
        return (4*Math.PI*Math.pow(raio, 3)) / 3;
    }

    public void moverCirculo(double novoCoordX, double novoCoordY) {
        this.coordx= novoCoordX;
        this.cooryY = novoCoordY;
    }
@Override
    public String toString() { // serializa a string}
    // funçao que retorno string, dados que quer exibir do objeto, print no objt
       return this.coordx + "" + this.coordy + "" + this.raio;
}

@Override
public int compareTo(Circulo outro) {
   int retorno;
double dif;
dif = this.raio - outro.raio;
retorno = (int) Math.round(dif);
return retorno;
}
}

