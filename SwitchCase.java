package DasarDasarJava;
import java.util.Scanner;

public class SwitchCase {
	public String notasiPerkalian = " * ";
	public String notasiPenjumlahan = " + ";
	public String notasiPenguranngan = " - ";
	public String notasiSamaDengan = " = ";
	public String notasiPembagian = " / ";
	public String notasiSisaBagi = " % ";
	public String notasiPangkat = " ^ ";
	
	public int hasil;
	public double hasilAkar;
	public int numb_a;
	public int numb_b;
	
	Scanner scanner = new Scanner(System.in);
	
	public SwitchCase() {
		this.hasil = 0;
	}
	
	public void perkalian(int numb_a, int numb_b)
	{	
		this.hasil = numb_a * numb_b;
		
		System.out.println(numb_a + this.notasiPerkalian + numb_b + this.notasiSamaDengan + this.hasil);
	}
	
	public void pembagian(int numb_a, int numb_b)
	{
		this.hasil = numb_a / numb_b;
		
		System.out.println(numb_a + this.notasiPembagian + numb_b + this.notasiSamaDengan + this.hasil);
	}
	
	public void penjumlahan(int numb_a, int numb_b)
	{
		this.hasil = numb_a + numb_b;
		
		System.out.println(numb_a + " + " + numb_b + this.notasiSamaDengan + this.hasil);
	}
	
	public void pengurangan(int numb_a, int numb_b)
	{
		this.hasil = numb_a - numb_b;
		
		System.out.println(numb_a + this.notasiPenguranngan + numb_b + this.notasiSamaDengan + this.hasil);
	}
	
	public void sisaBagi(int numb_a, int numb_b)
	{
			this.hasil = numb_a % numb_b;
			
			System.out.println(numb_a + this.notasiSisaBagi + numb_b + this.notasiSamaDengan + this.hasil);
	}
	
	public void akar(int numb_a)
	{
		double convert_numb_a = Double.valueOf(numb_a);
		double hasilConvert = Double.valueOf(this.hasil);
		
		hasilConvert = Math.sqrt(convert_numb_a); 
		
		System.out.println("Akar " + numb_a + this.notasiSamaDengan + hasilConvert);
		
	}
	
	public void pangkat(int numb_a, int numb_b)
	{
		double convert_numb_a = Double.valueOf(numb_a); // conversi dari int ke double
		double convert_numb_b = Double.valueOf(numb_b); // conversi dari int ke double
		double hasilConvert = Double.valueOf(this.hasil); // conversi dari int ke double
		
		hasilConvert =  Math.pow(convert_numb_a, convert_numb_b);
		
		int hasil_convert_to_int = (int) hasilConvert; // conversi dari double ke int
		
		System.out.println(numb_a + this.notasiPangkat + numb_b + this.notasiSamaDengan + hasil_convert_to_int);
	}
	
	public void title()
	{
		System.out.println(" === Kalkulator Sederhana dengan Switch Case ==== \n");
		System.out.println("1. Perkalian");
		System.out.println("2. Pembagian");
		System.out.println("3. Penjumlahan");
		System.out.println("4. Pengurangan");
		System.out.println("5. Sisa Bagi ");
		System.out.println("6. Pangkat");
		System.out.println("7. Akar \n");
	}
	
	public void pilihanSwitchCase(int inputan)
	{
		switch(inputan)
		{
			case 1:
				
				System.out.print("Angka Pertama : ");
				this.numb_a = scanner.nextInt();
				
				System.out.print("Angka Kedua : ");
				this.numb_b = scanner.nextInt();
				
				this.perkalian(this.numb_a, this.numb_b);
			break;
			
			case 2:
				System.out.print("Angka Pertama : ");
				this.numb_a = scanner.nextInt();
				
				System.out.print("Angka Kedua : ");
				this.numb_b = scanner.nextInt();
				
				this.pembagian(this.numb_a, this.numb_b);
			break;
			
			case 3:
				System.out.print("Angka Pertama : ");
				this.numb_a = scanner.nextInt();
				
				System.out.print("Angka Kedua : ");
				this.numb_b = scanner.nextInt();
				
				this.penjumlahan(this.numb_a, this.numb_b);
			break;
			
			case 4:
				System.out.print("Angka Pertama : ");
				this.numb_a = scanner.nextInt();
				
				System.out.print("Angka Kedua : ");
				this.numb_b = scanner.nextInt();
				
				this.pengurangan(this.numb_a, this.numb_b);
			break;
			
			case 5:
				System.out.print("Angka Pertama : ");
				this.numb_a = scanner.nextInt();
				
				System.out.print("Angka Kedua : ");
				this.numb_b = scanner.nextInt();

				this.sisaBagi(this.numb_a, this.numb_b);
			break;
			
			case 6:
				System.out.print("Masukkan angka : ");
				this.numb_a = scanner.nextInt();
				
				System.out.print("Pangkat: ");
				this.numb_b = scanner.nextInt();
				
				this.pangkat(this.numb_a, this.numb_b);
			break;
			
			case 7:
				System.out.print("Angka : ");
				this.numb_a = scanner.nextInt();
				
				this.akar(this.numb_a);
			break;
			
			default:
			System.out.println("Angka " + inputan + " Tidak tersedia.");
		}
	}
	
	public static void main(String[] args) {

		int inputan;
		char pilihan;
		
		Scanner scanner = new Scanner(System.in);
		SwitchCase switchCase = new SwitchCase();
		
		switchCase.title();
		
		System.out.print("Masukkan No pilihan anda: ");
		inputan = scanner.nextInt();

		switchCase.pilihanSwitchCase(inputan);
	}

}
