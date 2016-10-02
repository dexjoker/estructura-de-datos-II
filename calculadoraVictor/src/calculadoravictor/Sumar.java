/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoravictor;

/**
 *
 * @author JOKER
 */
public class Sumar {
    public double num1;
    public double num2;
    
    public Sumar(){}
    public Sumar(double numero1,double numero2){
        this.num1=numero1;
        this.num2=numero1;
        
         
     }

     public static double suma1N(double a,double b){
     if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma1N(a, b - 1);
        }
      }
 public Double obtenerSuma(){
   return this.num1;
   //return this.num2;
  }
    
}
         
    
    
