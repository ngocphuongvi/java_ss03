import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap chuoi cha
        System.out.println("Nhap chuoi cha: ");
        String str=sc.nextLine();

        //Nhap chuoi con
        System.out.println("Nhap chuoi con: ");
        String subStr=sc.nextLine();

        //Kiem tra xem chuoi cha co chua chuoi con khong
        boolean contains = str.contains(subStr);

        //In ket qua
        if(contains){
            System.out.println("Chuoi {"+ str+ "} co chua chuoi con {"+subStr+"}" );
        }else {
            System.out.println("Chuoi {"+ str+ "} khong chua chuoi con {"+subStr+"}" );
        }
    }
}
