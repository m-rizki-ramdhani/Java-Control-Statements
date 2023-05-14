/*
    While loop digunakan untuk mengulangi bagian dari program berulang kali hingga
    kondisi Boolean yang ditentukan benar.
    perulangan hanya akan berhenti ketika kondisi boolean salah.

    Perulangan while dianggap sebagai pernyataan if yang berulang.
    Jika jumlah iterasi tidak tetap, disarankan untuk menggunakan perulangan while.

    while (condition){
        code to be executed
        increment / decrement statement
    }
*/

public class JavaWhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        /*
            Jika nilai true diberikan di dalam while loop, itu akan menjadi infinitive while loop.
        */
        while(true){
            System.out.println("infinitive while loop");
        }
    }
}
