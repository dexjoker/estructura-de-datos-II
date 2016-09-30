/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoravictor;

/**
 *
 * @author Laboratorio5Pc8
 */
public class Sumar {public double num1;
    public double num2;
    public double resultado;
    public Sumar(){}
    public Sumar(double numero1){
        this.num1=numero1;
         
     }

     public static double suma1N(double n){
                if(n == 1)  //caso base
              return 1;
           else
              return n + suma1N(n-1);
    }
    public Double obtenerSuma(){
    return this.num1;
    }
    
}
         