/**
 * Created by benjamin on 6/13/15.
 */
public class SumCalculator {
    public static void main(String[] args) {
        //This is a default value
        int sum = 0;
        //Putting a comment here!!!
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            sum += Integer.parseInt(args[i]);
        }
        //Prints out the final sum
        System.out.println("Sum = " + sum);
    }
}