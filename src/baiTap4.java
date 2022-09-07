import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args){
        System.out.println("Nhap vao STN n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong=0;
        int t;
        int m=n;
        do {
            t=m%10;
            tong=tong+t;
            m=m/10;
        }while(m>0);
        System.out.println("Tong cac chu so cua " +n +" la " +tong);
    }
}
