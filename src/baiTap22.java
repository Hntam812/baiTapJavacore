import java.util.Arrays;
import java.util.Scanner;


public class baiTap22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoiNhap = scanner.nextLine();
        String chuoiKetQua = subStringPalindromic(chuoiNhap);
        System.out.println("Sub string palindromic co do dai dai nhat la:");
        System.out.println(chuoiKetQua);
    }

    public static String stringPalindromic(String s) {
        int chieuDaiChuoi = s.length();
        int[][] maTranKetQua = new int[chieuDaiChuoi][chieuDaiChuoi];
        for (int i = 0; i < chieuDaiChuoi; i++)
            for (int j = 0; j < chieuDaiChuoi; j++)
                maTranKetQua[i][j] = 0;
        for (int i = 0; i < chieuDaiChuoi; i++)
            maTranKetQua[i][i] = 1;
        int indexBatDau = 0;
        int indexKetThuc = 1;
        int chieuDaiPalindromic = 1;
        for (int chieuDaiSubString = 2; chieuDaiSubString <= chieuDaiChuoi; chieuDaiSubString++) {
            for (int i = 0; i < chieuDaiChuoi - chieuDaiSubString + 1; i++) {
                int j = i + chieuDaiSubString - 1;
                if (chieuDaiSubString == 2 && s.charAt(i) == s.charAt(j)){
                    maTranKetQua[i][j] = 1;
                } else if(chieuDaiSubString > 2 && s.charAt(i) == s.charAt(j) && maTranKetQua[i+1][j-1] == 1) {
                    maTranKetQua[i][j] = 1;
                } else {
                    maTranKetQua[i][j] = 0;
                }
                if(maTranKetQua[i][j] == 1) {
                    indexBatDau = i;
                    indexKetThuc = j;
                    chieuDaiPalindromic = Math.max(chieuDaiPalindromic, chieuDaiSubString);
                };
            }
        }
        return s.substring(indexBatDau, indexKetThuc+1);
    }

    public static String subStringPalindromic(String s) {
        String stringPalindromic = stringPalindromic(s);
        double length = stringPalindromic.length();
        double index = Math.ceil(length/2);
        return stringPalindromic.substring((int) index);
    }
}
