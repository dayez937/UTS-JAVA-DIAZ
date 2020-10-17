package com.utsjavaproject;

public class BeritaResesi implements Berita{
    @Override
    public void Judul() {
        System.out.println("Lihat Deretan Data Ini Jadi Makin Yakin RI Lagi Resesi");
    }

    @Override
    public void Isi() {
        System.out.println("Jakarta - Indonesia hampir pasti mengalami resesi. Ekonomi Indonesia pada kuartal III-2020 diperkirakan masih minus karena ruang gerak ekonomi yang belum begitu pulih.\n" +
                "Pada kuartal II-2020, ekonomi Indonesia minus 5,32%. Ekonomi di kuartal III-2020 juga diperkirakan masih minus tapi tidak sedalam kuartal sebelumnya.\n" +
                "\n" +
                "Namun, perkiraan itu tidak cukup kuat memperkirakan Indonesia akan mengalami resesi. Data Badan Pusat Statistik (BPS) menjadi kunci.\n" + "Sepanjang kuartal III-2020, ekspor selalu tumbuh negatif. Artinya, bisa dipastikan kontribusi ekspor dalam pembentukan Produk Domestik Bruto (PDB) bukannya positif malah mengurangi.\n" +
                "\n" +
                "Ekspor adalah penyumbang terbesar ketiga dalam PDB dari sisi pengeluaran, di bawah konsumsi rumah tangga dan Pembentukan Modal Tetap Bruto (PMTB) alias investasi. Dalam 10 tahun terakhir, sumbangsih ekspor kepada PDB rata-rata adalah 18,36%.\n" +
                "\n" +
                "Kemudian impor. Pada September 2020, nilai impor adalah US$ 11,57 miliar. Anjlok 18,88% YoY. Seperti halnya ekspor, impor juga selalu membukukan kontraksi (pertumbuhan negatif) pada kuartal III-2020.\n" +
                "\n" +
                "Berdasarkan penggunaan, bahan baku/penolong, barang modal, dan barang konsumsi masih turun. Kontraksi ketiganya masing-masing 18,96% YoY, 17,72% YoY, dan 20,38% YoY.\n" +
                "\n" +
                "Penurunan impor juga akan berdampak negatif terhadap PDB karena sebagian besar impor Indonesia adalah bahan baku/penolong dan barang modal yang digunakan untuk produksi industri dalam negeri.\n" +
                "\n" +
                "\"Impor bahan baku dan barang modal akan berpengaruh positif terhadap geliat industri dalam negeri. Kita masih perlu waktu menuju recovery,\" kata Kepala BPS Suhariyanto.");
    }

    @Override
    public void Author() {
        System.out.println("Reporter : Tim detikcom - detikFinance");
    }
}
