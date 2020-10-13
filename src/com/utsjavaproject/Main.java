package com.utsjavaproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        Scanner keyboardInput = new Scanner(System.in);
        int gagal = 0;

        System.out.print("Selamat datang di Website ini, silahkan Sign Up jika ingin melihat berita terbaru \n");
        System.out.print("\n");

        System.out.print("Masukkan Username : ");
        login.setUsername(keyboardInput.nextLine());
        System.out.print("Masukkan Password : ");
        login.setPassword(keyboardInput.nextLine());
        System.out.print("Proses Sign Up selesai, silahkan login \n");

        for(int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Username: ");
            login.setInputUser(keyboardInput.nextLine());
            System.out.print("Masukkan Password : ");
            login.setInputPass(keyboardInput.nextLine());

            boolean isEqualUser  = login.getUsername().equals(login.getInputUser());
            boolean isEqualPass	 = login.getPassword().equals(login.getInputPass());
            boolean notEqualUser = !login.getUsername().equals(login.getInputUser());
            boolean notEqualPass = !login.getPassword().equals(login.getInputPass());

            if(isEqualUser && isEqualPass) {
                System.out.println("Login Sukses");
                break;
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
