import java.util.Scanner;

public class baiTap12 {
    public static void main(String[] args){
        System.out.print("Nhap vao so tu nhien N(tu 1 den 9) : ");
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i =1;i<=N;i++){
            for (int j = 1;j<=i;j++){
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
