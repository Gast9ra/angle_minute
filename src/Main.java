import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {




    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("Введите колличетво угловых минут");
            String first = read.nextLine();
            System.out.println("Введите дистанцию");
            String second = read.nextLine();
            minute(first,second);
        }
    }

    private static void minute(String angleMinute,String distance){
            double angle=Double.parseDouble(angleMinute)*(1.0/120);
            double distn=Double.parseDouble(distance);
            double result=(sin(Math.toRadians(angle))*distn)/sin(Math.toRadians(90-angle));
            System.out.println("result "+(double)Math.round(result*2000000)/10000+"cm");
    }


}
