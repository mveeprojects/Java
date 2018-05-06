package ParameterOptimisation;

import java.util.ArrayList;

public class Cannon {

    public static double tempFitness;
    public static double oldFitness;
    public static double t;
    public static double vzero;

    public static double rangeFitness(double maxRange, double targetRange) {
        double fitness;
        fitness = Math.abs(maxRange - targetRange);
        return fitness;
    }

    private static ArrayList<Double> xi = null, yi = null;

    public static Double GetMaxRange(Double angle, Double muzzlevelocity) {

        t = angle;
        vzero = muzzlevelocity;

        if (t < 25) {
            t = 25.0;
        } else if (t > 55) {
            t = 55.0;
        }

        if (vzero < 1500) {
            vzero = 1500.0;
        } else if (vzero > 1650) {
            vzero = 1650.0;
        }

        int i;
        xi = new ArrayList<>();
        yi = new ArrayList<>();
        ArrayList<Double> vxi = new ArrayList<>();
        ArrayList<Double> vyi = new ArrayList<>();

        xi.add(0.0);
        yi.add(0.0);

        Double theta = (t / 360.0) * 2 * Math.PI;
        Double dt = 0.01;
        Double m = 107.5;
        Double g = 9.80665;

        vxi.add(vzero * Math.cos(theta));
        vyi.add(vzero * Math.sin(theta));

        i = 0;
        while (yi.get(i) >= 0) {
            Double b2 = B2(yi.get(i));
            Double vi = Math.sqrt(Math.abs(vxi.get(i) * vxi.get(i)) + Math.abs(vyi.get(i) * vyi.get(i)));
            xi.add(xi.get(i) + vxi.get(i) * dt);
            vxi.add(vxi.get(i) - (b2 * vi * vxi.get(i) / m) * dt);
            yi.add(yi.get(i) + vyi.get(i) * dt);
            vyi.add(vyi.get(i) - g * dt - (b2 * vi * vyi.get(i) / m) * dt);
            ++i;
        }
        return (xi.get(xi.size() - 1));
    }

    public static ArrayList<Double> GetX() {
        return (xi);
    }

    public static ArrayList<Double> GetY() {
        return (yi);
    }

    private static Double B2(Double y) {
        Double b2 = 0.0054;
        b2 = b2 * AirDensity(y);
        return (b2);
    }

    private static Double AirDensity(Double y) {
        Double d = 0.0;
        if (y > 44000) return (d);
        Double L = 0.0065;
        Double T0 = 288.0;
        Double M = 0.0289644;
        Double g = 9.80665;
        Double R = 8.31447;

        d = Math.pow((1.0 - L * y / T0), (g * M / (R * L)));
        return (d);
    }
}