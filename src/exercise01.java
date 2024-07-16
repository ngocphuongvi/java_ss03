import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap kich thuoc mang
        System.out.println("Nhap kich thuoc mang: ");
        int size=sc.nextInt();

        //Khoi tao mang va nhap cac phan tu cua mang
        int[] arr = new int[size];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        //Nhap phan tu can xoa
        System.out.println("Nhap phan tu can xoa: ");
        int xoa=sc.nextInt();

        //Tim vi tri phan tu can xoa
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==xoa){
                index=i;
                break;
            }
        }

        //Neu phan tu khong ton tai trong mang
        if(index==-1){
            System.out.println("Phan tu khong ton tai trong mang");
        }else{
            //Ghi de cac phan tu phia sau len phan tu bi xoa
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }

            //Tao mang moi voi kich thuoc nho hon
            int[] newArr=new int[arr.length-1];
            for(int i=0;i<newArr.length;i++){
                newArr[i]=arr[i];
            }

            //In mang moi
            System.out.println("Mang sau khi xoa phan tu "+xoa+" la: ");
            for(int i=0;i<newArr.length;i++){
                System.out.print(newArr[i]+" ");
            }
        }

    }
}
