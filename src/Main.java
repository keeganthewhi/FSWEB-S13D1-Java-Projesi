import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,7));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,3));
        System.out.println(shouldWakeUp(true,4));
        System.out.println(shouldWakeUp(true,16));
        System.out.println("---------------------------");
        System.out.println(hasTeen(25,34,66));
        System.out.println("---------------------------");
        System.out.println(hasTeen2(14,34,66));
        System.out.println(hasTeen2(25,34,66));
        System.out.println(hasTeen2(25,34,66));
        System.out.println("---------------------------");
        System.out.println(isCatPlaying(true,34));
        System.out.println("---------------------------");

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("width değeri gir");
            double width =scanner.nextDouble();
            System.out.println("height değeri gir");
            double height =scanner.nextDouble();
            System.out.println("area : "+ area(width,height) );
        } catch (Exception ex){
            System.out.println("Invalid Input");
        }



    }

        public static boolean shouldWakeUp(boolean isBarking,int clock){
        //Guarding ilk önce invalid durumlarin yazilmasina denir
            if(clock<0 || clock>23) return false;
            if(!isBarking) return false;
            return clock < 8 || clock >= 20;
        }

        public static boolean hasTeen(int num1,int num2, int num3){
        return (num1 >=13 && num1<=19)||
               (num2 >=13 && num2<=19)||
               (num3 >=13 && num3<=19);

        }

    public static boolean hasTeen2(int... ages){
        for(int age:ages){
            if (age >= 13 && age<=19) {
                return true;
            }
        }
        return false;

    }
    public static boolean isCatPlaying(boolean isSummer, int temperature){
        if(isSummer){
            return temperature>25&&temperature <=45;
            }
        return temperature>25&&temperature<=35;

    }
    //method signature =>
    public static double area(double width, double height){
        if(width<0 || height<0){
            System.out.println("width ve height 0dan büyük olmalı");
            return -1;
        }
        return width *height;
    }
    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return  Math.PI * radius *radius;
    }
}