package untildown;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int nFilas,nColumnas,l=1;
		
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de estudiantes"));
		nColumnas=Integer.parseInt(JOptionPane.showInputDialog("Dijite el numero de semanas"));
		
		String [][]matriz1=new String[nFilas][nColumnas];
		matriz1[0][0]=" Nombre ";
		String []estudiantes=new String[nFilas];
		for(int i=0;i<nFilas;i++) {
			estudiantes[i]=JOptionPane.showInputDialog("Dijite el nombre del estudiante");
			for(int j=0;j<nColumnas;j++) {
				matriz1[i][j]=JOptionPane.showInputDialog("Semana ");
			}
		}
		System.out.print("Nombre ");
		for(int p=0;p<nColumnas;p++) {
			System.out.print("Sem"+l+"\t");
			l++;
		}
		
			for(int i=0;i<nFilas;i++) {
		
			System.out.print("\n"+estudiantes[i]);
			for(int j=0;j<nColumnas;j++) {
				System.out.print("\t"+matriz1[i][j]);
				
			}
			System.out.println();
		
		
		}
			int asistencia = 0;
			if(matriz1[0][0]=="S") {
				asistencia++;
			}
			System.out.println(asistencia);
			System.out.print("\tNombre\tAsistencias\tInasistencias\tExcusa");
			for(int p=0;p<nColumnas;p++) {
				System.out.print("Sem"+l+"\t");
				l++;
			}
			
				for(int i=0;i<nFilas;i++) {
			
				System.out.print("\n"+estudiantes[i]);
				for(int j=0;j<nColumnas;j++) {
					//System.out.print("\t"+matriz1[i][j]);
					
				}
				System.out.println();
			
			
			}
		//System.out.println(nFilas);
		//System.out.println(nColumnas);
	
	
	}

}
