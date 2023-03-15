package untildown;

import java.util.Scanner;

public class empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sci=new Scanner(System.in);
		System.out.println("Bienvenido a la Libreria El Aleph");
		//System.out.println("Ingrese la cantidad de libros que va a ingresar");
		//y=sci.nextInt();
		int total=0,novela=0,cuento=0,comic=0,mayor=0;
		String [][] matriz_s=new String[8][3];
		int [][]matriz_i=new int [8][2];
		int []matriz_v=new int[8];
		int g=0;
		for(int i=0;i<8;i++) {
			g++;
			System.out.println("Digite el Titulo, Autor y Genero #"+g);
			for(int j=0;j<3;j++) {
				matriz_s[i][j]=sc.nextLine();
				
			}
			System.out.println("Digite Vr Unitario y Ejemplares Vendidos de "+matriz_s[i][0]);
			for(int j=0;j<2;j++) {
				matriz_i[i][j]=sci.nextInt();
			}
			
		}
		
		for(int j=0;j<8;j++) {
			matriz_v[j]=matriz_i[j][0]*matriz_i[j][1];
		}
			
			
		System.out.println("Titulo\t\t\tAutor\t\tGenero\tVr Unitario ($)\t\tEjemplares Vendidos\tTotal Ventas\n");
		for(int i=0;i<8;i++) {
			for(int j=0;j<3;j++) {
				 System.out.print(matriz_s[i][j]+ "\t");
				 
			}
			for(int x=0;x<2;x++) {
				 System.out.print("\t"+matriz_i[i][x]+"\t");
			 }
			System.out.print("$"+matriz_v[i]);
			System.out.println();
			total+=matriz_v[i];
		}
		
		System.out.println("El total de ventas fue: $"+total);
		for(int i=0;i<8;i++) {
		if (matriz_s[i][2].equals("Cuento") || matriz_s[i][2].equals("cuento")) {
				cuento++;
			} else if (matriz_s[i][2].equals("Novela") || matriz_s[i][2].equals("novela")) {
				novela++;
			} else if (matriz_s[i][2].equals("Comic") || matriz_s[i][2].equals("comic")) {
				comic++;
			}
		}
		mayor=0;
		if(cuento>mayor) {
			mayor=cuento;
		}
		if(novela>mayor) {
			mayor=novela;
		}
		if(comic>mayor) {
			mayor=comic;
		}
		if(mayor==cuento) {
			System.out.println("El genero que mas ventas consiguio fue cuento con "+mayor+" libros");
		}
		if(mayor==novela) {
			System.out.println("El genero que mas ventas consiguio fue novela con "+mayor+" libros");
		}
		if(mayor==comic) {
			System.out.println("El genero que mas ventas consiguio fue comic con "+mayor+" libros");
		}
	}
	

}
