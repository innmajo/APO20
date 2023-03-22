package APO;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carros carro1=new Carros();
		
		//Implementacion del metodo set
		carro1.SetMarca(JOptionPane.showInputDialog("Ingresa la marca del carro"));
		
		//Implementacion del metodo get
		System.out.println("La marca del carro es "+carro1.GetMarca());

	}

}
