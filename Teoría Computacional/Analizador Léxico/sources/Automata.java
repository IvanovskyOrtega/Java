package sources;

import java.util.ArrayList;

public class Automata {
    private final ArrayList<Character> alphabet;
    private final Statements initialStatement;
    private final Statements finalStatement;
    private final Statements Statements;
    private TransitionFunctions functions;
    Alphabet a = new Alphabet();

    public Automata(ArrayList<Character> alphabet, Statements initialStatement, Statements finalStatement, Statements Statements) {
        this.alphabet = a.alphabet;
        this.initialStatement = initialStatement;
        this.finalStatement = finalStatement;
        this.Statements = Statements;
    }
}
