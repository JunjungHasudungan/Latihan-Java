package DasarDasarJava;
import java.util.Scanner;

public class Warung {
	public static char pilihan = 'N';
	public static String kopi = "Kopi";
	public static String susu = "Susu";
	public static String kopiSusu = "Kopi Susu";
	public static String indomieTelor = "Indomie Telor";
	public static String buburKacangIjo = "Bubur Kacang Ijo ";
	public static String buburKetan = "Bubur Ketan";
	public static String gorengan = "Gorengan";
	public static String kerupuk = "Kerupuk";
	
	public static String titik = ".";
	public static String samaDengan = " = ";
	public static String tab = " \t ";
	public static String jumlahUang = "Jumlah Uang";
	public static String totalBelanja = "Total Belanja";
	public static String totalSementara = "Total Sementara";
	public static String uangKembali = "Uang Kembali";
	public static String potonganDiskon = "Potongan Diskon";
	public static String hargaSetelahPotonganDiskon = "Harga Setelah Diskon";
	public static String at = "@";
	public static String rupiah = "Rp.";
	public static String persen = "%";
//	public static String 

//	pesanan
	public static int jumlahPesanKopi;
	public static int jumlahPesanSusu;
	public static int jumlahPesanKopiSusu;
	public static int jumlahPesanIndomieTelor;
	public static int jumlahPesanBuburKacangIjo;
	public static int jumlahPesanBuburKetan;
	public static int jumlahPesanGorengan;
	public static int jumlahPesanKerupuk;
	
//	persenan
	public static int jumlahPersenDiskon;
	private static int jumlahPotonganDiskon;
	private static double jumlahIncrementPersenDiskon;
	private static double conversiIncrementJumlahPotonganDiskon;
	public static int jumlahBayar;
	private int hargaKopi; 
	private static int hargaSusu;
	private static int hargaKopiSusu;
	private static int hargaIndomieTelor;
	private static int hargaBuburKacangIjo;
	private static int hargaBuburKetan;
	private static int hargaGorengan;
	private static int hargaKerupuk;
	private static int jumlahHargaSeluruhPesanan;
	private int totalBelanjaSeluruhPesanan;
	private static int totalpotonganHargaDiskon;
	private static int totalBelanjaSeluruhPesananSementara; // 
	private static int uangKembalian;
	private static int hasilPotonganDiskon;
	private static int hargaSetelahDiskon;
	private static int hasilConversi;

	public static int index = 1;
	
	public Warung() {
		jumlahPersenDiskon = 5;
		jumlahIncrementPersenDiskon = 1.5;
		jumlahPotonganDiskon = 50000;
		hargaKopi = 3000;
		hargaSusu = 3000;
		hargaKopiSusu = 6000;
		hargaIndomieTelor = 8000;
		hargaBuburKacangIjo = 5000;
		hargaBuburKetan = 5000;
		hargaGorengan = 1500;
		hargaKerupuk = 1000;
	}

	public int getHargaKopi()
	{
		return this.hargaKopi;
	}
	
	public int getHargaSusu()
	{
		return hargaSusu;
	}
	
	public int getHargaKopiSusu()
	{
		return hargaKopiSusu;
	}
	
	public int getHargaIndomieTelor()
	{
		return hargaIndomieTelor;
	}
	
	public int getHargaBuburKacangIjo()
	{
		return hargaBuburKacangIjo;
	}
	
	public int getHargaBuburKetan()
	{
		return hargaBuburKetan;
	}
	
	public int getHargaGorengan()
	{
		return hargaGorengan;
	}
	
	public int getHargaKerupuk()
	{
		return hargaKerupuk;
	}
	
	public void listHarga()
	{
		System.out.println("==== Selamat Datang diwarung Kopi Kang Sudung ====");
		System.out.println("List Harga: ");
		System.out.println("-------------------------------------------------------");
		System.out.println(kopi + tab + tab + tab + samaDengan + this.getHargaKopi());
		System.out.println(susu + tab + tab + tab + samaDengan + this.getHargaSusu());
		System.out.println(kopiSusu + tab + tab + samaDengan + this.getHargaKopiSusu());
		System.out.println(indomieTelor + tab + tab + samaDengan + this.getHargaIndomieTelor());
		System.out.println(buburKacangIjo + tab + samaDengan + this.getHargaBuburKacangIjo());
		System.out.println(buburKetan + tab + tab + samaDengan + this.getHargaBuburKetan());
		System.out.println(gorengan + tab + tab + samaDengan + this.getHargaGorengan());
		System.out.println(kerupuk + tab + tab + samaDengan + this.getHargaKerupuk());
		System.out.println("-------------------------------------------------------");
		rules();
	}
	
