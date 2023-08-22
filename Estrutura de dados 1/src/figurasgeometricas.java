import java.util.Scanner;

import figurasgeometricas.Circulo;

public class figurasgeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo[] figuras;
        int tam, op ;
        double x, y, r;
        Circulo c;
        
        System.out.println("informe o tamanho da lista de figuras:");
        tam = sc.nextInt();
       ListaDeFiguras Circulo = new ListaDeFiguras(tam);

       do {
    menu();
  } while (op != 0);
       
               public static void menu() {
              System.out.println("opções: ");

                                         }


        for (int index = 0; index < figuras.length; index++) {
            System.out.println("Círculo número " + (index+1));
            System.out.println("Coordenada x: ");
            x = sc.nextDouble();
            System.out.println("Coordenada y: ");
            y = sc.nextDouble();
            System.out.println("Raio: ");
            r = sc.nextDouble();
            c = new Circulo(x, y, r);
            figuras[index] = c;
        }
        for (int index = 0; index < figuras.length; index++) {
            System.out.println(figuras[index]);
        }
        
        sc.close();
    }
}

        

