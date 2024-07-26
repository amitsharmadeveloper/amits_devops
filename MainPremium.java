import java.util.Scanner;

class Insurance {
    protected int age;
    protected double premium;

    Insurance(int age) {
        this.age = age;
    }

    void calculatePremium() {
        if (age >= 30 && age < 50) {
            premium = age * 60;
        }
        else if (age >= 50 && age < 60) {
            premium = age * 70;
        }
        else if (age >= 60) {
            premium = age * 75;
        }
        else {
            premium = age * 50;
        }
    }

    double getPremium() {
        return premium;
    }
}

// Male class extending Insurance
class Male extends Insurance {
    Male(int age) {
        super(age);
    }

    @Override
    void calculatePremium() {
        super.calculatePremium();
    }
}

// Female class extending Insurance
class Female extends Insurance {
    Female(int age) {
        super(age);
    }

    @Override
    void calculatePremium() {
        super.calculatePremium();
        premium += premium * 0.20;
    }
}

// Main class for user input and premium calculation
class MainPremium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        Insurance insObj;
        if (gender.equals("male")) {
            insObj = new Male(age);
        }
        else if (gender.equals("female")) {
            insObj = new Female(age);
        }
        else {
            System.out.println("Invalid gender input.");
            sc.close();
            return;
        }

        insObj.calculatePremium();
        System.out.println("The calculated premium is: " + insObj.getPremium());

        sc.close();
    }
}
