/*
Nama : Rafi Alkabir
Nim : 2501083001
 */
package pratikum11052026;
import java.util.*;
/**
 *
 * @author asus-
 */
public class CekThrows {
    public static void cekAngka(int a) throws Exception{
        //body throw
        if (a<0){
            throw new Exception("Nilai tidak boleh negatif");
        }else if (a>100){
            throw new Exception("Nilai tidak boleh melebihi 100");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka : ");
        int angka = input.nextInt();
        try{
            cekAngka(angka);
            System.out.println("Nilai berhasil disimpan");
        }catch(Exception e){
            System.out.println("Terjadi eror tak terduga"+e.getMessage());
        }
    }
    
}
