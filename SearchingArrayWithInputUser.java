package DasarDasarJava;
import java.util.Scanner;

public class SearchingArrayWithInputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumlahNilaiArray;
		int nilaiYangDicari;
		int hasil;
		boolean hasilPencarian = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Jumlah Array: ");
		jumlahNilaiArray = scanner.nextInt();
		
		int[]array = new int[jumlahNilaiArray];
		
		for(int i = 0; i < jumlahNilaiArray; i++)
		{
			System.out.print((i+1) + " => ");
			array[i] = scanner.nextInt();
		}

		System.out.println("Nilai Array: ");
		for(int j : array)
		{
			System.out.print(j + " ");
		}
		
		System.out.println(" ");
		
		System.out.print("Nilai Yang dicari: ");
		nilaiYangDicari = scanner.nextInt();
		
		for(int k = 0; k < array.length; k++)
		{
			if(nilaiYangDicari == array[k])
			{
				System.out.println("Angka [" + nilaiYangDicari + "] berada di indeks " + (k+1));
				
				hasilPencarian = true;
			}
		}
		
		for(int l =0; l < array.length; l++)
		{
			if(nilaiYangDicari == array[l])
			{
				hasil = (array[l] % 2 == 0) ? (array[l] * 2) : (array[l] * 1);
				
				System.out.println("Hasil: " + hasil);
			}
		}
		
		if(hasilPencarian == false)
		{
			System.out.println("Angka [" + nilaiYangDicari + "] Tidak ada dalam array");
		}
	}

}