	// menghitung total seluruh pesanan  
	public int hitungHargaSeluruhPesanan(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu, int jumlahPesanIndomieTelor, 
										int jumlahPesanBuburKacangIjo, int jumlahPesanBuburKetan, int jumlahPesanGorengan, int jumlahPesanKerupuk)
	{
		this.jumlahHargaSeluruhPesanan = (jumlahPesanKopi * this.getHargaKopi()) + (jumlahPesanSusu * this.getHargaSusu()) + 
				
				(jumlahPesanKopiSusu * this.getHargaKopiSusu()) + (jumlahPesanIndomieTelor * this.getHargaIndomieTelor()) + 
				
				(jumlahPesanBuburKacangIjo * this.getHargaBuburKacangIjo()) + (jumlahPesanBuburKetan * this.getHargaBuburKetan()) + 
				
				(jumlahPesanGorengan * this.getHargaGorengan()) + (jumlahPesanKerupuk * this.getHargaKerupuk());
		
		return this.jumlahHargaSeluruhPesanan;
	}
	
//	menghitung harga seluruh pesanan dengan uang banyar
	public int  hitungHargaSeluruhPesananTotalSementara(int jumlahPesanKopi, int jumlahUang)
	{
		this.totalBelanjaSeluruhPesananSementara =  jumlahUang - this.hitungHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
				jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk);
		
		return this.totalBelanjaSeluruhPesananSementara;
		
	}
	
	public int checkPotonganDiskon(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu, int jumlahPesanIndomieTelor, 
			int jumlahPesanBuburKacangIjo, int jumlahPesanBuburKetan, int jumlahPesanGorengan, int jumlahPesanKerupuk, int jumlahUang)
	{
		totalBelanjaSeluruhPesananSementara =  this.hitungHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
				jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk);
		
		if(totalBelanjaSeluruhPesananSementara <= jumlahPotonganDiskon)
		{
			 return totalBelanjaSeluruhPesananSementara;
		}
		else if(totalBelanjaSeluruhPesananSementara >= jumlahPotonganDiskon && 
				
				totalBelanjaSeluruhPesananSementara <= (jumlahPotonganDiskon * jumlahIncrementPersenDiskon))
		{
			conversiIncrementJumlahPotonganDiskon = jumlahPotonganDiskon * jumlahIncrementPersenDiskon;
			
			 hasilConversi = (int) conversiIncrementJumlahPotonganDiskon;
			
			return hasilConversi;
		}
		else if(totalBelanjaSeluruhPesananSementara >= (jumlahPotonganDiskon * 1.5) && totalBelanjaSeluruhPesananSementara <= (jumlahPotonganDiskon * 2))
			{
				return totalBelanjaSeluruhPesananSementara;
			}
		else {
				return 0;
		}
	}
	
//	menampilkan hasil 
	public void show(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu, int jumlahIndomieTelor, int jumlahBuburKacangIjo,
			int jumlahPesanBuburKetan, int jumlahPesanGorengan, int jumlahPesanKerupuk, int jumlahUang, int totalPotonganHargaDiskon, int uangKembali)
	{
		System.out.println("---------------------------------------------");
		System.out.println(kopi + tab + tab + at + jumlahPesanKopi + tab + samaDengan + rupiah + (jumlahPesanKopi * this.getHargaKopi()));
		System.out.println(susu + tab + tab + at + jumlahPesanSusu + tab + samaDengan + rupiah + (jumlahPesanSusu * this.getHargaSusu()));
		System.out.println(kopiSusu + tab + at + jumlahPesanKopiSusu + tab + samaDengan + rupiah + (jumlahPesanKopiSusu * this.getHargaKopiSusu()));
		System.out.println(indomieTelor + tab + at + jumlahPesanIndomieTelor + tab + samaDengan + rupiah + (jumlahPesanIndomieTelor * getHargaIndomieTelor()));
		System.out.println(buburKacangIjo + at + jumlahPesanBuburKacangIjo + tab + samaDengan + rupiah + (jumlahPesanBuburKacangIjo * getHargaBuburKacangIjo()));
		System.out.println(buburKetan + tab + at + jumlahPesanBuburKetan + tab + samaDengan + rupiah + (jumlahPesanBuburKetan * getHargaBuburKetan()));
		System.out.println(gorengan + tab + at + jumlahPesanGorengan + tab + samaDengan + rupiah + (jumlahPesanGorengan * getHargaGorengan()));
		System.out.println(kerupuk + tab + at + jumlahPesanKerupuk + tab + samaDengan + rupiah + (jumlahPesanKerupuk * getHargaKerupuk()));
		System.out.println("---------------------------------------------");
		System.out.println(totalSementara + tab + samaDengan + rupiah + jumlahHargaSeluruhPesanan);
		System.out.println(potonganDiskon + tab + samaDengan + rupiah + hasilPotonganDiskon);
		System.out.println(hargaSetelahPotonganDiskon + tab + samaDengan + rupiah + hargaSetelahDiskon);
		System.out.println(this.jumlahUang + tab + tab + samaDengan + rupiah + jumlahUang);
		System.out.println(this.uangKembali + tab + tab + samaDengan + rupiah + uangKembalian);
		
	}
	
