package CalculadoraControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CalculadoraModelo.CalculadoraModel;
import CalculadoraVista.CalculadoraVista;

public class Gestionador implements ActionListener   
{
	CalculadoraVista uiCalculadora = null;
	CalculadoraModel objModelo = null;
	public Gestionador(CalculadoraVista uiCalc, CalculadoraModel objModelo)
	{
		uiCalculadora = uiCalc;
		this.objModelo = objModelo;
		actionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
                    if(e.getSource() == uiCalculadora.BSUMAR)
                    {
			//Capturar los numeros desde la vista
			String numero1 = this.uiCalculadora.campoNumero1.getText();
			String numero2 = this.uiCalculadora.campoNumero2.getText();
			int resultado = this.objModelo.sumarDosEnteros(numero1, numero2);
			uiCalculadora.campoResultado.setText(""+resultado);
                     
                    }
                    if(e.getSource() == uiCalculadora.BMULTIPLICAR)
                    {
			//Capturar los numeros desde la vista
			String numero1 = this.uiCalculadora.campoNumero1.getText();
			String numero2 = this.uiCalculadora.campoNumero2.getText();
			int resultado = this.objModelo.sumarDosEnteros(numero1, numero2);
			uiCalculadora.campoResultado.setText("holas "+resultado);
                     
                    }                    
		}
		catch(Exception objException)
		{
			objException.printStackTrace();
		}
		
	}
	
	public void actionListener(ActionListener escuchador)
	{
		uiCalculadora.BSUMAR.addActionListener(escuchador);
                uiCalculadora.BMULTIPLICAR.addActionListener(escuchador);
	}

}
