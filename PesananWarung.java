package DasarDasarJava;
import java.util.Scanner;


public class PesananWarung {

	public int hargaBakso;
	public String nama;
	public int hargaBuburAyam;
//	`
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Menu dan harga ==== ");
		System.out.println("Kopi \t\t= Rp.5.000");
		System.out.println("Bubur Ayam \t= Rp.12.000");
		System.out.println("Bakso \t\t= Rp.15.000 \n");
		
		char jawab = 'Y';
		int jumlahPesanan;
	
	String[] menus = {
		"Kopi", "Bubur ayam", "Bakso"	
	};
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Ingin memesan [Y|N]:  ");
	char jawaban = scanner.next().charAt(0);
	

	if(jawaban == 'Y' || jawaban == 'y')
	{
		
		for(String menu : menus)
		{
			System.out.print(menu + " = ");
			
			jumlahPesanan = scanner.nextInt();
			
			int[] pesanan  = new int[jumlahPesanan];
		}
	}else {
		System.out.println("Inputan salah..");
	}
	
		
	}

}
