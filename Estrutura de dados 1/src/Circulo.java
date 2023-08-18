
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
    public double circuferencia () {
       
        return coordx;


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

