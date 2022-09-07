import java.util.Scanner;

public class baiTap7 {
    public static void main(String[] args){
        System.out.println("Nhap vao so tu nhien : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Uoc cua so " +n +" la :");
        for (int i = n;i>0;i--){
            if(n%i==0){
                int uoc=i;
                System.out.print(uoc + "\t");
            }
        }
    }
}
