package ParameterOptimisation;

import java.util.Random;

public class RandomVals {

    public static double randomAngle() {
        Random rand = new Random();
        double x = rand.nextDouble() * 55;

        while (!(x >= 25 && x <= 55)) {
            x = rand.nextDouble() * 55;
        }
        return x;
    }

    public static double randomVelocity() {
        Random rand;
        rand = new Random();
        double x = rand.nextDouble() * 1650;

        while (!(x >= 1500 && x <= 1650)) {
            x = rand.nextDouble() * 1650;
        }
        return x;
    }

    public static void smallChangeTheta() {
        double temp;
        Random rand = new Random();

        Random randMinusOrNot = new Random();
        double randMinusOrNotValue = randMinusOrNot.nextDouble();

        if (randMinusOrNotValue < 0.6) {

            temp = rand.nextDouble() * -15;
            double finalThetaValue = Cannon.t + temp;

            if (finalThetaValue < 25) {
                Cannon.t = 25;
            } else {
                Cannon.t = finalThetaValue;
            }
        } else {
            temp = rand.nextDouble() * 15;
            double finalThetaValue = Cannon.t + temp;

            if (finalThetaValue > 55) {
                Cannon.t = 55;
            } else {
                Cannon.t = finalThetaValue;
            }
        }
    }

    public static void smallChangeVelocity() {
        double temp;
        Random rand = new Random();

        Random randMinusOrNot = new Random();
        double randMinusOrNotValue = randMinusOrNot.nextDouble();

        if (randMinusOrNotValue < 0.6) {
            temp = rand.nextDouble() * -75;
            double finalVelocityValue = Cannon.vzero + temp;

            if (finalVelocityValue < 1500) {
                Cannon.vzero = 1500;
            } else {
                Cannon.vzero = finalVelocityValue;
            }
        } else {
            temp = rand.nextDouble() * 75;
            double finalVelocityValue = Cannon.vzero + temp;

            if (finalVelocityValue > 1650) {
                Cannon.vzero = 1650;
            } else {
                Cannon.vzero = finalVelocityValue;
            }
        }
    }
}