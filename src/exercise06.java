import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap chuoi thu nhat
        System.out.println("Nhap chuoi thu nhat: ");
        String str1 = sc.nextLine();

        //Nhap chuoi thu 2
        System.out.println("Nhap chuoi thu 2: ");
        String str2 = sc.nextLine();

        //Noi 2 chuoi
        String str3 = str1.concat(str2);

        //In chuoi da noi
        System.out.println("Chuoi sau khi noi: "+str3);
    }
}
