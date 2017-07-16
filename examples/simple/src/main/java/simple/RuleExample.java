package simple;

import groove.util.parse.FormatException;
import javagraph.JavaMatcher;

import java.io.IOException;

public class RuleExample {
    public static void main(String[] args) throws IOException, FormatException {
        JavaMatcher javagraph = new JavaMatcher("simple.gps");
        System.out.println(javagraph.getGrammar().getStartGraph());
        javagraph.applyMatch("test");
        System.out.println(javagraph.getGrammar().getStartGraph());
    }
}