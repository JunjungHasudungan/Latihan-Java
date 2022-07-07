package DasarDasarJava;
import java.util.Scanner;

public class ArrayInputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_angka;
		int hasil;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Jumlah Angka: ");
		input_angka = scanner.nextInt();
		
		int[] angka = new int [input_angka];
		
		for(int i = 0; i < input_angka; i++)
		{
			System.out.print((i+1) + " => ");
			angka[i] = scanner.nextInt();
		}
		
		System.out.println("=== Hasil input user ===");
		
		for(int j : angka)
		{
			hasil = (j % 2 == 0) ? (j * 2) : (j * 1);
			
			System.out.println(hasil);
		}
	}

}
