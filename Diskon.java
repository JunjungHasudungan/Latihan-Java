package DasarDasarJava;
import java.util.Scanner;

public class Diskon {

	private int hargaDiskon;
	private int hargaKopi;
	private int hargaSusu;
	private int hargaKopiSusu;
	private int hargaIndomieTelor;
	private int hargaBuburKacangIjo;
	private int hargaBuburKetan;
	private int totalSeluruhHargaBarang;
	private int totalHarga;
	private int jumlahPotonganDiskon;
	private int hargaPotonganDiskon;
	private int jumlahTotalSetelahPotonganDiskon;
	private double jumlahDiskon;
	private int incrementJumlahDiskon;
	
	public static int jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu,
	jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanIndomieTelor,
	jumlahUangBayar;
	
	private static char pilihan = 'N';
	
	public String notasiPerkalian = " * ";
	public static String notasiSamaDengan = " = ";
	public String notasiPersen = " % ";
	public static String notasiTambah = " + ";
	public static String notasiRupiah = " Rp.";
	public static String notasiAt = "@";
	
	public static String kopi = "Kopi";
	public static String susu = "Susu";
	public String diskon = "Diskon";
	public static String jumlahUang = "Jumlah Uang";
	public static String hangat = " Hangat";
	public static String dingin = " Dingn";
	public static String uangKembali = "Uang Kembali";
	public static String kopiSusu = "Kopi Susu";
	public static String totalHargaBelanja = "Total Belanja";
	public static String indomieTelor = "Indomie Telor";
	public static String buburKacangIjo = "Bubur Kacang Ijo";
	public static String buburKetan = "Bubur Ketan";
	public static String potonganDiskon = "Potongan Diskon";
	public static String tab = "\t";
	
	public Diskon() {
	this.hargaDiskon = 5;
	this.hargaKopi = 4000;
	this.hargaSusu = 3000;
	this.hargaKopiSusu = 7000;
	this.jumlahPotonganDiskon = 50000;
	this.hargaIndomieTelor = 8000;
	this.hargaBuburKacangIjo = 5000;
	this.hargaBuburKetan = 5000;
	this.jumlahDiskon = 1.5;
	}
	
	public int getHargaKopi()
	{
		return this.hargaKopi;
	}
	
	public String kopi()
	{
		return this.kopi;
	}
	
	public int getHargaSusu()
	{
		return this.hargaSusu;
	}
	
	public int getHargaKopiSusu()
	{
		return this.hargaKopiSusu;
	}
	
	public int getJumlahDiskon()
	{
		return this.hargaDiskon;
	}
	
	public int getHargaBuburKacangIjo()
	{
		return this.hargaBuburKacangIjo;
	}
	
	public int getHargaIndomieTelor()
	{
		return this.hargaIndomieTelor;
	}
	
	public int getHargaBuburKetan()
	{
		return this.hargaBuburKetan;
	}
	
	public int incrementDiskon()
	{
		this.jumlahDiskon = (this.jumlahPotonganDiskon * this.jumlahDiskon);
		
		this.incrementJumlahDiskon = (int) this.jumlahDiskon;
		
		return this.incrementJumlahDiskon;
	}
	
	public void ruleDiskon()
	{
		System.out.println("\nNote:");
		System.out.println("Belanja lebih dari" + notasiRupiah + this.jumlahPotonganDiskon +" mendapat potongan diskon " + this.getJumlahDiskon() + this.notasiPersen);
		System.out.println("Belanja lebih dari" + notasiRupiah + this.incrementDiskon() +" mendapat potongan diskon " + (this.getJumlahDiskon() * 1.5)+ this.notasiPersen + "\n");
	}
	
	public void title() 
	{
		System.out.println("=== Selamat Datang diwarung Hasudungan ====\n");
		System.out.println(kopi + tab + tab + tab + notasiSamaDengan + notasiRupiah + this.getHargaKopi());
		System.out.println(susu + tab + tab + tab + notasiSamaDengan + notasiRupiah + this.getHargaSusu());
		System.out.println(kopi + notasiTambah + susu + tab + tab +  notasiSamaDengan + notasiRupiah + (this.getHargaKopi() + this.getHargaSusu()));
		System.out.println(indomieTelor + tab + tab + notasiSamaDengan + notasiRupiah +  this.getHargaIndomieTelor());
		System.out.println(buburKacangIjo + tab + notasiSamaDengan + notasiRupiah + this.getHargaBuburKacangIjo());
		System.out.println(buburKetan + tab + tab + notasiSamaDengan + notasiRupiah +  this.getHargaBuburKetan());
		this.ruleDiskon();
	}
	
//	check harga seluruh belanja
	public int checkHarga(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu, int jumlahPesanIndomieTelor, 
			int jumlahPesanBuburKacangIjo, int jumlahPesanBuburKetan)
	{
		this.totalSeluruhHargaBarang = (this.getHargaKopi() * jumlahPesanKopi) + (this.getHargaSusu() * jumlahPesanSusu) + 
				
				(this.getHargaKopiSusu() * jumlahPesanKopiSusu) + (this.getHargaIndomieTelor() * jumlahPesanIndomieTelor) +
				
				(this.getHargaBuburKacangIjo() * jumlahPesanBuburKacangIjo) + (this.getHargaBuburKetan() * jumlahPesanBuburKetan);
		
		return this.totalSeluruhHargaBarang;
	}
	
