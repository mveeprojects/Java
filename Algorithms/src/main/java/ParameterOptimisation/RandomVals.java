package ParameterOptimisation;

import java.util.Random;

public class RandomVals {

    //Shared random object
    static public double randomAngle() {
        Random rand = new Random();
        double x = rand.nextDouble() * 55;

        while (!(x >= 25 && x <= 55)) {
            x = rand.nextDouble() * 55;
        }
        return x;
    }

    static public double randomVelocity() {
        Random rand;
        rand = new Random();
        double x = rand.nextDouble() * 1650;

        while (!(x >= 1500 && x <= 1650)) {
            x = rand.nextDouble() * 1650;
        }
        return x;
    }

    static public void smallChangeTheta() {
        double temp;
        Random rand = new Random();

        //choose randomly if it's going to increment or not
        Random randMinusOrNot = new Random();
        double randMinusOrNotValue = randMinusOrNot.nextDouble();

        //decrease the value of our parameter, theta
        if (randMinusOrNotValue < 0.6) {

            temp = rand.nextDouble() * -15;
            double finalThetaValue = Cannon.t + temp;

            //if parameter value is going less than 55 stop it
            if (finalThetaValue < 25) {
                Cannon.t = 25;
            } else {
                Cannon.t = finalThetaValue;
            }
        }
        //if it's positive
        else {
            temp = rand.nextDouble() * 15;
            double finalThetaValue = Cannon.t + temp;

            //if parameter value is going over 55 stop it
            if (finalThetaValue > 55) {
                Cannon.t = 55;
            } else {
                Cannon.t = finalThetaValue;
            }
        }
    }

    //makes a small change to the velocity either minus or positive
    static public void smallChangeVelocity() {
        double temp;
        Random rand = new Random();

        //choose randomly if it's going to increment or not
        Random randMinusOrNot = new Random();
        double randMinusOrNotValue = randMinusOrNot.nextDouble();

        //decrease the value of our parameter, velocity
        if (randMinusOrNotValue < 0.6) {

            temp = rand.nextDouble() * -75;
            double finalVelocityValue = Cannon.vzero + temp;

            //if parameter value is going less than 1500 stop it
            if (finalVelocityValue < 1500) {
                Cannon.vzero = 1500;
            } else {
                Cannon.vzero = finalVelocityValue;
            }
        }
        //if it's positive
        else {
            temp = rand.nextDouble() * 75;
            double finalVelocityValue = Cannon.vzero + temp;

            //if parameter value is going over 1650 stop it
            if (finalVelocityValue > 1650) {
                Cannon.vzero = 1650;
            } else {
                Cannon.vzero = finalVelocityValue;
            }
        }
    }
}