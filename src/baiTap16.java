import java.util.Scanner;

public class baiTap16 {
    /*
    * Năm nhuận là:
      Năm chia hết cho 4 nhưng không chia hết cho 100.
      Hoặc năm chia hết cho 400.
    * */
    public static void main(String[] args){
        System.out.println("CHUONG TRINH KI MTRA NAM NHUAN");
        System.out.println("Nhap vao nam kiem tra : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("Nam " +year +" la nam nhuan.");
        }else {
            System.out.println("Nam " +year +" la nam khong nhuan.");
        }
    }
}
