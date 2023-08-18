public class figurasgeometricas {
    

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
                   Circulo [] figuras; // cria vetor
                   int tam;
                   double x, y,r;
                   Circulo c;
                   System.out.println("informe a quantidade de circulos:");
                   tam = sc.nextInt();
                   figuras = new Circulo[tam];
                   for (int index = 0; index < figuras.length; index++) { // dados de preenchimento
                    System.out.println("circulos numero:" + (index+1));
                    System.out.println("a cordenada x: ");
                    x = sc.nextDouble();
                    System.out.println("a cordenada y: ");
                    y = sc.nextDouble();
                    System.out.println("o raio: ");
                    r = sc.nextDouble();
                    c = new Circulo(x,y,r);
                    figuras[index] = c; // enserir obj o vetor
                   }
                   for (int index = 0; index < figuras.length; index++) {
                    System.out.println(figuras[index]); // retorno do tostring 
    
                   }
                }
            }
        

