import java.util.Arrays;
import java.util.Scanner;


public class baiTap21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao vi tri cua Kangaroo 1, x1 = ");
        int x1 = scanner.nextInt();
        while(true) {
            if(x1 >= 0 && x1 < 10000){
                break;
            } else {
                System.out.println("Vi tri tu [0 - 10000), Vui long nhap lai: ");
                x1 = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao toc do cua Kangaroo 1, v1 = ");
        int v1 = scanner.nextInt();
        while (true) {
            if(v1 >= 1) {
                break;
            } else {
                System.out.println("Toc do >= 1, Vui long nhap lai: ");
                v1 = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao vi tri cua Kangaroo 2, x2 = ");
        int x2 = scanner.nextInt();
        while (true) {
            if(x2 > x1 && x2 < 10000) {
                break;
            } else {
                System.out.println("Vi tri tu [" + x1 + " - 10000), Vui long nhap lai: ");
                x2 = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao toc do cua Kangaroo 2, v2 = ");
        int v2 = scanner.nextInt();
        while (true) {
            if(v2 <= 10000) {
                break;
            } else {
                System.out.println("Toc do <= 10000, Vui long nhap lai: ");
                v2 = scanner.nextInt();
            }
        }
        int soBuocNhay = 0;
        while(true) {
            if(v1 <= v2) {
                System.out.println("NO");
                break;
            } else {
                if(x1 > 10000 && x2 > 10000) {
                    soBuocNhay = 0;
                    System.out.println("NO");
                    break;
                } else {
                    soBuocNhay++;
                    x1 = x1 + v1;
                    x2 = x2 + v2;
                    if(x1 == x2) {
                        System.out.println("YES");
                        break;
                    }
                }
            }
        }
        if(soBuocNhay > 0)
            System.out.println("So buoc nhay la: " + soBuocNhay);
    }
}
