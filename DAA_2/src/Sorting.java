import java.util.*;
public class Sorting {

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

    public static void Selection(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            int index = i;
            int j = i + 1;
            while (j < A.length) {
                if (A[j] < A[index]) {
                    index = j;
                }
                j++;
            }
            int temp;
            temp = A[index];
            A[index] = A[i];
            A[i] = temp;
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

    public static void tree(int A[], int n, int i) {
        int max = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && A[l] > A[max]) {
            max = l;
        }
        if (r < n && A[r] > A[max]) {
            max = r;
        }
        if (max != i) {
            int temp;
            temp = A[i];
            A[i] = A[max];
            A[max] = temp;
            tree(A, n, max);
        }
    }

    public static void Heap(int A[]) {
        for (int i = A.length / 2 - 1; i >= 0; i--) {
            tree(A, A.length, i);
        }
        for (int i = A.length - 1; i > 0; i--) {
            int temp;
            temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            tree(A, i, 0);
        }
    }

    public static void main(String[] args) {
        Random input=new Random();
        
        int A[] = new int[1000];
        for (int i = 0; i < A.length; i++) {
            A[i]=input.nextInt(1000);
        }
        long mulai1=System.currentTimeMillis();
        Selection(A);
        long selesai1=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 1000 angka dengan Selection Sort adalah "
                +String.valueOf(selesai1-mulai1)+" ms");
        
        int B[] = new int[10000];
        for (int i = 0; i < B.length; i++) {
            B[i]=input.nextInt(10000);
        }
        long mulai2=System.currentTimeMillis();
        Selection(B);
        long selesai2=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 10000 angka dengan Selection Sort adalah "
                +String.valueOf(selesai2-mulai2)+" ms");
        
        int C[] = new int[100000];
        for (int i = 0; i < C.length; i++) {
            C[i]=input.nextInt(100000);
        }
        long mulai3=System.currentTimeMillis();
        Selection(C);
        long selesai3=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 100000 angka dengan Selection Sort adalah "
                +String.valueOf(selesai3-mulai3)+" ms");
        int D[] = new int[1000000];
        for (int i = 0; i < D.length; i++) {
            D[i]=input.nextInt(1000000);
        }
        long mulai4=System.currentTimeMillis();
        Selection(D);
        long selesai4=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 1000000 angka dengan Selection Sort adalah "
                +String.valueOf(selesai4-mulai4)+" ms");
        int E[] = new int[10000000];
        for (int i = 0; i < E.length; i++) {
            E[i]=input.nextInt(10000000);
        }
        long mulai5=System.currentTimeMillis();
        Selection(E);
        long selesai5=System.currentTimeMillis();
        System.out.println("Waktu untuk mengurutkan 10000000 angka dengan Selection Sort adalah "
                +String.valueOf(selesai5-mulai5)+" ms");
    }
}
