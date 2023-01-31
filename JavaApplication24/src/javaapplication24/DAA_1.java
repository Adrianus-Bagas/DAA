package javaapplication24;

import java.util.*;

class Contoh1 {

    public static int SequentialSearch(int A[], int n, int x) {
        int hasil = 0;
        int j = 0;
        while (j < n) {
            if (x == A[j]) {
                hasil = j;
                break;
            } else {
                hasil = -1;
            }
            j++;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya elemen array : ");
        int n = input.nextInt();
        int A[] = new int[n];
        System.out.print("Masukkan elemen array : ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        System.out.print("Bilagan yang ingin dicari : ");
        int x = input.nextInt();
        System.out.println("Bilangan tersebut ada di index : " + SequentialSearch(A, n, x));
    }
}

class Contoh2 {

    public static int CariMaximal(int A[], int n) {
        int max = A[0];
        for (int i = 0; i < n - 1; i++) {
            if (max < A[i + 1]) {
                max = A[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya elemen array : ");
        int n = input.nextInt();
        int A[] = new int[n];
        System.out.print("Masukkan elemen array : ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        System.out.println("Bilangan maksimum pada array tersebut adalah " + CariMaximal(A, n));
    }
}

class Contoh3 {

    public static void InsertionSort(int A[], int n) {
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int k;
            for (k = i - 1; k >= 0 && A[k] > key; k--) {
                A[k + 1] = A[k];
            }
            A[k + 1] = key;
        }
        System.out.print("Hasil Sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya elemen pada array : ");
        int n = input.nextInt();
        int A[] = new int[n];
        System.out.print("Masukkan elemen array : ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        InsertionSort(A, n);
    }
}

class Contoh4 {

    public static int CariMaximal2(int A[], int m, int n) {
        if (m >= n - 2) {
            if (A[m] > A[m + 1]) {
                return A[m];
            } else {
                return A[m + 1];
            }
        }
        int max = CariMaximal2(A, m + 1, n);
        if (A[m] > max) {
            return A[m];
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya elemen array : ");
        int n = input.nextInt();
        System.out.print("Masukkan elemen array : ");
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        System.out.println("Bilangan terbesar pada array tersebut adalah " + CariMaximal2(A, 0, n));
    }
}

class Contoh5 {

    public static void merge(int A[], int m, int n, int k) {
        int n1 = k - m + 1;
        int n2 = n - k;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = A[m + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = A[k + 1 + j];
        }
        int i = 0, j = 0;
        int r = m;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[r] = L[i];
                i++;
            } else {
                A[r] = R[j];
                j++;
            }
            r++;
        }
        while (i < n1) {
            A[r] = L[i];
            i++;
            r++;
        }
        while (j < n2) {
            A[r] = R[j];
            j++;
            r++;
        }
    }

    public static void MergeSort(int A[], int m, int n) {
        if (m < n) {
            int k = (m + n) / 2;
            MergeSort(A, m, k);
            MergeSort(A, k + 1, n);
            merge(A, m, n, k);
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya elemen pada array : ");
        int n = input.nextInt();
        System.out.print("Masukkan elemen array : ");
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        System.out.print("Hasil Sorting : ");
        MergeSort(A, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
class ETS_DAA{
    public static void CariMin(int A[]){
        int k=0;
        int sum=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
            sum++;
            }
        }
        int j[]=new int[sum];
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                j[k]=i;
                k++;
            }
        }
        for(int i=0;i<j.length;i++){
        System.out.print(j[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int A[]={-1,2,3,-3,4,0,-2};
        CariMin(A);
    }
}
class coba{
    public static void main(String[] args) {
        int n=6;
        int i=1;
        for(int j=0;i<n;j++){
            while(i<n){
                System.out.println("xnxx");
                i=i*2;
            }
        }
    }
}