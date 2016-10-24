package Calcular;

import CalculadoraControlador.Gestionador;
import CalculadoraModelo.CalculadoraModel;
import CalculadoraVista.CalculadoraVista;

public class Calculadora 
{
    public static void main(String args[])
    {
        CalculadoraModel modelo = new CalculadoraModel();
        CalculadoraVista vista = new CalculadoraVista();
        new Gestionador(vista, modelo);
    }
}
