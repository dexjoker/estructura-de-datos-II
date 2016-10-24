
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
              if(e.getSource() == uiCalculadora.BSUMARECURSIVA)
                {
                    String numero1 = this.uiCalculadora.campoNumero1.getText();
                    String numero2 = this.uiCalculadora.campoNumero1.getText();
                    int resultado = this.objModelo.sumaRecursiva(Integer.parseInt(numero1),Integer.parseInt(numero2));
                    uiCalculadora.campoResultado.setText(""+resultado);
                }  
                if(e.getSource() == uiCalculadora.BFACTORIALRECURSIVO)
                {
                    String numero1 = this.uiCalculadora.campoNumero1.getText();
                    int resultado = this.objModelo.factorialRecursivo(Integer.parseInt(numero1));
                    uiCalculadora.campoResultado.setText(""+resultado);
                }  
                if(e.getSource() == uiCalculadora.BFIBONACCIRECURSIVO)
                {
                    String numero1 = this.uiCalculadora.campoNumero1.getText();
                    int resultado = this.objModelo.fibonacciRecursivo(Integer.parseInt(numero1));
                    uiCalculadora.campoResultado.setText(""+resultado);
                }  
            }
            catch(Exception objException)
            {
                    objException.printStackTrace();
            }
		
	}	
	public void actionListener(ActionListener escuchador)
	{
            uiCalculadora.BSUMARECURSIVA.addActionListener(escuchador);
            uiCalculadora.BFACTORIALRECURSIVO.addActionListener(escuchador);
            uiCalculadora.BFIBONACCIRECURSIVO.addActionListener(escuchador);
	}
}
