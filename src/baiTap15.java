import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class baiTap15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoiNhap = scanner.nextLine();

        // cau a
        System.out.println("Do dai cua chuoi la: " + chuoiNhap.length());

        // cau b
        try {
            System.out.println("Nhap vao vi tri can tim: ");
            int viTri = scanner.nextInt();
            char kyTuTimDuoc = chuoiNhap.charAt(viTri);
            String thongBaoKyTu = (kyTuTimDuoc == ' ') ? "Ky tu tim duoc la mot khoang trang." : "Ky tu tim duoc la: " + kyTuTimDuoc;
            System.out.println(thongBaoKyTu);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Vi tri can tim khong nam trong chuoi.");
        } catch (InputMismatchException e) {
            System.out.println("Vi tri can tim la mot so nguyen.");
        }

        // cau c

        String chuoiPhu = "abcdef";
        String thongBaoKiemTra = chuoiNhap.contains(chuoiPhu) ? "Chuoi nhap co chua chuoi " + chuoiPhu : "Chuoi nhap khong chua chuoi " +chuoiPhu;
        System.out.println(thongBaoKiemTra);
    }
}
