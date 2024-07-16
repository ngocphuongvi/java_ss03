import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap kich thuoc mang thu nhat
        System.out.println("Nhap kich thuoc mang 1: ");
        int size1 = sc.nextInt();

        //Khoi tao va nhap cac phan tu cho mang 1
        int[] arr1 = new int[size1];
        System.out.println("Nhap cac phan tu mang 1: ");
        for(int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        //Nhap kich thuoc mang 2
        System.out.println("Nhap kich thuoc mang 2: ");
        int size2 = sc.nextInt();

        //Khoi tao va nhap cac phan tu cho mang 2
        int[] arr2 = new int[size2];
        System.out.println("Nhap cac phan tu mang 2: ");
        for(int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        //Khoi tao mang 3 voi kich thuoc bang tong 2 mang 1 va 2
        int[] arr3 = new int[size1+size2];

        //Sao chep cac phan tu mang 1 vao mang 3
        for(int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }
        //Sao chep cac phan tu mang 2 vao mang  3
        for(int i = 0; i < size2; i++) {
            arr3[size1+i] = arr2[i];
        }

        //In mang 3
        System.out.println("Mang sau khi gop: ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
