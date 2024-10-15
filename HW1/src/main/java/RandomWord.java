import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String[] names = StdIn.readAllStrings();

        if (names.length != 0) {
            for (int i = 0; i < names.length; i++)
                if (StdRandom.bernoulli(1.0/((double)i+1)))
                    StdOut.print(names[i] + " ");
        }
    }
}