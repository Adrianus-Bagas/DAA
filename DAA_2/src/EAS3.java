
import java.util.*;

public class EAS3 {

    public static void Bubble(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp;
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void Insert(int A[]) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int k = i - 1;
            while (k >= 0 && A[k] > key) {
                A[k + 1] = A[k];
                k--;
            }
            A[k + 1] = key;
        }
    }

    public static int partition(int A[], int low, int high) {
        int i = (low - 1);
        int pivot = A[high];
        for (int j = low; j <= high - 1; j++) {
            if (A[j] < pivot) {
                i++;
                int temp;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int swap;
        swap = A[i + 1];
        A[i + 1] = A[high];
        A[high] = swap;
        return i + 1;
    }

    public static int[] Quick(int A[], int low, int high) {
        if (low < high) {
            int pi = partition(A, low, high);
            Quick(A, low, pi - 1);
            Quick(A, pi + 1, high);
        }
        return A;
    }

    public static void Merge(int A[], int m, int n, int k) {
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
            Merge(A, m, n, k);
        }
    }

    public static void main(String[] args) {
        Random input=new Random();
        
        int A[] = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i]=input.nextInt(10);
        }
        long mulai1=System.currentTimeMillis();
        Bubble(A);
        long selesai1=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 10 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai1-mulai1)+" ms");
        
        int B[] = new int[25];
        for (int i = 0; i < B.length; i++) {
            B[i]=input.nextInt(25);
        }
        long mulai2=System.currentTimeMillis();
        Bubble(B);
        long selesai2=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 25 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai2-mulai2)+" ms");
        
        int C[] = new int[50];
        for (int i = 0; i < C.length; i++) {
            C[i]=input.nextInt(50);
        }
        long mulai3=System.currentTimeMillis();
        Bubble(C);
        long selesai3=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 50 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai3-mulai3)+" ms");
        int D[] = new int[100];
        for (int i = 0; i < D.length; i++) {
            D[i]=input.nextInt(100);
        }
        long mulai4=System.currentTimeMillis();
        Bubble(D);
        long selesai4=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 100 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai4-mulai4)+" ms");
        int E[] = new int[1000];
        for (int i = 0; i < E.length; i++) {
            E[i]=input.nextInt(1000);
        }
        long mulai5=System.currentTimeMillis();
        Bubble(E);
        long selesai5=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 1000 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai5-mulai5)+" ms");
        int F[] = new int[10000];
        for (int i = 0; i < F.length; i++) {
            F[i]=input.nextInt(10000);
        }
        long mulai6=System.currentTimeMillis();
        Bubble(F);
        long selesai6=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 10000 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai6-mulai6)+" ms");
        int G[] = new int[100000];
        for (int i = 0; i < G.length; i++) {
            G[i]=input.nextInt(100000);
        }
        long mulai7=System.currentTimeMillis();
        Bubble(G);
        long selesai7=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 100000 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai7-mulai7)+" ms");
        int H[] = new int[500000];
        for (int i = 0; i < H.length; i++) {
            H[i]=input.nextInt(500000);
        }
        long mulai8=System.currentTimeMillis();
        Bubble(H);
        long selesai8=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 500000 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai8-mulai8)+" ms");
        int I[] = new int[1000000];
        for (int i = 0; i < I.length; i++) {
            I[i]=input.nextInt(1000000);
        }
        long mulai9=System.currentTimeMillis();
        Bubble(I);
        long selesai9=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 1000000 angka dengan Bubble Sort adalah "
                +String.valueOf(selesai9-mulai9)+" ms");
    }

}
