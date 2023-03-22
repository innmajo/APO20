package APO;

import javax.swing.JOptionPane;

public class Operaciones {
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	public void asignarNumeros(int x,int y) {
		numero1=x;
		numero2=y;
		//numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa valor del numero 1"));
		//numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa valor del numero 2"));
		
		System.out.println("El valor del numero 1 es "+numero1);
		System.out.println("El valor del numero 2 es "+numero2);
		
	}
	
	public void sumar() {
		suma=numero1+numero2;
		System.out.println("La suma es: "+suma);
	}
	
	public void restar() {
		resta=numero1-numero2;
		System.out.println("La resta es: "+resta);
	}
	public void multiplicacion() {
		multiplicacion=numero1*numero2;
		System.out.println("La multiplicacion es: "+multiplicacion);
	}
	public void division() {
		division=numero1/numero2;
		System.out.println("La multiplicacion es: "+division);
	}
	public int comparacion() {
		System.out.println();
		if(numero1<numero2) {
			return numero2;
		}
		if(numero2<numero1) {
			return numero1;
		}
		System.out.println();
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones op= new Operaciones();
		op.asignarNumeros(4,2);
		op.sumar();
		op.restar();
		op.multiplicacion();
		op.division();
		System.out.print(op.comparacion());

	}
}
