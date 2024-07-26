import java.util.Scanner;

class Biker {
    private double speed;

    public Biker(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean qualifies(double averageSpeed) {
        return speed > averageSpeed;
    }
}

public class MainBikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biker[] b1 = new Biker[5];

        // Input the speed of each racer
        System.out.println("Enter the speed of 5 racers in km/hr:");
        for (int i = 0; i < 5; i++) {
   System.out.print("Biker "+(i+1)+" speed=");
            double speed = sc.nextDouble();
            b1[i] = new Biker(speed);
        }

        // Calculate the average speed
        double totalSpeed = 0;
        for (Biker i : b1) {
            totalSpeed += i.getSpeed();
        }
        double averageSpeed = totalSpeed / 5;

        // Print the speed of qualifying racers
        System.out.println("Qualifying racers:");
        System.out.println("Biker whose speed > average speed of all 5 racers are:");
        for (Biker x : b1) {
            if (x.qualifies(averageSpeed)) {
                System.out.println(x.getSpeed());
            }
        }

        sc.close();
    }
}