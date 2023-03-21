import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Kiem Tra Tam Giac");
        System.out.println(" Nhap canh a Tam giac :");
        double a = input.nextDouble();
        System.out.println(" Nhap canh b Tam giac :");
        double b = input.nextDouble();
        System.out.println(" Nhap canh c Tam giac :");
        double c = input.nextDouble();
        if (!KiemTraTamGiac.checkTamGiac(a,b,c)){
            System.out.println("khong phai la tam giac");
        }
        if (KiemTraTamGiac.checkVuong(a,b,c)){
            System.out.println("Tam Giac vuong");
        }
        if (KiemTraTamGiac.checkCan(a,b,c)){
            System.out.println("tam giac Can");
        }
        if (KiemTraTamGiac.checkDeu(a,b,c)){
            System.out.println("tam giac Deu");
        }
    }
}