public class JavaBreakContinue {
    public static void main(String[] args) {

        /*
            Ketika sebuah pernyataan break ditemui di dalam sebuah loop,
            loop segera diakhiri dan kontrol program dilanjutkan pada
            pernyataan berikutnya setelah loop.

            Kita dapat menggunakan pernyataan break Java di semua jenis loop seperti
            for loop, while loop dan do-while loop.
        */

        //using for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //breaking the loop
                break;
            }
            System.out.println(i);
        }

        //outer loop
        for(int i=1;i<=3;i++){
            //inner loop
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using break statement inside the inner loop
                    break;
                }
                System.out.println(i+" "+j);
            }
        }

        /*
            Kita bisa menggunakan pernyataan break dengan label.
            Jadi, kita dapat memutus setiap loop di Java sekarang apakah itu loop luar atau dalam.
        */
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using break statement with label
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }



        /*
            Pernyataan Java continue digunakan untuk melanjutkan perulangan.
            Itu melanjutkan aliran program saat ini dan melewatkan kode yang
            tersisa pada kondisi yang ditentukan. Dalam kasus loop dalam, ini melanjutkan loop dalam saja.
        */
        //for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }

        //outer loop
        for(int i=1;i<=3;i++){
            //inner loop
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using continue statement inside inner loop
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }

        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using continue statement with label
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
