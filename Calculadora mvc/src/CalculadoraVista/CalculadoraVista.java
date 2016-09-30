package CalculadoraVista;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraVista extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2435933797062667994L;

	Container bloqueContenedor = null;
	
	public JTextField campoNumero1 = null;
	public JTextField campoNumero2 = null;
	public JTextField campoResultado = null;
	
	private final JLabel LNUMERO_UNO = new JLabel("Numero 1:");
	private final JLabel LNUMERO_DOS = new JLabel("Numero 2:");
	private final JLabel LRESULTADO = new JLabel("resultado:");
	
	public final JButton BSUMAR = new JButton("Sumar");
        public final JButton BMULTIPLICAR = new JButton("Multiplicar");
	
	public CalculadoraVista()
	{
		bloqueContenedor = getContentPane();
		setTitle("Calculadora UCATEC");
		setLayout(new FlowLayout());
		setSize(220,200);
		
		campoNumero1 = new JTextField("",10);
		campoNumero2 = new JTextField("",10);
		campoResultado = new JTextField("",10);
		
		bloqueContenedor.add(LNUMERO_UNO);
		bloqueContenedor.add(campoNumero1);
		
		bloqueContenedor.add(LNUMERO_DOS);
		bloqueContenedor.add(campoNumero2);
		
		bloqueContenedor.add(LRESULTADO);
		bloqueContenedor.add(campoResultado);	
		
		bloqueContenedor.add(BSUMAR);
                bloqueContenedor.add(BMULTIPLICAR);
		setVisible(true);
	}
}
