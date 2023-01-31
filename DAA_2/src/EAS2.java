import java.util.Scanner;
public class EAS2 {
    public static void main(String[] args) {
   int A[][]=new int[2][2];
   Scanner input=new Scanner(System.in);
   for(int i=0;i<2;i++){
       for(int j=0;j<2;j++){
           System.out.print("A("+(i+1)+","+(j+1)+") = ");
           int elemen=input.nextInt();
           A[i][j]=elemen;
       }
   }
        System.out.println("Before : ");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(A[i][j]+" ");
        }
        System.out.println();
    }
   for(int i=0;i<2;i++){
       for(int j=0;j<1;j++){
       if(A[i][j]>A[i][j+1]){
           int temp=A[i][j];
           A[i][j]=A[i][j+1];
           A[i][j+1]=temp;
       }
       
   }
}
   for(int i=0;i<2;i++){
       for(int j=0;j<1;j++){
       if(A[j][i]>A[j+1][i]){
           int temp=A[j][i];
           A[j][i]=A[j+1][i];
           A[j+1][i]=temp;
       }
       
   }
}
   System.out.println("After : ");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(A[i][j]+" ");
        }
        System.out.println();
}
}
}
