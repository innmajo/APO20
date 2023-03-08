package untildown;

import java.util.Scanner;

public class parcial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		
		Scanner sc=new Scanner(System.in);
		Scanner sci=new Scanner(System.in);
		System.out.println("Bienvenido a la Libreria El Aleph");
		//System.out.println("Ingrese la cantidad de libros que va a ingresar");
		//y=sci.nextInt();
		int total=0,novela=0,cuento=0,comic=0;
		String [][] matriz_s=new String[8][3];
		int [][]matriz_i=new int [8][2];
		int []matriz_v=new int[8];
		for(int i=0;i<2;i++) {
			System.out.println("Dijite el Titulo, Autor y Genero");
			for(int j=0;j<3;j++) {
				matriz_s[i][j]=sc.nextLine();
			}
			System.out.println("Dijite Vr Unitario y Ejemplares Vendidos de "+matriz_s[i][0]);
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
		
		System.out.println("El total de ventas fue: "+total);
		for(int i=0;i<8;i++) {
			for(int j=0;j<3;j++) {
				//if(matriz_s[i][j].equals("Novela")||matriz_s[i][j].equals("novela")) {
					//novela++;
				//}
				/*if(matriz_s[i][j].equals("Cuento")||matriz_s[i][j].equals("cuento")) {
					cuento++;
				}
				if(matriz_s[i][j].equals("Comic")||matriz_s[i][j].equals("comic")) {
					comic++;
				}
				if (matriz_s[i][j].equals("Cuento") || matriz_s[i][j].equals("cuento")) {
					cuento++;
				} else if (matriz_s[i][j].equals("N") || matriz_s[i][j].equals("n")) {
					novela++;
				} else if (matriz_s[i][j].equals("E") || matriz_s[i][j].equals("e")) {
					excusa[i]++;
				}*/
			}
			}
		System.out.println(novela+cuento+comic);
	}

}
