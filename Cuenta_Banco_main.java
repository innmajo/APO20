package APO;

import javax.swing.JOptionPane;

public class Cuenta_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta_Bancaria op=new Cuenta_Bancaria();
		op.Set_Titular(JOptionPane.showInputDialog("Ingresa el nombre del titular de la cuenta"));
		op.Set_Cuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cuenta")));
		op.Set_Saldo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el saldo")));
		op.Set_Deposito(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el deposito")));
		System.out.println("Titular: "+op.Get_Titular());
		System.out.println("Cuenta: "+op.Get_Cuenta());
		System.out.println("Saldo Anterior: "+op.Get_SaldoAnterior());
		System.out.println("Deposito: "+op.Get_Deposito());
		System.out.println("Nuevo Saldo: "+op.Get_Saldo());
	}
}
