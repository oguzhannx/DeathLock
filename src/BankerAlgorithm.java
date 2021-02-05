import java.util.Iterator;

public class BankerAlgorithm {
	int n = 5; // Dizi sat�r
	int m = 3; // Dizi s�tun
	int need[][] = new int[n][m];
	int[][] max;
	int[][] atanmis;
	int[] kullanilabilir;
	int[][] kullanilabilir_2 = new int[n + 1][m];

	int[] siralama = new int[n];
	String safeMassage;
	String safe = "";

	void initializeValues() {

		// Atanm�� Dizi
		atanmis = new int[][] { //
				{ 0, 1, 0 }, // P0
				{ 2, 0, 0 }, // P1
				{ 3, 0, 2 }, // P2
				{ 2, 1, 1 }, // P3
				{ 0, 0, 2 } }; // P4

		// MAX Dizi
		max = new int[][] { //
				{ 7, 5, 3 }, // P0
				{ 3, 2, 2 }, // P1
				{ 9, 0, 2 }, // P2
				{ 2, 2, 2 }, // P3
				{ 4, 3, 3 } }; // P4

		// Kullan�labilirler
		kullanilabilir = new int[] { 3, 3, 2 };

		// �al��ma S�ras� G�R�LEN S�STEM
		siralama = new int[] { 1, 3, 4, 0, 2 };
	}

	// ihtiya� dizisinin bulunmas�
	void calculateNeed() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				need[i][j] = max[i][j] - atanmis[i][j]; 

			}

		}
	}

	void isSafe() {
		int count = 0;
		int count_2;

		// Bo�ta olanlar�n ge�ici bir diziye at�lmas�
		int kullanilabilirGecici[] = new int[m];
		for (int i = 0; i < m; i++) {
			kullanilabilirGecici[i] = kullanilabilir[i];

		}

		for (int i = 0; i < n; i++) {
			count_2 = 0;
			for (int j = 0; j < m; j++) {
				 // Sistemin g�venli olup olmad���n�n kontrol�
				if (need[siralama[i]][j] <= kullanilabilirGecici[j]) {
					count_2 += 1;

				} else {
					break;
				}
			}

			if (count_2 == 3) {
				// Yeni kullan�labilir dizinin belirlenmesi
				for (int j = 0; j < m; j++) {
					kullanilabilir_2[i][j] = kullanilabilirGecici[j];

					kullanilabilirGecici[j] = kullanilabilirGecici[j] + atanmis[siralama[i]][j];
				}
				count += 1;

				System.out.println("");
			} else {
				break;
			}
		}

		if (count < n) {
			safeMassage = "Verilen Sistem G�venli De�il";
			for (int i = 0; i < n; i++) {

				safe = safe + "P" + siralama[i];
				if (i != n - 1)
					safe = safe + " -> ";

			}
		} else {

			safeMassage = "Verilen Sistem G�venli. G�venli S�ralamay� Takip Edin: ";
			for (int i = 0; i < n; i++) {

				safe = safe + "P" + siralama[i];
				if (i != n - 1)
					safe = safe + " -> ";

			}
		}
	}
}
