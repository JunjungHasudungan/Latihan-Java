package DasarDasarJava;
import java.util.Scanner;

public class PerkalianGanjilGenap {

	public static void main(String[] args) 
	{
		int input_angka;
		int hasil;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan angka \t: ");
		input_angka = scanner.nextInt();
		
//		if(input_angka % 2 == 0)
//		{
//			hasil = input_angka * 2;
//			
//			System.out.println("Hasil \t: " + hasil);
//		}else {
//			hasil = input_angka * 1;
//			
//			System.out.println("Hasil \t:" + hasil);
//		}
			hasil = (input_angka % 2 == 0 ) ? (input_angka * 2) : (input_angka * 1 );
			
			System.out.println("Hasil \t: " + hasil);
	}

}
