package DasarDasarJava;

public class JenisOperator {

	public static void main(String[] args) {
		// deklarasi variable
		int a = 4;
		int b = 2;
		int c = 3;
		int d = 4;
		
//		operator aritmatika
		int penjumlahan = a + b;
		int pengurangan = a - b;
		int perkalian = a * b;
		int pembagian = a / b; 
		int sisaBagi = a % b;
		int increment = ++a;
		int decrement = --c;
		
//		operator penugasan

		int penambahan = c += d;
		
		System.out.println("=== Belajar Menggunakan Operator ===\n");
		System.out.println("1. Operator Aritamtika.");
		System.out.println("\t a. Penjumlahan \t => "  + a + " + " + b + " = " + penjumlahan);
		System.out.println("\t b. Pengurangan \t => " +  a + " - " + b + " = " + pengurangan);
		System.out.println("\t c. Perkalian \t\t => " + a + " * " + b + " = " + perkalian);
		System.out.println("\t d. Pembagian \t\t => " + a + " / " + b + " = " + pembagian);
		System.out.println("\t e. Sisa bagi \t\t => " + a + " % " + b + " = " + sisaBagi);
		System.out.println("\t f. Increment \t\t => " + increment);
		System.out.println("\t g. Decrement \t\t => " + decrement);
		System.out.println("");
		System.out.println("2. Operator Penugasan.");
		System.out.println("\t a. Pengisian dan penambahan \t => "  + penambahan);
	}

}
