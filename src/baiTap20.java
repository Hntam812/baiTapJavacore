import java.util.Arrays;
import java.util.Scanner;


public class baiTap20 {
    public static void main(String[] args) {
        int[] mangXuLy;
        mangXuLy = nhapMang();
        System.out.println("Danh sach mang vua nhap la: ");
        xuatmang(mangXuLy);

        int[] mangChan = new int[0];
        int[] mangLe = new int[0];

        for(int i = 0; i < mangXuLy.length; i++) {
            if(mangXuLy[i]%2 == 0)
                mangChan = themPhanTuVaoCuoi(mangChan, mangXuLy[i]);
            else
                mangLe = themPhanTuVaoCuoi(mangLe, mangXuLy[i]);
        }

        System.out.println("Danh sach mang chan la: ");
        xuatmang(mangChan);
        System.out.println("Danh sach mang le la: ");
        xuatmang(mangLe);
    }

    public static int[] nhapMang() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] mang = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.printf("\nA[%d] = ", i);
            mang[i] = scanner.nextInt();
        }
        return mang;
    }

    public static void xuatmang(int[] mang) {
        for(int i = 0; i < mang.length; i++)
            System.out.print(mang[i] + " ");
        System.out.println("");
    }

    public static int[] themPhanTuVaoCuoi(int[] mang, int giaTriChen) {
        int[] mangMoi = new int[mang.length + 1];
        for(int i = 0; i < mang.length; i++)
            mangMoi[i] = mang[i];
        mangMoi[mang.length] = giaTriChen;
        return mangMoi;
    }
}
