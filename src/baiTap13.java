import java.util.Arrays;
import java.util.Scanner;

public class baiTap13 {
    public static void main(String[] args) {
        int[] mangXuLy;
        mangXuLy = nhapMang();

        // cau a
        double giaTriTB = tinhGiaTriTB(mangXuLy);
        System.out.println("Gia tri trung binh la: " + giaTriTB);

        // cau b
        int viTriPTLonNhat = viTriPTLonNhat(mangXuLy);
        System.out.println("Phan tu lon nhat co: gia tri la " + mangXuLy[viTriPTLonNhat] + " va vi tri la " + viTriPTLonNhat);

        int viTriPTNhoNhat = viTriPTNhoNhat(mangXuLy);
        System.out.println("Phan tu nho nhat co: gia tri la " + mangXuLy[viTriPTNhoNhat] + " va vi tri la " + viTriPTNhoNhat);

        // cau c
        int viTriAmLonNhat = viTriAmLonNhat(mangXuLy);
        String phanTuAmLonNhat = (viTriAmLonNhat != -1) == true ? "Phan tu am lon nhat co: gia tri la " + mangXuLy[viTriAmLonNhat] + " va vi tri la " + viTriAmLonNhat : "Mang khong co phan tu am lon nhat.";
        System.out.println(phanTuAmLonNhat);

        int viTriAmNhoNhat = viTriAmNhoNhat(mangXuLy);
        String phanTuAmNhoNhat = (viTriAmNhoNhat != -1) == true ? "Phan tu am nho nhat co: gia tri la " + mangXuLy[viTriAmNhoNhat] + " va vi tri la " + viTriAmNhoNhat : "Mang khong co phan tu am nho nhat";
        System.out.println(phanTuAmNhoNhat);

        // cau d
        int viTriDuongLonNhat = viTriDuongLonNhat(mangXuLy);
        String phanTuDuongLonNhat = (viTriDuongLonNhat != -1) == true ? "Phan tu duong lon nhat co: gia tri la " + mangXuLy[viTriDuongLonNhat] + " va vi tri la " + viTriDuongLonNhat : "Mang khong co phan tu duong lon nhat";
        System.out.println(phanTuDuongLonNhat);

        int viTriDuongNhoNhat = viTriDuongNhoNhat(mangXuLy);
        String phanTuDuongNhoNhat = (viTriDuongNhoNhat != -1) == true ? "Phan tu duong nho nhat co: gia tri la " + mangXuLy[viTriDuongNhoNhat] + " va vi tri la " + viTriDuongNhoNhat : "Mang khong co phan tu duong nho nhat";
        System.out.println(phanTuDuongNhoNhat);

        //cau e
        String chuoiChan = inPTChan(mangXuLy);
        String inChuoiChan = (chuoiChan != "") ? "Cac phan tu chan la: " + chuoiChan : "Mang khong chua phan tu chan";
        System.out.println(inChuoiChan);

        String chuoiLe = inPTLe(mangXuLy);
        String inChuoiLe = (chuoiLe != "") ? "Cac phan tu le la: " + chuoiLe : "Mang khong chua phan tu le";
        System.out.println(inChuoiLe);

        //cau f
        mangXuLy = themPhanTu(mangXuLy);
        xuatmang(mangXuLy);

        //cau g
        mangXuLy = xoaPhanTu(mangXuLy);
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
        System.out.println("Danh sach mang hien tai la: ");
        for(int i = 0; i < mang.length; i++)
            System.out.print(mang[i] + " ");
        System.out.println("");
    }

    public static double tinhGiaTriTB(int[] mang) {
        double tong = 0;
        for (int i = 0; i < mang.length; i++)
            tong = tong + mang[i];
        double giaTriTB = tong / mang.length;
        return giaTriTB;
    }

    public static int viTriPTLonNhat(int[] mang) {
        int giaTriLonNhat = mang[0];
        int viTriPTLonNhat = 0;
        for(int i = 1; i < mang.length; i++)
            if(mang[i] > giaTriLonNhat) {
                giaTriLonNhat = mang[i];
                viTriPTLonNhat = i;
            }
        return viTriPTLonNhat;
    }

    public static int viTriPTNhoNhat(int[] mang) {
        int giaTriNhoNhat = mang[0];
        int viTriNhoNhat = 0;
        for(int i = 1; i < mang.length; i++)
            if(mang[i] < giaTriNhoNhat) {
                giaTriNhoNhat = mang[i];
                viTriNhoNhat = i;
            }
        return viTriNhoNhat;
    }

    public static int viTriAmDauTien(int[] mang) {
        for(int i = 0; i < mang.length; i++)
            if(mang[i] < 0)
                return i;
        return -1;
    }

    public static int viTriAmLonNhat(int[] mang) {
        int viTriAmLonNhat = viTriAmDauTien(mang);
        if(viTriAmLonNhat != -1) {
            for(int i = viTriAmLonNhat; i < mang.length; i++)
                if (mang[i] < 0 && mang[i] > mang[viTriAmLonNhat])
                    viTriAmLonNhat = i;
            return viTriAmLonNhat;
        }
        return -1;
    }

