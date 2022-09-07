import java.util.Scanner;

public class baiTap2_Dec2Bin {
    public static void main(String[] args){
        System.out.println("Nhap vao so nguyen :");
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int k=0;
        int max=20;
        int[] mangNP=new int[max];
        do {
            int du=N%2;
            mangNP[k]=du;
            k++;
            N=N/2;
        }while(N>0);
        for (int i=k-1;i>=0;i--){
            System.out.print(mangNP[i]+ "\t");
        }

    }

}
