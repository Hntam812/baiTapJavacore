import java.util.Arrays;
import java.util.Scanner;

public class baiTap19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            showMenu();
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println("Phuong trinh bac 1 co dang: ax + b = 0");
                    System.out.println("Nhap a = ");
                    int a1 = scanner.nextInt();
                    System.out.println("Nhap b = ");
                    int b1 = scanner.nextInt();
                    giaiPTBac1(a1, b1);
                    break;
                case 2:
                    System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0");
                    System.out.println("Nhap a = ");
                    int a2 = scanner.nextInt();
                    System.out.println("Nhap b = ");
                    int b2 = scanner.nextInt();
                    System.out.println("Nhap c = ");
                    int c2 = scanner.nextInt();
                    giaiPTBac2(a2, b2, c2);
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Can nhap dung chuc nang. Nhap lai: ");
                    break;
            }

        } while (luaChon != 3);

    }

    public static void showMenu() {
        System.out.println("=========MENU=========");
        System.out.println("1: Giai phuong trinh bac 1");
        System.out.println("2. Giai chuong trinh bac 2");
        System.out.println("3. Thoat chuong trinh");
        System.out.println("Nhap lua chon: ");
    }

    public static void giaiPTBac1(int a, int b) {
        if(a == 0) {
            if(b == 0)
                System.out.println("Phuong trinh vo so nghiem.");
            else
                System.out.println("Phuong tring vo nghiem.");
        } else {
            float nghiem = (float) -b/a;
            System.out.println("Phuong trinh co nghiem la: " + nghiem);
        }
    }

    public static void giaiPTBac2(int a, int b, int c) {
        if(a == 0) {
            giaiPTBac1(b, c);
        } else {
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if(delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phuong trinh co 2 nghiem la: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x1);
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }

}
