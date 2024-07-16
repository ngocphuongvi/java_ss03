import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap kich thuoc mang
        System.out.println("Nhap kich thuoc mang: ");
        int size=sc.nextInt();

        //Khoi tao mang va nhap cac phan tu cho mang
        int[] arr=new int[size];
        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //Tim gia tri nho nhat trong mang
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        //In mang
        System.out.println("Mang duoc nhap la: " );
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Hien thi gia tri nho nhat
        System.out.println("Gia tri nho nhat trong mang la: "+min);
    }
}
