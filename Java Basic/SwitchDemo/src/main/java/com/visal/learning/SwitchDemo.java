package com.visal.learning;

public class SwitchDemo {
    public static void main(String[] args){
        int dayNumber = 5;
        String day = "";
        switch (dayNumber){
            case 1 :
//                System.out.println("Monday");
                day = "Monday";
                break;
            case 2 :
//                System.out.println("Tuesday");
                day = "Tuesday";
                break;
            case 3 :
//                System.out.println("Wednesday");
                day = "Wednesday";
                break;
            case 4 :
//                System.out.println("Thursday");
                day = "Thursday";
                break;
            case 5 :
//                System.out.println("Friday");
                day = "Friday";
                break;
            case 6 :
//                System.out.println("Saturday");
                day = "Saturday";
                break;
            case 7 :
//                System.out.println("Sunday");
                day = "Sunday";
                break;
            default:
//                System.out.println("Invalid day Number");
                day = "Invalid day Number";
                break;

        }
//        if (dayNumber == 1){
//            day = "Monday";
//        } else if (dayNumber == 2) {
//            day = "Tuesday";
//        } else if (dayNumber == 3) {
//            day = "Wednesday";
//        } else if (dayNumber == 4) {
//            day = "Thursday";
//        } else if (dayNumber == 5) {
//            day = "Friday";
//        } else if (dayNumber == 6) {
//            day = "Saturday";
//        }else if (dayNumber == 7) {
//            day = "Sunday";
//        }else {
//            day = "Invalid day Number";
//        }

        System.out.println(day);

    }
}
