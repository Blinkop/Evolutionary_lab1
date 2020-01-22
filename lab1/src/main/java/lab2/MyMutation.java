package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random)
    {
        double population_threshold = 0.7;
        double norm_scale = 0.4;

        for (double[] solution: population)
            if (random.nextDouble() > population_threshold)
            {
                int point1 = random.nextInt(solution.length);
                solution[point1] += random.nextGaussian() * norm_scale;
            }

        return population;
    }
}
