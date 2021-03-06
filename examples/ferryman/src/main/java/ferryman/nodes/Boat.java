package ferryman.nodes;

import javagraph.annotations.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

@Node("Boat")
public class Boat {

    private static final Set<Boat> boats = Collections.newSetFromMap(new WeakHashMap<>());

    private final Set<Bank> moored;
    private final Set<Bank> go;

    public Boat() {
        boats.add(this);
        moored = new HashSet<>();
        go = new HashSet<>();
    }

    @NodeCreate
    public static Boat getBoat() {
        return new Boat();
    }

    @NodeDelete
    public boolean removeBoat() {
        return boats.remove(this);
    }

    @NodeVisit
    public static Set<Boat> visitBoat() {
        return Collections.unmodifiableSet(boats);
    }

    @EdgeCreate("moored")
    public boolean addMoored(Bank bank) {
        return moored.add(bank);
    }

    @EdgeDelete("moored")
    public boolean removeMoored(Bank bank) {
        return moored.remove(bank);
    }

    @EdgeVisit("moored")
    public Set<Bank> getMoored() {
        return Collections.unmodifiableSet(moored);
    }

    @EdgeCreate("go")
    public boolean addGo(Bank bank) {
        return go.add(bank);
    }

    @EdgeDelete("go")
    public boolean removeGo(Bank bank) {
        return go.remove(bank);
    }

    @EdgeVisit("go")
    public Set<Bank> getGo() {
        return Collections.unmodifiableSet(go);
    }

    @Override
    public String toString() {
        return "Boat";
    }
}
