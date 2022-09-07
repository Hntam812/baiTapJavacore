import java.util.Scanner;

public class baiTap17 {

        public static void main(String[] args) {
            int soNgauNhien = sinhSoNgauNhien();

            while (true) {
                int soNhap = nhapSoDoan();
                if(soNhap == soNgauNhien) {
                    System.out.println("Ban da doan chinh xac.");
                    break;
                } else {
                    String kiemTra = soNhap > soNgauNhien ? "Ban dang nhap so lon hon." : "Ban dang nhap so nho hon.";
                    System.out.println(kiemTra);
                }
            }
        }
        public static int sinhSoNgauNhien() {
            return (int) (Math.random()*1000+1);
        }

        public static int nhapSoDoan() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao so ban doan: ");
            int soNhap = scanner.nextInt();

            while (true) {
                if(soNhap >= 1 && soNhap <= 1000) {
                    return soNhap;
                } else {
                    System.out.println("Doan so trong khoang tu 1 - 1000. Vui long nhap lai!");
                    soNhap = scanner.nextInt();
                }
            }
        }
}
