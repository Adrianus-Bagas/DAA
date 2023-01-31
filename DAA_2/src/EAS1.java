import java.util.Scanner;
public class EAS1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
   int A[][]=new int[2][2];
   int B[][]=new int[2][1];
   int C[][]=new int[2][1];
   int hasil[][]=new int[2][1];
   for(int i=0;i<2;i++){
       for(int j=0;j<2;j++){
           System.out.print("A("+(i+1)+","+(j+1)+") = ");
           int elemen=input.nextInt();
           A[i][j]=elemen;
       }
   }
   for(int i=0;i<2;i++){
       for(int j=0;j<1;j++){
           System.out.print("B("+(i+1)+","+(j+1)+") = ");
           int elemen=input.nextInt();
           B[i][j]=elemen;
       }
   }
   for(int i=0;i<2;i++){
       for(int j=0;j<1;j++){
           System.out.print("C("+(i+1)+","+(j+1)+") = ");
           int elemen=input.nextInt();
           C[i][j]=elemen;
       }
   }
        System.out.println("AB+C = ");
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                for(int k=0;k<2;k++){
                    hasil[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.println((hasil[i][j]+C[i][j])+" ");
            }
        }
}
}
