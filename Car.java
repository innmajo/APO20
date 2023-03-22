package APO;

import javax.swing.JOptionPane;

public class Carro {

	String color;
	String marca;
	int km;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Carro carro1= new Carro();
			
			/*carro1.color="Rojo";
			carro1.marca="Renault";
			carro1.km=100000;*/
			
			carro1.color=JOptionPane.showInputDialog("Ingresa el color del carro #1");
			carro1.marca=JOptionPane.showInputDialog("Ingresa la marca del carro #1");
			carro1.km=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el kilometraje del carro #1"));
			
			System.out.println("El color del carro #1 es: "+carro1.color);
			System.out.println("La marca del carro #1 es: "+carro1.marca);
			System.out.println("El kilometraje del carro #1 es: "+carro1.km);
			
			System.out.println();
			
			Carro carro2= new Carro();
			
			/*carro2.color="Gris Rata";
			carro2.marca="Ford";
			carro2.km=100000;*/
			
			carro2.color=JOptionPane.showInputDialog("Ingresa el color del carro #2");
			carro2.marca=JOptionPane.showInputDialog("Ingresa la marca del carro #2");
			carro2.km=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el kilometraje del carro #2"));
			
			System.out.println("El color del carro #2 es: "+carro2.color);
			System.out.println("El marca del carro #2 es: "+carro2.marca);
			System.out.println("El kilometraje del carro #2 es: "+carro2.km);
			
	}

}
