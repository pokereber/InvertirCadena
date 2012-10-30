/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package invertircadena;

import java.util.Scanner;

/**
 *
 * @author Jorge Dominguez J
 */
public class Invertircadena
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     System.out.print("INSTITUTO TECNOLOGICO SUPERIOR DE ESCRACEGA");
     System.out.print("  JORGE DOMINGUEZ JARAMILLO");
     
     int menu=0;
        Scanner lectura = new Scanner(System.in);
        
          
          menu=lectura.nextInt();
          
          
          switch (menu)
          
          {
              case 1:
                  
                  System.out.print("el programa tiene como objetivo realizar una serie de instrucciones, las cuales se les a asignado un numero ,elija un numero y espere resultados");
                  break;
     case 2:
                  
                  String poke=lectura.next();
                  for(int i=poke.length() - 1; i >= 0; i--)
                  {
                      char c = poke.charAt(i);
                      System.out.print(c);
                  }
                  break;
         case 3:
                     String palabra = lectura.next();
                    System.out.println("El largo de la Cadena es : " + palabra.length());
                 break;
         
    }
}
}
