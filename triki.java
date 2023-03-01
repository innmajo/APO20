package Down;
import java.util.Scanner;
public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner never=new Scanner(System.in);
		String jugador1,jugador2;
		jugador1="  ";
		jugador2="  ";
		String [][] matriz=new String[3][3];
		byte op,comienzo,g;
		matriz[0][0]= " _ ";
		matriz[0][1]= " _ ";
		matriz[0][2]= " _ ";
		matriz[1][0]= " _ ";
		matriz[1][1]= " _ ";
		matriz[1][2]= " _ ";
		matriz[2][0]= " _ ";
		matriz[2][1]= " _ ";
		matriz[2][2]= " _ ";
		System.out.println("Cuando se consiga el tres en raya de cualquier forma y \nsalga el ganador por favor escriba cualquier \ndijito despues del numero 10 \n");
		System.out.println("Bienvenido a este juego de triki");
		System.out.println("Cual es tu nombre jugador 1?");
		jugador1=never.nextLine();
		System.out.println("Cual es tu nombre jugador dos?");
		jugador2=never.nextLine();
		for(int i=0;i==i;i++) {
			System.out.println("\n  Triki\n _  _  _\n _  _  _\n _  _  _\n");
			System.out.printf("Empieza el jugador 1: %s o empieza el jugador 2: %s\n",jugador1,jugador2);
			comienzo=never.nextByte();
			switch(comienzo) {
			case 1:
				System.out.println("Empieza "+jugador1+" con la x");
				for(int h=0;h<9;h++) {
					op= never.nextByte();
					if(op==1) {
						matriz[0][0]=" X ";
					}
					if(op==2) {
						matriz[0][1]=" X ";
					}
					if(op==3) {
						matriz[0][2]=" X ";
					}
					if(op==4) {
						matriz[1][0]=" X ";
					}
					if(op==5) {
						matriz[1][1]=" X ";
					}
					if(op==6) {
						matriz[1][2]=" X ";
					}
					if(op==7) {
						matriz[2][0]=" X ";
					}
					if(op==8) {
						matriz[2][1]=" X ";
					}
					if(op==9) {
						matriz[2][2]=" X ";
					}
					for(int k=0;k<3;k++) {
						for(int t=0;t<3;t++) {
							System.out.print(matriz[k][t]);
						}
						System.out.println();
					}
					if(matriz[0][0]== " X "  && matriz[0][1]==" X "&& matriz[0][2]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					if(matriz[0][0]== " X "  && matriz[1][1]==" X "&& matriz[2][2]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					if(matriz[0][2]== " X "  && matriz[1][1]==" X "&& matriz[2][0]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					if(matriz[0][0]== " X "  && matriz[1][0]==" X "&& matriz[2][0]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					if(matriz[0][1]== " X "  && matriz[1][1]==" X "&& matriz[2][1]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					if(matriz[0][2]== " X "  && matriz[1][2]==" X "&& matriz[2][2]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					if(matriz[1][0]== " X "  && matriz[1][1]==" X "&& matriz[1][2]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					
					if(matriz[2][0]== " X "  && matriz[2][1]==" X "&& matriz[2][2]==" X ") {
						System.out.println("El ganador es "+jugador1);
						h=8;
					}
					else {
						g=never.nextByte();
						if(g==1) {
							matriz[0][0]=" O ";
						}
						if(g==2) {
							matriz[0][1]=" O ";
						}
						if(g==3) {
							matriz[0][2]=" O ";
						}
						if(g==4) {
							matriz[1][0]=" O ";
						}
						if(g==5) {
							matriz[1][1]=" O ";
						}
						if(g==6) {
							matriz[1][2]=" O ";
						}
						if(g==7) {
							matriz[2][0]=" O ";
						}
						if(g==8) {
							matriz[2][1]=" O ";
						}
						if(g==9) {
							matriz[2][2]=" O ";
						}
						for(int k=0;k<3;k++) {
							for(int t=0;t<3;t++) {
								System.out.print(matriz[k][t]);
							}
							System.out.println();
						}
						
						if(matriz[0][0]== " O "  && matriz[0][1]==" O "&& matriz[0][2]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[0][0]== " O "  && matriz[1][1]==" O "&& matriz[2][2]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[0][2]== " O "  && matriz[1][1]==" O "&& matriz[2][0]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[0][0]== " O "  && matriz[1][0]==" O "&& matriz[2][0]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[0][1]== " O "  && matriz[1][1]==" O "&& matriz[2][1]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[0][2]== " O "  && matriz[1][2]==" O "&& matriz[2][2]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[1][0]== " O "  && matriz[1][1]==" O "&& matriz[1][2]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
						if(matriz[2][0]== " O "  && matriz[2][1]==" O "&& matriz[2][2]==" O ") {
							System.out.println("El ganador es "+jugador2);
							h=8;
						}
					}
				}
				break;
			case 2:
				System.out.println("Empieza "+jugador2+" con la X");
				for(int h=0;h<9;h++) {
					op= never.nextByte();
					if(op==1) {
						matriz[0][0]=" X ";
					}
					if(op==2) {
						matriz[0][1]=" X ";
					}
					if(op==3) {
						matriz[0][2]=" X ";
					}
					if(op==4) {
						matriz[1][0]=" X ";
					}
					if(op==5) {
						matriz[1][1]=" X ";
					}
					if(op==6) {
						matriz[1][2]=" X ";
					}
					if(op==7) {
						matriz[2][0]=" X ";
					}
					if(op==8) {
						matriz[2][1]=" X ";
					}
					if(op==9) {
						matriz[2][2]=" X ";
					}
					for(int k=0;k<3;k++) {
						for(int t=0;t<3;t++) {
							System.out.print(matriz[k][t]);
						}
						System.out.println();
					}
					if(matriz[0][0]== " X "  && matriz[0][1]==" X "&& matriz[0][2]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[0][0]== " X "  && matriz[1][1]==" X "&& matriz[2][2]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[0][2]== " X "  && matriz[1][1]==" X "&& matriz[2][0]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[0][0]== " X "  && matriz[1][0]==" X "&& matriz[2][0]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[0][1]== " X "  && matriz[1][1]==" X "&& matriz[2][1]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[0][2]== " X "  && matriz[1][2]==" X "&& matriz[2][2]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[1][0]== " X "  && matriz[1][1]==" X "&& matriz[1][2]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					if(matriz[2][0]== " X "  && matriz[2][1]==" X "&& matriz[2][2]==" X ") {
						System.out.println("El ganador es "+jugador2);
						h=8;
					}
					else {
						g=never.nextByte();
						if(g==1) {
							matriz[0][0]=" O ";
						}
						if(g==2) {
							matriz[0][1]=" O ";
						}
						if(g==3) {
							matriz[0][2]=" O ";
						}
						if(g==4) {
							matriz[1][0]=" O ";
						}
						if(g==5) {
							matriz[1][1]=" O ";
						}
						if(g==6) {
							matriz[1][2]=" O ";
						}
						if(g==7) {
							matriz[2][0]=" O ";
						}
						if(g==8) {
							matriz[2][1]=" O ";
						}
						if(g==9) {
							matriz[2][2]=" O ";
						}
						for(int k=0;k<3;k++) {
							for(int t=0;t<3;t++) {
								System.out.print(matriz[k][t]);
							}
							System.out.println();
						}			
						if(matriz[0][0]== " O "  && matriz[0][1]==" O "&& matriz[0][2]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[0][0]== " O "  && matriz[1][1]==" O "&& matriz[2][2]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[0][2]== " O "  && matriz[1][1]==" O "&& matriz[2][0]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[0][0]== " O "  && matriz[1][0]==" O "&& matriz[2][0]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[0][1]== " O "  && matriz[1][1]==" O "&& matriz[2][1]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[0][2]== " O "  && matriz[1][2]==" O "&& matriz[2][2]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[1][0]== " O "  && matriz[1][1]==" O "&& matriz[1][2]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
						if(matriz[2][0]== " O "  && matriz[2][1]==" O "&& matriz[2][2]==" O ") {
							System.out.println("El ganador es "+jugador1);
							h=8;
						}
					}
				}
			break;
			}
			matriz[0][0]= " _ ";
			matriz[0][1]= " _ ";
			matriz[0][2]= " _ ";
			matriz[1][0]= " _ ";
			matriz[1][1]= " _ ";
			matriz[1][2]= " _ ";
			matriz[2][0]= " _ ";
			matriz[2][1]= " _ ";
			matriz[2][2]= " _ ";
			System.out.println("Desea volver a jugar?\n1 | Para salir\n2 | Para seguir jugando\n");
			byte again;
			again=never.nextByte();
			switch(again) {
			case 1:
				System.exit(-1);
				break;
			case 2:
				System.out.println("Cuando se consiga el tres en raya de cualquier forma y \nsalga el ganador por favor escriba cualquier dijito \ndespues del numero 10 ");
				System.out.println("Bienvenido a este juego de triki");
				System.out.println("Cual es tu nombre jugador 1?");
				Scanner sc=new Scanner(System.in);
				jugador1=sc.nextLine();
				System.out.println("Cual es tu nombre jugador dos?");
				jugador2=sc.nextLine();				
			break;
			}
		}
	}
}
