import java.util.Arrays;
import java.util.Scanner;

public class baiTap14 {
    public static void main(String[] args) {
        int[] mangXuLy;
        mangXuLy = nhapMang();
        mangXuLy = xoaPhanTuLapLai(mangXuLy);
        xuatmang(mangXuLy);
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
        System.out.println("Danh sach mang sau khi xoa phan tu lap lai la: ");
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

    public static int[] xoaPhanTuLapLai(int[] mang) {
        Arrays.sort(mang);
        int[] mangMoi = new int[] {mang[0]};
        int chiSoDauLap = 0;
        for(int i = 1; i < mang.length; i++) {
            if(mang[i] != mang[chiSoDauLap]) {
                mangMoi = themPhanTuVaoCuoi(mangMoi, mang[i]);
                chiSoDauLap = i;
            }
        }
        return mangMoi;
    }
}
