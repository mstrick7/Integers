import java.util.ArrayList;

public class Integers {

    public static void isPrime(int a) {
        boolean primenoprime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                primenoprime = false;
                break;
            } else {
                primenoprime = true;
            }
        }
        if (primenoprime == false || a == 1) {
            System.out.println(a + " is not a prime number.");
        } else {
            System.out.println(a + " is a prime number.");
        }
    }

    public static void isPrime(long a) {
        boolean primenoprime = true;
        for (long i = 2; i < a; i++) {
            if (a % i == 0) {
                primenoprime = false;
                break;
            } else {
                primenoprime = true;
            }
        }
        if (primenoprime == false || a == 1) {
            System.out.println(a+ " is not a prime number");
        } else {
            System.out.println(a+ " is a prime number");
        }
    }

    public static void relativelyPrime(int a, int b) {
        boolean relativeNotrelative = true;
        for (int i = 2; i < 10; i++) {
            if (a % i == 0 && b % i == 0) {
                relativeNotrelative = false;
                break;
            }
        }
        if (relativeNotrelative) {
            System.out.println(a+ " and " +b+ "are relatively prime");
        } else {
            System.out.println(a+ " and " +b+ " are not relatively prime");
        }
    }

    public static void relativelyPrime(long a, long b) {
        boolean relativeNotrelative = true;
        for (long i = 2; i < 10; i++) {
            if (a % i == 0 && b % i == 0) {
                relativeNotrelative = false;
                break;
            }
        }
        if (relativeNotrelative) {
            System.out.println(a+ " and " +b+ "are relatively prime");
        } else {
            System.out.println(a+ " and " +b+ " are not relatively prime");
        }
    }

    public static void factors(int a) {
        System.out.print("the factors of " +a+ " are, ");
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    public static void factors(long a) {
        System.out.print("the factors of " +a+ " are, ");
        for (long i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    public static void GCFLCM(int a, int b) {
        int j = b;
        if (a < b) {
            j = a;
        }
        int k = 0;
        Integer o = 0;
        ArrayList<Integer> LCM1 = new ArrayList<Integer>();
        ArrayList<Integer> LCM2 = new ArrayList<Integer>();
        Integer p = 0;
        Integer q = 0;
        for (int i = 1; i <= j; i++) {
            if (a % i == 0 && b % i == 0) {
                k = i;
            }
        }
        for (int l = 0; l <= 100; l++) {
            p = a * l;
            q = b * l;
            LCM1.add(l, p);
            LCM2.add(l, q);
        }
        for (int m = 0; m <= 100; m++) {
            for (int n = 0; n <= 100; n++) {
                if (LCM1.get(m) == LCM2.get(n)) {
                    o = LCM1.get(m);
                }
            }
        }
        System.out.println("the greatest common factor of " +a+ " and " +b+ " is " +k);
        if (o > 0){
            System.out.println("the least common multiple of " +a+ " and " +b+ " is " +o);
        } else {}
    }

    public static void GCFLCM(Long a, Long b) {
        Long j = b;
        if (a < b) {
            j = a;
        }
        int k= 0;
        Long o = 0L;
        ArrayList<Long> LCM1 = new ArrayList<Long>();
        ArrayList<Long> LCM2 = new ArrayList<Long>();
        Long p;
        Long q;
        for (int i = 1; i <= j; i++) {
            if (a % i == 0 && b % i == 0) {
                k = i;
            }
        }
        for (int l = 0; l <= 100; l++) {
            p = a * l;
            q = b * l;
            LCM1.add(l, p);
            LCM2.add(l, q);
        }
        for (int m = 0; m <= 100; m++) {
            for (int n = 0; n <= 100; n++) {
                if (LCM1.get(m) == LCM2.get(n)) {
                    o = LCM1.get(m);
                }
            }
        }
        System.out.println("the greatest common factor of " +a+ " and " +b+ " is " +k);
        if (o > 0){
            System.out.println("the least common multiple of " +a+ " and " +b+ " is " +o);
        } else {}
    }
}





















