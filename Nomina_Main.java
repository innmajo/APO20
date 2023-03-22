package APO;

import javax.swing.JOptionPane;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nomina empleado1=new Nomina(JOptionPane.showInputDialog("Ingresa el nombre"),Integer.parseInt(JOptionPane.showInputDialog("Ingresa el salario")));
		System.out.println("Nombre: "+empleado1.nombre);
		System.out.println("Salario: "+empleado1.salario);
		
		System.out.println("Deducciones:");
		System.out.println("-Salud: "+empleado1.calcularSalud());
		System.out.println("-Pension: "+empleado1.calcularPension());
		System.out.println("Salario Neto: "+empleado1.calcularSalarioNeto());

	}

}
