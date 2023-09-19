import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("************************");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("************************");
        System.out.println(hasTeenOptional(21, 32, 45, 9898));
        System.out.println(hasTeenOptional(21, 32, 45, 9898, 19));
        System.out.println("************************");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("*************************");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Enter height of rectangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area = " + area(width, height));
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                isValid = false;
            }
            System.out.println("--------------------------------");

            try {
                System.out.println("Enter radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Area= " + String.format("%.2f", area(radius)));
            } catch (Exception ex) {
                System.out.println("Invalid Input");
            }
            System.out.println(isPrime(49));
            System.out.println(isPrime(21));
            System.out.println(isPrime(13));

        }


    }


    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;
        return clock < 8 || clock >= 20;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);

    }

    public static boolean hasTeenOptional(int... ages) {
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp > 25 && temp <= 45;
        }
        return temp > 25 && temp <= 35;
    }

    public static double area(double width, double height) {
if(width < 0 || height < 0) {
    System.out.println("width ve height değeri 0'dan büyük olmalıdır!");
    return -1;
}
return width * height;
}


// overloading
// method signature
public static double area(double radius){
        if(radius < 0 ) {
            System.out.println("Radius değeri 0'dan küçük olamaz!");
            return -1;
        }
        return radius * radius * Math.PI;
    }
    public static boolean isPrime(int num) {
        if(num <= 1 ){
            return false;
        }

        for(int i=2; i<= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
