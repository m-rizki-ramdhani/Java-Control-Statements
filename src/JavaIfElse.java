/*
    If pada java digunakan untuk menguji kondisi boolean: benar atau salah.
    Ada berbagai jenis pernyataan if di Java:
    -if statement
    -if else statement
    -if else if ladder
    -nested if statement
*/

public class JavaIfElse {
    public static void main(String[] args) {

        //java if statement
        int usia = 20;
        //cek usia
        if(usia>18){
            System.out.print("Usia lebih besar dari 18");
        }

        //java if else statement
        int angka=13;
        //cek apakah angka bisa dimodulo dengan nilai 2 atau tidak
        if(angka%2==0){
            System.out.println("angka genap");
        }else{
            System.out.println("angka ganjil");
        }
        //menggunakan ternary operator
        String output=(angka%2==0)?"angka genap":"angka ganjil";
        System.out.println(output);

        //java if else if ladder statement
        if(angka>0){
            System.out.println("positif");
        }else if(angka<0){
            System.out.println("negatif");
        }else {
            System.out.println("angka nol");
        }

        //java nested if statement
        int beratBadan=80;
        //applying condition on age and weight
        if(usia>=18){
            if(beratBadan>50){
                System.out.println("Anda berhak mendonorkan darah");
            }
        }

    }
}
