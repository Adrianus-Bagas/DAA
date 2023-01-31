import java.util.*;
public class EAS4{
static char name;
public static void PerkalianMatriks(int i, int j,int n, int[][] matriks){
	if (i == j){
	System.out.print(name++);
	return;
	}
	System.out.print("(");
	PerkalianMatriks(i, matriks[i][j], n, matriks);
	PerkalianMatriks(matriks[i][j] + 1, j, n, matriks);
	System.out.print(")");
}
public static void Minimum(int p[], int n){
	int[][] m = new int[n][n];
	int[][] matriks = new int[n][n];
	for (int i = 1; i < n; i++)
	m[i][i] = 0;
	for (int L = 2; L < n; L++){
            for (int i = 1; i < n - L + 1; i++){
		int j = i + L - 1;
		m[i][j] = Integer.MAX_VALUE;
		for (int k = i; k <= j - 1; k++){
		int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
		if (q < m[i][j]){
			m[i][j] = q;
			matriks[i][j] = k;
		}
		}
	}
	}
	name = 'A';
	System.out.print("Perkalian Matriks Berantai yang optimal adalah ");
	PerkalianMatriks(1, n - 1, n, matriks);
	System.out.println("\nDimana banyaknya perkalian terjadi sebanyak " + m[1][n - 1]+" kali");
}
public static void main(String[] args){
        Random rand=new Random();
        char nama='A';
	int A[]=new int[11];
        System.out.println("Perkalian Berantai 10 Matriks");
	for(int i=0;i<A.length;i++){
            A[i]=rand.nextInt(100);
        }
	for(int i=0;i<A.length-1;i++){
            System.out.println((i+1)+". Matriks "+nama+" berukuran "+A[i]+"x"+A[i+1]);
            nama++;
        }
        Minimum(A,A.length);
}
}