	public int hitungHargaTotal(int jumlahUang, int totalSeluruhHarga)
	{
		this.totalHarga = jumlahUang - totalSeluruhHarga;
		
		return this.totalHarga;
	}
	
	public void perhitunganBelanja(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu, 
			int jumlahPesanIndomieTelor, int jumlahPesanBuburKacangIjo, int jumlahPesanBuburKetan, int jumlahUang)
	{
		if(jumlahPesanKopi <= this.jumlahPotonganDiskon || jumlahPesanSusu <= this.jumlahPotonganDiskon 
				
				|| jumlahPesanKopiSusu <= this.jumlahPotonganDiskon ||jumlahPesanIndomieTelor <= this.jumlahPotonganDiskon || 
				
				jumlahPesanBuburKacangIjo <= this.jumlahPotonganDiskon|| jumlahPesanBuburKetan <= this.jumlahPotonganDiskon)
		{
			this.totalSeluruhHargaBarang = this.checkHarga(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
					jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan);
			
			this.totalHarga =  this.hitungHargaTotal(jumlahUang, this.totalSeluruhHargaBarang);
			
			hargaTotalBelanja(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu,
					jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahUang, this.totalSeluruhHargaBarang, this.totalHarga);
		}
		else if(jumlahPesanKopi >= this.jumlahPotonganDiskon )
		{
			System.out.println("5 %");
		}
	}
	
//	menampilikan 
	public  void hargaTotalBelanja(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu,
			int jumlahPesanIndomieTelor, int jumlahPesanBuburKacangIjo, int jumlahPesanBuburKetan, int jumlahUangBayar,int totalHargaSeluruhBarang, int uangKembali) {
		System.out.println("---------------------------------------");
		System.out.println(kopi +  tab + tab + tab + notasiAt + jumlahPesanKopi + notasiSamaDengan + (jumlahPesanKopi * this.getHargaKopi()));
		System.out.println(susu +  tab + tab + tab + notasiAt +  jumlahPesanSusu + notasiSamaDengan + (jumlahPesanSusu * this.getHargaSusu()));
		System.out.println(kopiSusu + tab  + tab + notasiAt + jumlahPesanKopiSusu + notasiSamaDengan + (jumlahPesanKopiSusu * this.getHargaKopiSusu()));
		System.out.println(indomieTelor + tab + tab + notasiAt + jumlahPesanIndomieTelor + notasiSamaDengan + (jumlahPesanIndomieTelor * getHargaIndomieTelor()));
		System.out.println(buburKacangIjo + tab + notasiAt + jumlahPesanBuburKacangIjo + notasiSamaDengan + (jumlahPesanBuburKacangIjo * getHargaBuburKacangIjo()));
		System.out.println(buburKetan + tab + tab + notasiAt + jumlahPesanBuburKacangIjo + notasiSamaDengan + (jumlahPesanBuburKetan * getHargaBuburKetan()));
		System.out.println("---------------------------------------");
		System.out.println(totalHargaBelanja + this.tab +  notasiSamaDengan + totalHargaSeluruhBarang);
		System.out.println(potonganDiskon + tab + notasiSamaDengan + this.hargaPotonganDiskon);
		System.out.println(jumlahUang + this.tab + notasiSamaDengan + jumlahUangBayar);
		System.out.println(this.uangKembali + this.tab + notasiSamaDengan + uangKembali);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Diskon warungHasudungan = new Diskon();
		warungHasudungan.title();
		
		try {
			
			System.out.print("Ingin Berbelanja [Y|N] : ");
			pilihan = scanner.next().charAt(0);
			
			if(pilihan == 'Y' || pilihan == 'y') {
				System.out.print(kopi + tab + tab + notasiSamaDengan);
				jumlahPesanKopi = scanner.nextInt();
				
				System.out.print(susu + tab + tab + notasiSamaDengan);
				jumlahPesanSusu = scanner.nextInt();
				
				System.out.print(kopiSusu + tab + notasiSamaDengan);
				jumlahPesanKopiSusu = scanner.nextInt();
				
				System.out.print(indomieTelor + tab + notasiSamaDengan);
				jumlahPesanIndomieTelor = scanner.nextInt();
				
				System.out.print(buburKacangIjo  + notasiSamaDengan);
				jumlahPesanBuburKacangIjo = scanner.nextInt();
				
				System.out.print(buburKetan + tab + notasiSamaDengan);
				jumlahPesanBuburKetan = scanner.nextInt();
				
				System.out.print(jumlahUang + tab + notasiSamaDengan);
				jumlahUangBayar = scanner.nextInt();
				
			}else {
				System.out.println("Program selesai");
			}	
		}catch(Exception e) {
			System.out.println("Inputan yang anda masukkan tidak ada disistem");
		}
		
		warungHasudungan.perhitunganBelanja(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo,
				jumlahPesanBuburKetan, jumlahUangBayar);
		
	}

}
