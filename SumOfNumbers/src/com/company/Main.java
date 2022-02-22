package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
       4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
        int i=0,total=0;

        while(i>=0){
            Scanner scan=new Scanner(System.in);
            System.out.print("Bir sayi giriniz: ");
            int number=scan.nextInt();
            if(number%2!=0){
                break;
            }
            if( number%4==0){
                total=total+number;
            }

        }
        System.out.println("4'ün katı olan sayıların toplamı: " +total);


    }

}
