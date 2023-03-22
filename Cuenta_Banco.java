package APO;

public class Cuenta_Bancaria {
	private String Titular;
	private int Cuenta=0;
	private double Saldo=0;
	private double Deposito=0;

	public void Set_Titular (String Titular) {
		this.Titular=Titular;
	}
	
	public void Set_Cuenta (int Cuenta) {
		this.Cuenta=Cuenta;
	}
	
	public void Set_Saldo (double Saldo) {
		this.Saldo=Saldo;
	}
	
	public void Set_Deposito (double Deposito) {
		this.Deposito=Deposito;
	}
	
	
	public String Get_Titular() {
		return Titular;
	}
	
	public int Get_Cuenta() {
		return Cuenta;
	}
	
	public double Get_SaldoAnterior() {
		return Saldo;
	}
	
	public double Get_Deposito() {
		return Deposito;
	}
	
	public double Get_Saldo() {
		return Saldo+Deposito;
	}
}
