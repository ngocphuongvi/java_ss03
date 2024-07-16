import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap kich thuoc ma tran
        System.out.println("Nhap so hang ma tran: ");
        int rows = sc.nextInt();
        System.out.println("Nhap so cot ma tran: ");
        int cols = sc.nextInt();

        //Khoi tao ma tran va nhap cac phan tu cua ma tran
        double[][] matrix = new double[rows][cols];
        System.out.println("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        //Tim gia tri lon nhat va toa do cua no
        double max= matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        //In ra ma tran
        System.out.println("Ma tran da nhap: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Hien thi gia tri lon nhat va toa do cua no
        System.out.println("Gia tri lon nhat trong ma tran la: " + max);
        System.out.println("Toa do cua gia tri lon nhat la [" + maxRow + "][" + maxCol + "]: ");
    }
}
