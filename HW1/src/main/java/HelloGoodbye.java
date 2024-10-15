import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class HelloGoodbye {
    public static void main(String[] args) {
        StdOut.print("Enter names: ");
        String[] names = StdIn.readAllStrings();


        if(names.length != 0) {
            StdOut.print("Hello " + names[0]);
            for(int i = 1; i < names.length; i++)
                StdOut.print(" and " + names[i]);

            StdOut.println();
            StdOut.print("Goodbye " + names[0]);
            for(int i = 1; i < names.length; i++)
                StdOut.print(" and " + names[i]);


        }
    }
}
