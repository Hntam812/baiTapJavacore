import java.util.Scanner;

public class baiTap10 {
    /*Nếu số đó bé hơn 2, kết luận không phải số nguyên tố.
      Đếm số ước của x trong đoạn từ 2 đến căn bậc hai của x.
      Nếu số đó không có ước nào trong đoạn từ 2 đến căn bậc hai của x thì nó là số nguyên tố.
      Ngược lại thì không phải.
     */
    public static void main(String[] args){
        System.out.print("Nhap vao so nguyen N : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tong=0;
        for (int i = 2; i<=N;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count ++;
                }
            }
            if(count==2){
                System.out.print(i+"\t");
                tong=tong +i;
            }
        }
        System.out.println(".Tong cac so nguyen to tu 1 den "+N +" la :" +tong);


    }
}
