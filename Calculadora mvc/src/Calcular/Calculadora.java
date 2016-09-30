package Calcular;

import CalculadoraControlador.Gestionador;
import CalculadoraModelo.CalculadoraModel;
import CalculadoraVista.CalculadoraVista;

public class Calculadora 
{
	private int edad;
	
	public Calculadora(String cadena)
	{
		System.out.println("Hola Mundo!!!" + cadena);
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edadPersona)
	{
		edad = edadPersona;
	}
	
	public static void main(String args[])
	{
		Calculadora a = new Calculadora("kevin");
		a.setEdad(15);
		System.out.println(a.getEdad());
		
		CalculadoraModel modelo = new CalculadoraModel();
		CalculadoraVista vista = new CalculadoraVista();
		new Gestionador(vista, modelo);
	}
}
