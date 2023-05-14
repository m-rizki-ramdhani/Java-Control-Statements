/*
    Java for loop digunakan untuk mengulangi bagian dari program beberapa kali.
    Jika jumlah iterasi tetap, disarankan untuk menggunakan perulangan for.
*/

/*
    for(initialization; condition; increment/decrement){
        statement or code to be executed
    }
*/

public class JavaForLoop {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        //loop of i
        for(int i=1;i<=3;i++){
            //loop of j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//end of i
        }//end of j


        /*
            For-each loop digunakan untuk melintasi array atau kumpulan di Java.
            Lebih mudah digunakan daripada simple for loop karena kita tidak perlu menaikkan nilai
            dan menggunakan notasi subskrip.

            Ini bekerja berdasarkan elemen dan bukan indeks.
            Ini mengembalikan elemen satu per satu dalam variabel yang ditentukan.

            for(data_type variable : array_name){
                code to be executed
            }
        */
        //Declaring an array
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }


        /*
            Kita dapat memiliki nama untuk setiap perulangan Java for.
            Untuk melakukannya, kami menggunakan label sebelum perulangan for.
            Ini berguna saat menggunakan loop for bersarang karena kita
            dapat menghentikan/melanjutkan loop for tertentu.
        */
        //Using Label for outer and for loop
        aa:
        for(int i=1; i<=3 ;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2 && j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }


        /*
            Jika Anda menggunakan dua titik koma ;; dalam for loop,
            itu akan menjadi infinitive for loop.
        */
        //Using no condition in for loop
        for(;;){
            System.out.println("infinitive loop");
        }
    }
}
