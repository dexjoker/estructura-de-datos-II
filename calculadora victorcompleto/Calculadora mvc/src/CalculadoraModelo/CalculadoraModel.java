package CalculadoraModelo;

public class CalculadoraModel 
{
   
//--------------------------- RECURSIVIDIDAD  ----------------------------------
    public int  factorialRecursivo(int numero1)
    {
         if(numero1 == 0)  
         return 1;
          else
           return numero1 *factorialRecursivo(numero1-1);
        
    }
    public int  sumaRecursiva(int numero1,int numero2)
    {
     
     if (numero2== 0) {
            return numero1;
        } else if (numero1 == 0) {
            return numero2;
        } else {
            return 1 + sumaRecursiva(numero1, numero2 - 1);
        }
      }
    public int  fibonacciRecursivo(int numero1)
    {
        if (numero1 == 0 || numero1 == 1) 
        {
            return 1;
        }
        else
        {
            return fibonacciRecursivo(numero1-1) + fibonacciRecursivo(numero1-2);
        }
    }
}