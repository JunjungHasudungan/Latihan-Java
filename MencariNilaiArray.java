package DasarDasarJava;
import java.util.Scanner;

public class MencariNilaiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilaiYangDicari;
		boolean hasilPencarian = false;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = {
				1, 2, 3, 4
		};
		
		System.out.println("Semua nilai array");
		
		for(int n : numbers)
		{
			System.out.print(n + " ");
		}
		
		System.out.println("");
		
		System.out.print("Masukkan nilai yang dicari : ");
		nilaiYangDicari = scanner.nextInt();
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(nilaiYangDicari == numbers[i])
			{
				System.out.println("nilai [" + nilaiYangDicari + "] Ada, Terletak di indeks " + (i+1));
				
				
				hasilPencarian = true;
			}
		}
		
		if(hasilPencarian == false)
		{
			System.out.println("Tidak ada dalam array");
		}
		
		
	}

}
