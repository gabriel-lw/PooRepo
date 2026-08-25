
package org.example;

public class App {
   

    public static void main(String[] args) {

        System.out.println("AAAAAAAAAAAA");


        Caneta bic = new Caneta("verde", 80); //verde 80
        Caneta bic2 = new Caneta( 40); //azul 40
        Caneta bic3 = new Caneta(); // azul 100


        System.out.println( bic3.desenhar(5, 7, 105, 7)); // 1%
        System.out.println( bic3.desenhar(5, 7, 5, 107)); // 1%

        System.out.println( bic3.desenhar(5, 8, 11, 16)); // 0.1%
        //distancia = raiz quadrada de 100
        //distancia = 10
        //return 10. 0.01 == 0.1 

        System.out.println( bic3.desenhar(5, 8, 11, 16999999));
        //nao dá


        System.out.println(bic);

       




        
    }
}
