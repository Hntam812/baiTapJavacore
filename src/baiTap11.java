import java.util.Scanner;

public class baiTap11 {
//    // driver code
//    public static void main(String args[]) {
//        double a = 4.3;
//        double b = 1.0 / 0;
//        double c = 0.0;
//        double d = -0.0;
//        double e = -2.3;
//
//        System.out.println(Math.floor(a));
//
//        // Input Infinity, Output Infinity
//        System.out.println(Math.floor(b));
//
//        // Input Positive Zero, Output Positive Zero
//        System.out.println(Math.floor(c));
//
//        // Input Negative Zero, Output Negative Zero
//        System.out.println(Math.floor(d));
//
//        // Input -2.3, Output -3.0
//        // Nearest Integer(-3.0) < less than (-2.3)
//        System.out.println(Math.floor(e));
//    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien n = ");
        int n = scanner.nextInt();

        double log2 = Math.log10(n) / Math.log10(2);
        if(log2 == Math.floor(log2)) {
            double ketQua = Math.floor(log2) - 1;
            System.out.println("Ket qua la: " + (int) ketQua);
        } else {
            System.out.println("Ket qua la: " + (int) Math.floor(log2));
        }
    }
}
