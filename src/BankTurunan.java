public class BankTurunan {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro giro = new Giro("201", "Budi", 200000, 500000);

        System.out.println("Rekening Awal");
        tabungan.cetakInfo();
        giro.cetakInfo();

        System.out.println();
        System.out.println("============ TRANSAKSI ============");
        System.out.printf("%-26s: %s%n", "Tabungan tarik 1.500.000",
                tabungan.tarik(1500000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Giro tarik 500.000",
                giro.tarik(500000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Giro tarik 300.000",
                giro.tarik(300000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Giro setor 100.000",
                giro.setor(100000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Bunga tabungan",
                Rekening.formatRupiah(tabungan.tambahBunga()));

        System.out.println();
        System.out.println("Rekening Akhir");
        tabungan.cetakInfo();
        giro.cetakInfo();
    }
}