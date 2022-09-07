import java.util.Scanner;

public class baiTap9 {
    public static void main(String[] args){
        System.out.println("Nhap vao hai so nguyen  : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        System.out.print("n2 = ");
        int n2= scanner.nextInt();
        int a1=n1/10;
        int a2=n1%10;
        int b1=n2/10;
        int b2=n2%10;
        if((a1!=b1)&&(a1!=b2)&&(a2!=b1)&&(a2!=b2)) {
            System.out.println("FALSE");
        }else{
            System.out.println("TRUE");
        }
    }

}
