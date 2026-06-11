/*
Nama : Rafi Alkabir
Nim : 2501083001
 */
package pratikum11052026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author asus-
 */
public class MainCekAngka {

/*
Nama : Rafi Alkabir
Nim : 2501083001
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int a,b;
        int hasil;
        try{
        System.out.println("Masukan bilangan pertama");
        a = input.nextInt();
        System.out.println("Masukan bilangan kedua");
        b = input.nextInt();
        hasil = a/b;
        System.out.println(a+"/"+b+"="+hasil);
        }
catch(InputMismatchException e){
    System.out.println("Masukan angka bukan huruf blay");
}  
      
catch(ArithmeticException e) {
    System.out.println("Nilai kedua atau Penyebut tidak boleh 0");
    }
catch(Exception e){
    System.out.println("Error tidak terduga blay");
}  
    finally {
    System.out.println("program berhasil di jalankan");
}
}
}
