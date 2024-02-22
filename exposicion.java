public class Exposicion {
	public static void selectionSort(int[] arr) {
        int n=arr.length;
        System.out.println();
        System.out.print("Intercambios");
        for (int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int intercambio=arr[min];
            arr[min]=arr[i];
            arr[i]=intercambio;
            System.out.println();
        for (int p=0;p<n;p++){
        System.out.print(arr[p]+" " );
        } 
        }
        System.out.println();
    }
	public static void main(String[] args){
		int []arr =new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*50);
		}
		System.out.println("Arreglo:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		selectionSort(arr);
		System.out.println();
		System.out.println("Arreglo ordenado:");
		for (int p=0;p<arr.length;p++) {
			System.out.print(arr[p] + " ");
		}
	}
}
