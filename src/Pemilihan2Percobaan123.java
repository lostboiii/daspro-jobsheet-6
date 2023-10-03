import java.util.Scanner;

public class Pemilihan2Percobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner (System.in);
        int tahun;

        System.out.println("Masukkan tahun : ");
        tahun = input23.nextInt();

        if ((tahun % 400) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat   ");
        }
        else{
            System.out.println("Bukan Tahun Kabisat");
        }
        input23.close();
    }
}
