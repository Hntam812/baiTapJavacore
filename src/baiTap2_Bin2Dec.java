import java.util.Scanner;

public class baiTap2_Bin2Dec {
    public static void main(String[] args){
        System.out.println("Nhap vao so nhi phan n :");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int k=0;
        int dec=0;
        do{
            int du = n%10;
            dec=(int) (dec + du*Math.pow(2,k));
            n=n/10;
            k++;
        }while(n>0);
        System.out.println("dang thap phan  :" +dec);
    }
}
