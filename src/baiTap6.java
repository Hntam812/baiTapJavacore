import java.util.Scanner;

public class baiTap6 {
    public static void main(String[] args){
        System.out.println("Mhap vao mot chuoi : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int n= str.length()-1;
        for (int i=n;i>=0;i--){
            System.out.print(str.charAt(i)); // in ki tu chuoi tai i
        }
    }
}
