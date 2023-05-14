/*
    do-while loop digunakan untuk mengulangi bagian dari program berulang kali, hingga
    kondisi yang ditentukan benar.
    Jika jumlah iterasi tidak tetap dan Anda harus mengeksekusi loop setidaknya sekali,
    disarankan untuk menggunakan do-while loop.

    Loop do-while Java disebut loop kontrol keluar. Oleh karena itu,
    tidak seperti perulangan while dan perulangan for, do-while memeriksa kondisi
    di akhir badan perulangan. Perulangan do-while Java dijalankan setidaknya sekali
    karena kondisi diperiksa setelah badan perulangan.

    do{
        //code to be executed / loop body
        //update statement
    }while (condition);
*/

public class JavaDoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        /*
            Jika nilai true diberikan di dalam while loop, itu akan menjadi infinitive while loop.
        */
        do{
            System.out.println("infinitive do while loop");
        }while(true);
    }
}
