import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("Chương trình quản lý mảng".toUpperCase());
        System.out.print("Nhập độ dài mảng: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Lần lượt nhập các phần tử (số nguyên) của mảng: ");
        int[] mang = new int[length];
        for (int i=0; i<length; i++){
            mang[i] = sc.nextInt();
        }

        //Xác nhận mảng
        System.out.println("Mảng đã nhập là: ");
        for (int i=0; i<length; i++){
            System.out.print(mang[i] + " ");
        }
        System.out.println();
        GiaTriTrungBinh(length,mang);
        MaxMin(length,mang);
        MaxMinNegative(length,mang);
        MaxMinPositive(length,mang);
        InChanLe(length,mang);
        ThemPhanTu(length,mang);
        XoaPhanTu(length,mang);
    }

    public static void GiaTriTrungBinh(int length, int[] mang){
        int tong = 0;
        for (int i=0; i<length; i++) {
            tong += mang[i];
        }
        double TB = (double) tong/length;
        System.out.println("Giá trị trung bình của mảng là: " + TB + "\n");
    }

    public static void MaxMin(int length, int[] mang){
        int max = mang[0];
        int min = mang[0];
        for (int i=0; i<length; i++){    //Tìm max
            if(max<mang[i]){
                max = mang[i];
            }
        }
        for (int i=0; i<length; i++){    //Tìm min
            if(min>mang[i]){
                min = mang[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min + "\n");
    }

    public static void MaxMinNegative(int length, int[] mang){
        int max = 0;
        int min = 0;
        int first = 0;            //index phần tử âm đầu tiên
        for (int i=0; i < length; i++){  //Tìm phần tử âm đầu tiên và gán nó là max và min rồi break vòng lặp
            if (mang[i] < 0){
                max = mang[i];
                min = mang[i];
                first = i;
                break;
            }
        }
        for (int i=first; i<length; i++){ //So phần tử max (âm đầu tiên) với từng phần tử âm còn lại
            if(mang[i]<0 && mang[i]>max){
                max = mang[i];
            }
        }
        for (int i=first; i<length; i++){ //So phần tử min (âm đầu tiên) với từng phần tử âm còn lại
            if(mang[i]<0 && mang[i]<min){
                min = mang[i];
            }
        }
        if(max!=0) {
            System.out.println("Phần tử âm lớn nhất của mảng là: " + max);
        } else{     //Trường hợp mảng không có số âm thì max đang = 0
            System.out.println("Phần tử âm lớn nhất của mảng là: Mảng không có số âm");
        }
        if(max!=0) {
            System.out.println("Phần tử âm nhỏ nhất của mảng là: " + min + "\n");
        } else{     //Trường hợp mảng không có số âm thì min đang = 0
            System.out.println("Phần tử âm lớn nhất của mảng là: Mảng không có số âm");
        }
    }
    public static void MaxMinPositive(int length, int[] mang){
        int max = 0;
        int min = 0;
        int first = 0;            //index phần tử dương đầu tiên
        for (int i=0; i < length; i++){  //Tìm phần tử dương đầu tiên và gán nó là max và min rồi break vòng lặp
            if (mang[i] >= 0){
                max = mang[i];
                min = mang[i];
                first = i;
                break;
            }
        }
        for (int i=first; i<length; i++){ //So phần tử max (dương đầu tiên) với từng phần tử âm còn lại
            if(mang[i]>=0 && mang[i]>max){
                max = mang[i];
            }
        }
        for (int i=first; i<length; i++){ //So phần tử min (dương đầu tiên) với từng phần tử âm còn lại
            if(mang[i]>=0 && mang[i]<min){
                min = mang[i];
            }
        }
        if(max!=0) {
            System.out.println("Phần tử dương lớn nhất của mảng là: " + max);
        } else{     //Trường hợp mảng không có số dương thì max đang = 0
            System.out.println("Phần tử dương lớn nhất của mảng là: Mảng không có số dương");
        }
        if(max!=0) {
            System.out.println("Phần tử dương nhỏ nhất của mảng là: " + min + "\n");
        } else{     //Trường hợp mảng không có số dương thì min đang = 0
            System.out.println("Phần tử dương lớn nhất của mảng là: Mảng không có số dương");
        }
    }

    public static void InChanLe(int length,int[] mang){
        List<String> soChan = new ArrayList<>() ;
        List<String> soLe = new ArrayList<>() ;
        for (int i=0; i<length;i++) {
            if((mang[i]%2) ==0) {
                soChan.add(String.format("%d", mang[i]));
            } else{
                soLe.add(String.format("%d", mang[i]));
            }
        }
        System.out.println("Các phần tử chẵn trong mảng là: ");
        System.out.println(soChan);
        System.out.println("Các phần tử lẻ trong mảng là: ");
        System.out.println(soLe + "\n");
    }
    public static void ThemPhanTu(int length, int[] mang){
        //Thể hiện mảng đang có để người dùng kiểm tra
        System.out.println("Mảng đang có hiện tại là: ");
        for (int i=0; i<length;i++){
            System.out.print(mang[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);

        //Index được phép từ 0 tới length
        int index = length+1;     //Vượt quá length 2 vị trí để tạo vòng lặp sai
        do {
            System.out.print("Nhập vị trí hợp lệ muốn thêm vào mảng (từ 0 -> độ dài mảng): ");
            index = sc.nextInt();
        } while (index<0 || index>length);

        System.out.print("Nhập giá trị cần thêm: ");
        int value = sc.nextInt();
        int[] mangDaThem= new int[length+1];
        List<Integer> temp = new ArrayList<>();

        if (index == length){      //Thêm vào cuối mảng
            for (int i=0; i<length;i++) {
                temp.add(mang[i]);
            }
            temp.add(value);
            for (int i=0; i<=length; i++){
                mangDaThem[i] = temp.get(i);
            }
            temp.clear();
        }
        else if (index == 0){    //Thêm vào đầu mảng
            temp.add(value);
            for (int i=0; i<length;i++){
                temp.add(mang[i]);
            }
            for (int i=0; i<=length; i++){
                mangDaThem[i] = temp.get(i);
            }
        }
        else{          //Thêm vào giữa mảng
            for(int i=0; i<index;i++){
                temp.add(mang[i]);
            }
            temp.add(value);
            for (int i=index; i<length;i++) {
                temp.add(mang[i]);
            }
            for (int i=0; i<length+1; i++){
                mangDaThem[i] = temp.get(i);
            }
        }
        System.out.print("Mảng đã thêm là: ");
        for(int i=0; i<length+1;i++){
            System.out.print(mangDaThem[i] + " ");
        }
        System.out.println("\n");
    }

    public static void XoaPhanTu(int length, int[] mang){
        //Thể hiện mảng đang có để người dùng kiểm tra
        System.out.println("Mảng đang có hiện tại là: ");
        for (int i=0; i<length;i++){
            System.out.print(mang[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);

        //Index được phép từ 0 tới length
        System.out.print("Nhập vị trí cần xóa: ");
        int index = sc.nextInt();
        while (index<0 || index>length) {
            System.out.print("Nhập vị trí hợp lệ cần xóa): ");
            index = sc.nextInt();
        }

        int[] mangDaXoa= new int[length-1];
        List<Integer> temp = new ArrayList<>();

        if (index == length){      //Xóa ở cuối mảng
            for (int i=0; i<length-1;i++) {
                temp.add(mang[i]);
            }
            for (int i=0; i<length-1; i++){
                mangDaXoa[i] = temp.get(i);
            }
            temp.clear();
        }
        else if (index == 0){    //Xóa ở đầu mảng
            for (int i=1; i<length;i++){
                temp.add(mang[i]);
            }
            for (int i=0; i<length-1; i++){
                mangDaXoa[i] = temp.get(i);
            }
        }
        else{          //Xóa ở giữa mảng
            for(int i=0; i<index;i++){
                temp.add(mang[i]);
            }
            for (int i=index+1; i<length;i++) {
                temp.add(mang[i]);
            }
            for (int i=0; i<length-1; i++){
                mangDaXoa[i] = temp.get(i);
            }
        }
        System.out.print("Mảng đã thêm là: ");
        for(int i=0; i<length-1;i++){
            System.out.print(mangDaXoa[i] + " ");
        }
        System.out.println("\n");
    }
}
