/*
    Switch Java mengeksekusi satu pernyataan dari beberapa kondisi.
*/

public class JavaSwitchCase {
    public static void main(String[] args) {
        int number=20;
        //Switch expression
        switch(number) {
            //Case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            //Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
        }


        int day=7;
        String dayString;
        //Switch statement
        switch(day) {
            //case statements within the switch block
            case 1:
                dayString = "1 - Minggu";
                break;
            case 2:
                dayString = "2 - Senin";
                break;
            case 3:
                dayString = "3 - Selasa";
                break;
            case 4:
                dayString = "4 - Rabu";
                break;
            case 5:
                dayString = "5 - Kamis";
                break;
            case 6:
                dayString = "6 - Jum'at";
                break;
            case 7:
                dayString = "7 - Sabtu";
                break;
            default:
                dayString = "Invalid Day!";
        }
        //Printing day of the given number
        System.out.println(dayString);
    }
}
