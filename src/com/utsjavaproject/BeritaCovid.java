package com.utsjavaproject;

public class BeritaCovid implements Berita{
    @Override
    public void Judul() {
        System.out.println("Hari Ini, Total Kasus Covid-19 Indonesia Terburuk di Asia Tenggara \n");
    }

    @Override
    public void Isi() {
        System.out.println("Indonesia menyalip Filipina dan kembali menjadi negara dengan jumlah penularan kasus positif Covid-19 terbesar di Asia Tenggara, Kamis 15 Oktober 2020. Indonesia pernah berada di posisi ini pada awal pandemi lalu tapi kemudian digeser oleh Filipina.\n" +
                "\n" +
                "Berdasarkan peta real-time penularan global yang disusun Johns Hopkins University, AS, total 349.160 kasus positif Covid-19 yang dilaporkan Satgas Penanggulangan Covid-19 per hari ini berada di atas Filipina yang melaporkan 348.968 kasus. Dalam peta itu, keduanya kini menempati urutan 18-19 negara penyumbang jumlah kasus terbesar secara global.\n" +
                "\n" +
                "Indonesia kini juga berada tepat di bawah Italia--negara di Eropa yang pernah menjadi yang terburuk mengalami dampak pandemi Covid-19. Pergerakan posisi itu berasal dari lonjakan 4.411 kasus baru yang dilaporkan siang tadi dari perkembangan 24 jam sebelumnya.\n" +
                "\n" +
                "Sedang di Filipina, jumlah kasus baru sebanyak 2.261. Dua hari lalu, negara ini juga berhasil mencatatkan angka kasus baru terendah sepanjang hampir sebulan terakhir yakni 1.990 kasus. \n");
    }

    @Override
    public void Author() {
        System.out.println("Reporter: Tempo.co\n" +
                "Editor: Zacharias Wuragil");
    }
}
