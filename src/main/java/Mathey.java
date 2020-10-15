public class Mathey {

    public static int max(int a, int b) {
        return (a>b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a>b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        if (a>=b&&a>=c) return a;
        else if (b>=a&&b>=c) return b;
        else return c;
    }

    public static double max(double a, double b, double c) {
        if (a>=b&&a>=c) return a;
        else if (b>=a&&b>=c) return b;
        else return c;
    }

     public static int min(int a, int b) {
        return (a<b) ? a : b;
    }

    public static double min(double a, double b) {
        return (a<b) ? a : b;
    }

    public static int min(int a, int b, int c) {
        if (a<=b&&a<=c) return a;
        else if (b<=a&&b<=c) return b;
        else return c;
    }

    public static double min(double a, double b, double c) {
        if (a<=b&&a<=c) return a;
        else if (b<=a&&b<=c) return b;
        else return c;
    }

    public static int randomInteger(int a, int b) {
        if (b<a) return -1;
        return (int)(Math.random()*(b-a))+a;
    }
    public static int randomInteger(int b) {
        if (b<0) return -1;
        return (int)(Math.random()*(b));
    }

    public static void main(String[] args) {
        //just a bunch of testing
        System.out.println(max(4, 4));
        System.out.println(max(5, 5, 4));
        System.out.println(max(4.3, 6.5));
        System.out.println(max(0.4, 3.6, 2.3));
        System.out.println(min(4, 4));
        System.out.println(min(5, 5, 4));
        System.out.println(min(4.3, 6.5));
        System.out.println(min(0.4, 3.6, 2.3));
        for (int i = 0; i<20; i++) System.out.println(randomInteger(7));
        for (int i = 0; i<20; i++) System.out.println(randomInteger(3, 9));

    }

}