//	check 
	public void checkHargaSeluruhPesanan(int jumlahPesanKopi, int jumlahPesanSusu, int jumlahPesanKopiSusu, int jumlahIndomieTelor,
			int jumlahPesanBuburKacangIjo, int jumlahPesanBuburKetan, int jumlahPesanGorengan, int jumlahPesanKerupuk, int jumlahUang)
	{
		
		jumlahHargaSeluruhPesanan =  this.hitungHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
				jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk);
		
		conversiIncrementJumlahPotonganDiskon =  jumlahPotonganDiskon * jumlahIncrementPersenDiskon;
		
		hasilConversi = (int) conversiIncrementJumlahPotonganDiskon;
		
	
		if(jumlahHargaSeluruhPesanan <= jumlahPotonganDiskon) // Tidak Dpat Diskon
		{
			totalBelanjaSeluruhPesananSementara =  hitungHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
					jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk);

			uangKembalian = jumlahUang - totalBelanjaSeluruhPesananSementara;
			
			this.show(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, jumlahPesanIndomieTelor, 
					jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk,
					jumlahUang, hasilPotonganDiskon, uangKembalian );
		}
		else if(jumlahHargaSeluruhPesanan >= jumlahPotonganDiskon && jumlahHargaSeluruhPesanan <= hasilConversi)
		{
			totalBelanjaSeluruhPesananSementara =  hitungHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
					jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk);
			
			hasilPotonganDiskon = ((totalBelanjaSeluruhPesananSementara * jumlahPersenDiskon) / 100);
			
			hargaSetelahDiskon = totalBelanjaSeluruhPesananSementara - ((totalBelanjaSeluruhPesananSementara * jumlahPersenDiskon) / 100);
			
			uangKembalian = jumlahUang - hargaSetelahDiskon;
			
			this.show(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo,
					jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk, jumlahUang, hasilPotonganDiskon, uangKembalian);
//			System.out.println(hasilConversi);
		}else if(jumlahHargaSeluruhPesanan >= hasilConversi && jumlahHargaSeluruhPesanan <= (jumlahPotonganDiskon * 2))
		{
			totalBelanjaSeluruhPesananSementara =  hitungHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, 
					jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk);
			
			hasilPotonganDiskon = ((totalBelanjaSeluruhPesananSementara * (jumlahPersenDiskon * 2)) / 100);
			
			hargaSetelahDiskon = totalBelanjaSeluruhPesananSementara - ((totalBelanjaSeluruhPesananSementara * (jumlahPersenDiskon * 2)) / 100);
			
			uangKembalian = jumlahUang - hargaSetelahDiskon;
			
			this.show(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, jumlahPesanIndomieTelor, jumlahPesanBuburKacangIjo,
					jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk, jumlahUang, hasilPotonganDiskon, uangKembalian);
		}
		else {
			System.out.println("Maaf, Jumlah Terlalu Banyak");
		}

	}
	
	public void rules()
	{
		conversiIncrementJumlahPotonganDiskon =  jumlahPotonganDiskon * jumlahIncrementPersenDiskon;
		
		hasilConversi = (int) conversiIncrementJumlahPotonganDiskon;
		
		System.out.println("Note:");
		System.out.println("Belanja Diatas " + rupiah + jumlahPotonganDiskon + " Mendapat potongan Diskon " + jumlahPersenDiskon + persen );
		System.out.println("Belanja Diatas " + rupiah + hasilConversi  
				+ " Mendapat Potongan Diskon " + (jumlahPersenDiskon * 2) + persen);
		System.out.println("-------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Warung warung = new Warung();
		
		warung.listHarga();
		
		System.out.print("Ingin Berbelanja [Y|N] : ");
		pilihan = scanner.next().charAt(0);
		
		if(pilihan == 'Y' || pilihan == 'y')
		{
			System.out.print((index++) + titik + kopi + tab + tab + tab + samaDengan);
			jumlahPesanKopi = scanner.nextInt();
			
			System.out.print((index++) + titik + susu + tab + tab + tab + samaDengan);
			jumlahPesanSusu = scanner.nextInt();
			
			System.out.print((index++) + titik + kopiSusu + tab + tab + samaDengan);
			jumlahPesanKopiSusu = scanner.nextInt();
			
			System.out.print((index++) + titik + indomieTelor + tab + samaDengan);
			jumlahPesanIndomieTelor = scanner.nextInt();
			
			System.out.print((index++) + titik + buburKacangIjo + tab + samaDengan);
			jumlahPesanBuburKacangIjo = scanner.nextInt();
			
			System.out.print((index++) + titik + buburKetan + tab + tab + samaDengan);
			jumlahPesanBuburKetan = scanner.nextInt();
			
			System.out.print((index++) + titik + gorengan + tab + tab + samaDengan);
			jumlahPesanGorengan = scanner.nextInt();
			
			System.out.print((index++) + titik + kerupuk + tab + tab + samaDengan);
			jumlahPesanKerupuk = scanner.nextInt();
			
			System.out.print(jumlahUang + tab + tab + samaDengan);
			jumlahBayar = scanner.nextInt();
			
		}else {
			System.out.println("Program Stop");
		}
		
		warung.checkHargaSeluruhPesanan(jumlahPesanKopi, jumlahPesanSusu, jumlahPesanKopiSusu, jumlahPesanIndomieTelor,
				jumlahPesanBuburKacangIjo, jumlahPesanBuburKetan, jumlahPesanGorengan, jumlahPesanKerupuk, jumlahBayar);
	}

}
