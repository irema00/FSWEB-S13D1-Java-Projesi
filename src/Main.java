public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
    public static boolean shouldWakeUp(Boolean isBarking , int time ) {
        if (time < 0 || time > 23) {
            return false;
        } else if(time <8 || time >20) {
            return isBarking;
        }
    return false;
    }
}