package CalculadoraVista;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraVista extends JFrame
{
	Container bloqueContenedor = null;
        
	public JTextField campoNumero1 = null;
	public JTextField campoNumero2 = null;
	public JTextField campoResultado = null;
	
	private final JLabel LNUMERO_UNO = new JLabel("Numero 1:");
	private final JLabel LNUMERO_DOS = new JLabel("Numero 2:");
	private final JLabel LRESULTADO = new JLabel("Resultado:");
	      
        public final JButton BSUMARECURSIVA = new JButton("Suma");
        public final JButton BFACTORIALRECURSIVO = new JButton("Factorial");
        public final JButton BFIBONACCIRECURSIVO = new JButton("Fibonacci");
        
	public CalculadoraVista()
	{
		bloqueContenedor = getContentPane();
		setTitle("Calculadora TOTAL ENGINEERING ");
		setLayout(new FlowLayout());
		setSize(500,500);
		
		campoNumero1 = new JTextField("",10);
		campoNumero2 = new JTextField("",10);
		campoResultado = new JTextField("",10);
		
		bloqueContenedor.add(LNUMERO_UNO);
		bloqueContenedor.add(campoNumero1);
		
		bloqueContenedor.add(LNUMERO_DOS);
		bloqueContenedor.add(campoNumero2);
		
		bloqueContenedor.add(LRESULTADO);
		bloqueContenedor.add(campoResultado);	
		
                bloqueContenedor.add(BSUMARECURSIVA);
                bloqueContenedor.add(BFACTORIALRECURSIVO);
                bloqueContenedor.add(BFIBONACCIRECURSIVO);
		setVisible(true);
	}
}
