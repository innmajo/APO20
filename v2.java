package Down;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class limon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=1,estudiantes = 0,sem = 0,semMayorAsistencia = 0,semMenorAsistencia = 0,mayorAsistencia = 0,mayorInasistencia = 0,mayorExcusas = 0,estudianteMaxAsistencia = 0,estudianteMinAsistencia = 0,estudianteMaxExcusas = 0;
		estudiantes=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de estudiantes"));
		sem=Integer.parseInt(JOptionPane.showInputDialog("Dijite el numero de semanas"));
		int asistencia[]= new int [estudiantes];
		int inasistencia[]=new int [estudiantes];
		int excusa[]=new int [estudiantes];
		String Nestudiante[] = new String[estudiantes];
		String ane[][] = new String[estudiantes][sem];
        int menorAsistencia = estudiantes * sem;
		for (int i=0;i<estudiantes;i++) {
			System.out.println("Ingresa el nombre del estudiante #"+x);
			Nestudiante[i] = sc.next();
			x++;
		}
		x=1;
		for (int i=0;i<estudiantes;i++) {
			for (int j=0;j<sem;j++) {
				System.out.println(Nestudiante[i] + " Durante la semana #" + x + " Si asistio(S), No asistio(N), o presenta Excusa(E)\nContestar con los caracteres indicados");
				ane[i][j] = sc.next();
				if (ane[i][j].equals("S") || ane[i][j].equals("s")) {
					asistencia[i]++;
				} else if (ane[i][j].equals("N") || ane[i][j].equals("n")) {
					inasistencia[i]++;
				} else if (ane[i][j].equals("E") || ane[i][j].equals("e")) {
					excusa[i]++;
				}
				x++;
				}
			x=1;
			}
		x=1;
		System.out.print("Nombre\t");
		for (int i=0;i<sem;i++) {
			System.out.print("Semana " + x + "\t");
			x++;
		}
		System.out.println();
		for (int i=0;i<estudiantes;i++) {
			System.out.print(Nestudiante[i] + "\t");
			for (int j=0;j<sem;j++) {
				System.out.print(ane[i][j] + "\t\t");
			}
				System.out.println("\t");
		}
		for (int j=0;j<sem;j++) {	
			int asistenciasSem = 0;
			for (int i=0;i<estudiantes;i++) {
				if (ane[i][j].equals("s")||ane[i][j].equals("S")) {
					asistenciasSem++;
				}
		}
	    if (asistenciasSem>mayorAsistencia) {
	    	mayorAsistencia=asistenciasSem;
	    	semMayorAsistencia=j+1;
		}
		if (asistenciasSem<menorAsistencia) {
			menorAsistencia=asistenciasSem;
			semMenorAsistencia=j+1;
		}
		}
		System.out.println();
		System.out.println("La semana con mayor asistencia fue la semana " + semMayorAsistencia + " con " + mayorAsistencia + " asistencias");
		System.out.println("La semana con menor asistencia fue la semana " + semMenorAsistencia + " con " + menorAsistencia + " asistencias");
		System.out.println();
		System.out.println("Nombre\tAsistencias\tInasistencias\t    Excusas");
		for (int i=0;i<estudiantes;i++) {
			System.out.print(Nestudiante[i]+ "\t\t");
			System.out.print(asistencia[i]+ "\t\t");
			System.out.print(inasistencia[i]+ "\t\t");
			System.out.print(excusa[i]+ "\t\t");
			if(inasistencia[i]>4) {
				System.out.println("No apruebas, asiste mas a las clases");
			}
			else{
				System.out.println("Apruebas");
			}
		}
		for (int i=0;i<estudiantes;i++) {
		    if (asistencia[i]>mayorAsistencia) {
		        mayorAsistencia=asistencia[i];
		        estudianteMaxAsistencia=i;
		    }
		}
		
		for (int i=0;i<estudiantes;i++) {
		    if (inasistencia[i]>mayorInasistencia) {
		        mayorInasistencia=inasistencia[i];
		        estudianteMinAsistencia=i;
		    }
		}
		
		for (int i=0;i<estudiantes;i++) {
		    if (excusa[i]>mayorExcusas) {
		        mayorExcusas=excusa[i];
		        estudianteMaxExcusas=i;
		    }
		}	
		System.out.println();
		System.out.println("El estudiante con mayor asistencia es: " + Nestudiante[estudianteMaxAsistencia]);
		System.out.println("El estudiante con mayor inasistencia es: " + Nestudiante[estudianteMinAsistencia]);
		System.out.println("El estudiante con mayor cantidad de excusas es: " + Nestudiante[estudianteMaxExcusas]);
	}
}
