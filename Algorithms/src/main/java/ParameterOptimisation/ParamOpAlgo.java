package ParameterOptimisation;

class ParamOpAlgo {

    ParamOpAlgo() {

        double range = Cannon.GetMaxRange(RandomVals.randomAngle(), RandomVals.randomVelocity());
        double bestAngle = Cannon.t;
        double bestVelocity = Cannon.vzero;
        double maxRange = Cannon.GetMaxRange(45.0, 1650.0);
        System.out.println(maxRange);

        Cannon.oldFitness = Cannon.rangeFitness(range, 65000);
        Cannon.tempFitness = Cannon.oldFitness;

        System.out.println("Starting angle: " + Cannon.t);
        System.out.println("Starting velocity: " + Cannon.vzero);
        System.out.println("Starting fitness: " + Cannon.oldFitness);

        int iterationCounter = 1;
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            if ((i % 2) == 0) {
                RandomVals.smallChangeTheta();
            } else {
                RandomVals.smallChangeVelocity();
            }

            System.out.println("Old fitness: " + Cannon.oldFitness);

            range = Cannon.GetMaxRange(Cannon.t, Cannon.vzero);
            Cannon.tempFitness = Cannon.rangeFitness(range, 65000);

            if (Cannon.tempFitness < Cannon.oldFitness) {
                Cannon.oldFitness = Cannon.tempFitness;
                bestAngle = Cannon.t;
                bestVelocity = Cannon.vzero;
            }

            System.out.println("Run #: " + iterationCounter);
            System.out.println("Current angle: " + Cannon.t);
            System.out.println("Current velocity: " + Cannon.vzero);
            System.out.println("New fitness: " + Cannon.tempFitness);
            System.out.println("Current range: " + range);
            System.out.println("");

            iterationCounter++;
        }

        System.out.println("");
        System.out.println("Best angle: " + bestAngle);
        System.out.println("Best velocity: " + bestVelocity);
        System.out.println("Best range: " + Cannon.GetMaxRange(bestAngle, bestVelocity));
        System.out.println("Current range: " + range);
        System.out.println("");
        System.out.println("");

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime);
        System.out.println("Total time taken to run for " + (iterationCounter - 1) + " iterations: " + totalTime + " milliseconds");

    }
}