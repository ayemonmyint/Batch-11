package com.batcheleven.one;

public class SwitchStatement {
    public static void main(String[] args) {
        int a =6;
        switch (a) {
            case 1:
                System.out.println(a + "is equal to 1");
                System.out.println("something");
                break;
            case 2:
                System.out.println(a + "is equal to 2");
                System.out.println("something");
                break;
            case 3:
                System.out.println(a + "is equal to 3");
                System.out.println("something");
                break;
            case 4:
                System.out.println(a + "is equal to 4");
                System.out.println("something");
                break;
            case 5:
                System.out.println(a + "is equal to 5");
                System.out.println("something");
                break;
            default:
                System.out.println("invalid");

        }
        String day = "Monday";
        switch (day){
            case "Monday":
                System.out.println(day + "is first day");
                break;
            case "Tuesday":
                System.out.println(day + "is second  day");
                break;
            case "Wednesday":
                System.out.println(day + "is third  day");
                break;
            case "Thursday":
                System.out.println(day + "is fourth  day");
                break;
            case "Friday":
                System.out.println(day + "is fifth  day");
                break;
            case "Saturday":
                System.out.println(day + "is weekend day");
                break;
            case "Sunday":
                System.out.println(day + "is also weekend day");
                break;
            default:
                System.out.println("something wrong");
        }
    }
}
