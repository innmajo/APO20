package APO;

public class Cuenta_Bancaria {
	private String Titular;
	private double Saldo=0;
	private int Cuenta=0;

	public void Set_Titular (String Titular) {
		this.Titular=Titular;
	}
	
	public void Set_Cuenta (int Cuenta) {
		this.Cuenta=Cuenta;
	}
	
	public void Set_Saldo (double Saldo) {
		this.Saldo=Saldo;
	}
	
	
	public String Get_Titular() {
		return Titular;
	}
	
	public int Get_Cuenta() {
		return Cuenta;
	}
	
	public double Get_Saldo() {
		return Saldo;
	}
}
