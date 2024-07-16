import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap kich thuoc mang
        System.out.println("Nhap kich thuoc mang : ");
        int size = sc.nextInt();

        //Khoi tao mang va nhap cac phan tu trong mang
        int[] arr = new int[size];
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Nhap gia tri can chen
        System.out.println("Nhap gia tri can chen : ");
        int insertValue = sc.nextInt();

        //Nhap vi tri can chen
        System.out.println("Nhap vi tri can chen : ");
        int insertPosition = sc.nextInt();

        //Kiem tra vi tri hop le
        if(insertPosition <= -1 || insertPosition >arr.length-1){
            System.out.println("Vi tri khong hop le.");
            return;
        }

        //Tao mang moi voi kich thuoc lon hon mang cu
        int[] newArr = new int[size+1];
        //Sao chep cac phan tu mang cu sang mang moi va chen gia tri
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if(i == insertPosition){
                newArr[i] = insertValue;
            }else {
                newArr[i] = arr[j++];
            }
        }

        //In mang moi
        System.out.println("Mang moi sau khi chen phan tu "+insertValue+" la: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
