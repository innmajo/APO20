package APO;

public class Nomina {
	double Porcentaje_Salud=0.04;
	double Porcentaje_Pension=0.04;
	
	String nombre;
	double salario;
	
	public Nomina(String nombrePersona, double salarioPersona) {
		this.nombre=nombrePersona;
		this.salario=salarioPersona;
	}
	
	//Metodo para calcular
	public double calcularSalud() {
		
		return salario*Porcentaje_Salud;
	}
	
	//Metodo para calcular
	public double calcularPension() {
		
		return salario*Porcentaje_Pension;
	}
	
	//Metodo para calcular
	public double calcularSalarioNeto() {
		return salario - calcularSalud()-calcularPension();
	}
}