    public static int viTriAmNhoNhat(int[] mang) {
        int viTriAmNhoNhat = viTriAmDauTien(mang);
        if(viTriAmNhoNhat != -1) {
            for(int i = viTriAmNhoNhat; i < mang.length; i++)
                if (mang[i] < 0 && mang[i] < mang[viTriAmNhoNhat])
                    viTriAmNhoNhat = i;
            return viTriAmNhoNhat;
        }
        return -1;
    }

    public static int viTriDuongDauTien(int[] mang) {
        for(int i = 0; i < mang.length; i++)
            if(mang[i] >= 0)
                return i;
        return -1;
    }

    public static int viTriDuongLonNhat(int[] mang) {
        int viTriDuongLonNhat = viTriDuongDauTien(mang);
        if(viTriDuongLonNhat != -1) {
            for(int i = viTriDuongLonNhat; i < mang.length; i++)
                if (mang[i] >= 0 && mang[i] > mang[viTriDuongLonNhat])
                    viTriDuongLonNhat = i;
            return viTriDuongLonNhat;
        }
        return -1;
    }

    public static int viTriDuongNhoNhat(int[] mang) {
        int viTriDuongNhoNhat = viTriDuongDauTien(mang);
        if(viTriDuongNhoNhat != -1) {
            for(int i = viTriDuongNhoNhat; i < mang.length; i++)
                if (mang[i] >= 0 && mang[i] < mang[viTriDuongNhoNhat])
                    viTriDuongNhoNhat = i;
            return viTriDuongNhoNhat;
        }
        return -1;
    }

    public static String inPTChan(int[] mang) {
        String chuoiChan = "";
        for(int i = 0; i < mang.length; i++)
            if(mang[i]%2 == 0)
                chuoiChan = chuoiChan + mang[i] + " ";
        return chuoiChan;
    }

    public static String inPTLe(int[] mang) {
        String chuoiLe = "";
        for(int i = 0; i < mang.length; i++)
            if(mang[i]%2 != 0)
                chuoiLe = chuoiLe + mang[i] + " ";
        return chuoiLe;
    }

    public static int[] themPhanTu(int[] mang) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri can chen: ");
        int giaTriChen = scanner.nextInt();
        System.out.println("Nhap vao vi tri can chen: ");
        int viTriChen = scanner.nextInt();

        if(viTriChen <= 0) {
            mang = themPhanTuVaoDau(mang, giaTriChen);
        } else if (viTriChen >= mang.length) {
            mang = themPhanTuVaoCuoi(mang, giaTriChen);
        } else {
            mang = themPhanTuVaoBatKy(mang, giaTriChen, viTriChen);
        }
        return mang;
    }

    public static int[] themPhanTuVaoCuoi(int[] mang, int giaTriChen) {
        int[] mangMoi = new int[mang.length + 1];
        for(int i = 0; i < mang.length; i++)
            mangMoi[i] = mang[i];
        mangMoi[mang.length] = giaTriChen;
        return mangMoi;
    }

    public static int[] themPhanTuVaoDau(int[] mang, int giaTriChen) {
        int[] mangMoi = new int[mang.length + 1];
        for(int i = 0; i < mang.length; i++)
            mangMoi[i+1] = mang[i];
        mangMoi[0] = giaTriChen;
        return mangMoi;
    }

    public static int[] themPhanTuVaoBatKy(int[] mang, int giaTriChen, int viTriChen) {
        int[] mangMoi = new int[mang.length + 1];
        for(int i = 0; i < viTriChen; i++)
            mangMoi[i] = mang[i];
        for(int j = viTriChen + 1; j < mang.length + 1; j ++)
            mangMoi[j] = mang[j-1];
        mangMoi[viTriChen] = giaTriChen;
        return mangMoi;
    }

    public static int[] xoaPhanTu(int[] mang) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao vi tri can xoa: ");
        int viTriXoa = scanner.nextInt();

        if(viTriXoa <= 0) {
            mang = xoaPhanTuDau(mang);
        } else if (viTriXoa >= mang.length) {
            mang = xoaPhanTuCuoi(mang);
        } else {
            mang = xoaPhanTuBatKy(mang, viTriXoa);
        }
        return mang;
    }

    public static int[] xoaPhanTuCuoi(int[] mang) {
        int chieuDaiMangMoi = mang.length - 1;
        int[] mangMoi = new int[chieuDaiMangMoi];
        for(int i = 0; i < chieuDaiMangMoi; i++)
            mangMoi[i] = mang[i];
        return mangMoi;
    }

    public static int[] xoaPhanTuDau(int[] mang) {
        int chieuDaiMangMoi = mang.length - 1;
        int[] mangMoi = new int[chieuDaiMangMoi];
        for (int i = 0; i < chieuDaiMangMoi; i++)
            mangMoi[i] = mang[i+1];
        return mangMoi;
    }

    public static int[] xoaPhanTuBatKy(int[] mang, int viTriXoa) {
        int chieuDaiMangMoi = mang.length - 1;
        int[] mangMoi = new int[chieuDaiMangMoi];
        for(int i = 0; i < viTriXoa; i++)
            mangMoi[i] = mang[i];
        for(int j = viTriXoa; j < chieuDaiMangMoi; j++)
            mangMoi[j] = mang[j+1];
        return mangMoi;
    }
}

