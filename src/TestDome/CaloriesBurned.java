package TestDome;

public class CaloriesBurned {
    //System.out.println(CaloriesBurned.calculate(60, new int[][]{{6, 0}, {4, 1800}, {0, 3600}})); // should print 390.0
    public static double calculate(int weight, int[][] ride) {
        double burnedCal = 0;
        int prevTime = 0;
        for(int[] row : ride){
            int velocity = row[0];
            int time = row[1];
            burnedCal += (int) (weight * ((2.5*velocity - 6) * (time - prevTime))/3600);
            prevTime = time - prevTime;
        }
        return burnedCal;
    }

    public static void main(String[] args) {
        System.out.println(CaloriesBurned.calculate(60, new int[][]{{6, 0}, {4, 1800}, {0, 3600}})); // should print 390.0
    }
}