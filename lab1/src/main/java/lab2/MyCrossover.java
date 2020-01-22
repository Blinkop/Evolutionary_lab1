package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random)
    {
        double w1 = 0.4;
        double w2 = 1 - w1;

        ArrayList children = new ArrayList();

        double[] population_1 = new double[p1.length];
        double[] population_2 = new double[p1.length];

        for (int j = 0; j < p1.length; j++)
        {
            population_1[j] = w1 * p1[j] + w2 * p2[j];
            population_2[j] = w2 * p1[j] + w1 * p2[j];
        }

        children.add(population_1);
        children.add(population_2);

        return children;
    }
}
