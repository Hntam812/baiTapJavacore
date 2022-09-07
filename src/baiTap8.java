import java.util.Scanner;

public class baiTap8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao chuoi viet thuong : ");
        String str = scanner.nextLine();
        char[] charArray= str.toCharArray();
        boolean foundSpace=true ;
        for (int i =0;i < charArray.length;i++){
            if(Character.isLetter(charArray[i])){
                if(foundSpace){
                    charArray[i]=Character.toUpperCase(charArray[i]);
                    foundSpace=false;
                }
            }else{
                foundSpace=true;
            }
        }
        str = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi : "+str);

    }
}
