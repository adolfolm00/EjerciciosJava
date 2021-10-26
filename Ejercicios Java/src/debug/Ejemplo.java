package debug;

import javax.swing.JOptionPane;

public class Ejemplo {

	public static void main(String[] args) {
		
		String nombre= JOptionPane.showInputDialog("Dame tu nombre");
		int edad= Integer.parseInt(JOptionPane.showInputDialog("Dame tu edad"));
		int anio=2021-edad;
		JOptionPane.showMessageDialog(null, "Hola "+nombre+",Naciste en el año "+anio,"TITULO",2,null);
	}

}