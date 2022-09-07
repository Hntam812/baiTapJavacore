import java.util.Scanner;

public class baiTap5 {
    public static void main(String[] args){
        //Cach 1
        System.out.println("Nhap vao toa do diem A :");
        Scanner scanner=new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Nhap vao toa do diem B :");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double xAB, yAB, moduleAB;
        xAB=x1-x2;
        yAB=y1-y2;
        moduleAB=Math.sqrt(xAB*xAB+yAB*yAB);
        System.out.println("Do dai doan thang AB = "+moduleAB);
        //Cach 2: su dung mang

    }
}
