/**
* Nama      : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Hukum OHM
 */
public class PBOIF10K10119915Latihan44 {
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        
        Baterai baterai2 = new Baterai(3.0f, 12.0f);
        System.out.printf("%nKuat Arus : %.1f ampere%n", baterai2.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm%n", baterai2.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt%n", baterai2.hitungTegangan());
    }
}