public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
        System.out.println("--------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    public static boolean shouldWakeUp(Boolean isBarking , int time ) {
        if (time < 0 || time > 23) {
            return false;
        } else if(time <8 || time >20) {
            return isBarking;
        }
    return false;
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        return num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19;
    }
}