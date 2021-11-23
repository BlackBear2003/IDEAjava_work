package TextWork01;

public class HelpTeacher {
    public static void main(String[] args) {
        int[] scores = {59, 64, 86, 48, 76};
        System.out.println("Average = " + getAverage(scores));
        System.out.print("HighestScore's Subscripts = " + getHighestScore(scores));
    }
    static double getAverage(int[] scores){
        int sum = 0;
        for (int i:
             scores) {
            sum += i;
        }
        return sum*1.0/scores.length;
    }
    static int getHighestScore(int[] scores){
        int highest = 0;
        int subscripts = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>=highest){
                highest = scores[i];
                subscripts = i ;
            }
        }
        return subscripts;
    }
}

