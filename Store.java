package DasarDasarJava;
import java.util.Scanner;

public class Store {
	
	
	
	private int kopi;
	private int hargaSusu;
	public static int index = 1;
	private int diskon;
	private String kopiBubuk;
	private String susuKrim;
	public String notasiTitik = ". ";
	public String notasiSamaDengan = " = ";
	
	public Store() {
		this.kopi = 2000;
		this.hargaSusu = 1500;
		
		this.susuKrim = "Susu Krim";
		this.kopiBubuk = "Kopi Hitam";
		this.diskon = 5;
	}
	
	public void pilihpesanan(int pilihan)
	{
		if(pilihan == 1)
		{
			System.out.println("Kopi");
		}
	}
	
	public void questionOrder(int questionOrder)
	{
		String hasil = (questionOrder == 1) ? "Pesan" : "Tidak Pesan";
		
		System.out.println(hasil);
	}
	
	public void title()
	{
		System.out.println("=== List Harga Warung ====\n");
	}
	
	public int getHargaKopi()
	{
		return this.kopi;
	}
	
	public String getkopiBubuk()
	{
		return this.kopiBubuk;
	}
	
	public void catchOrder(int amount)
	{
		System.out.print(getSusuKrim() + this.notasiSamaDengan);
	}

	public int getHargaSusu()
	{
		return this.hargaSusu;
	}
	
	public String getSusuKrim()
	{
		return this.susuKrim;
	}
	
	public void allItem()
	{
		this.title();
		System.out.println((index++) + this.notasiTitik + this.getkopiBubuk() + " \t " + this.notasiSamaDengan + this.getHargaKopi());
		System.out.println((index++) + this.notasiTitik + this.getSusuKrim() + " \t "+ this.notasiSamaDengan + this.getHargaSusu());
		System.out.println();
	}
	
	public static void main(String[] args) {
		int chosen, amount;
		
		Scanner scanner = new Scanner(System.in);
		Store warung = new Store();
		warung.allItem();
		
		System.out.print("Ingin memesan : ");
		chosen = scanner.nextInt();
		
		warung.questionOrder(chosen);
		if(chosen == 1)
		{
			
		}

	}

}
