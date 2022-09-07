import java.util.Scanner;

public class baiTap18 {
    /*
    số tiền lãi = (P × R × T)/100
    Trong đó:

    P là số tiền gốc
    R là lãi xuất mỗi năm
    T là thời gian (tính bằng năm)
     */
    public static void main(String[] args){
        float tienGui, thoiGian, laiSuat, tienLai, tienLanh;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap vao so tien gui : ");
        tienGui= scanner.nextFloat();
        System.out.print("Nhap vao lai suat hang nam(%) : ");
        laiSuat= scanner.nextFloat();
        System.out.print("Nhap vao so tien lai muon  : ");
        tienLai= scanner.nextFloat();
        tienLanh=tienGui+tienLai;
        thoiGian=(tienLai*100)/(tienGui*laiSuat);
        System.out.print("Thoi gian can gui la : " +thoiGian + " nam" +" de lanh dc so tien " +tienLanh);

    }
}
