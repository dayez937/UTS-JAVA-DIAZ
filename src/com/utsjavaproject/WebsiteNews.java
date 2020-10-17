package com.utsjavaproject;

import java.util.Scanner;

public class WebsiteNews {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        int gagal = 1;

        System.out.print("Selamat datang di Website News, silahkan Sign Up jika ingin melihat berita terbaru \n");
        System.out.print("\n");

        System.out.print("Masukkan Username : ");
        String Username = keyboardInput.nextLine();
        System.out.print("Masukkan Password : ");
        String Password = keyboardInput.nextLine();

        System.out.print("Proses Sign Up selesai, silahkan Login \n");

        for(int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Username: ");
            String inputUser = keyboardInput.nextLine();
            System.out.print("Masukkan Password : ");
            String inputPass = keyboardInput.nextLine();
            Login login = new Login(Username, Password, inputUser, inputPass);

            boolean isEqualUser  = login.getUsername().equals(login.getInputUser());
            boolean isEqualPass	 = login.getPassword().equals(login.getInputPass());
            boolean notEqualUser = !login.getUsername().equals(login.getInputUser());
            boolean notEqualPass = !login.getPassword().equals(login.getInputPass());

            if(isEqualUser && isEqualPass) {
                System.out.println("Login Sukses");
                System.out.println("Berita apa yang ingin kamu baca ?");
                System.out.println("1. Demo UU Ciptaker ");
                System.out.println("2. Update Covid-19 ");
                System.out.println("3. Resesi Indonesia 2020 ");
                int pilihBerita = keyboardInput.nextInt();
                if(pilihBerita == 1){
                    BeritaDemo demo = new BeritaDemo();
                    demo.Judul();
                    demo.Isi();
                    demo.Author();
                    break;
                }
                if(pilihBerita == 2){
                    BeritaCovid covid = new BeritaCovid();
                    covid.Judul();
                    covid.Isi();
                    covid.Author();
                }
                if(pilihBerita == 3){
                    BeritaResesi resesi = new BeritaResesi();
                    resesi.Judul();
                    resesi.Isi();
                    resesi.Author();
                }
            }
            else if(notEqualUser && notEqualPass) {
                System.out.println("Login Gagal, silahkan coba lagi");
                gagal++;
                if(gagal > 3) {
                    System.out.println("Silahkan contact administrator");
                }
            }
            else if(isEqualUser && notEqualPass) {
                System.out.println("Login Gagal, silahkan coba lagi");
                gagal++;
                if(gagal > 3) {
                    System.out.println("Silahkan contact administrator");
                }
            }
            else if(notEqualUser && isEqualPass) {
                System.out.println("Login Gagal, silahkan coba lagi");
                gagal++;
                if(gagal > 3) {
                    System.out.println("Silahkan contact administrator");
                }
            }

        }
    }
}
