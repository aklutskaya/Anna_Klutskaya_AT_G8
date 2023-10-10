package cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        WhileCycle whileCycle = new WhileCycle();
        whileCycle.newWhile();

        ForCycle forCycle = new ForCycle();
        forCycle.cycleNew();

        ArrayCycle arrayCycle = new ArrayCycle();
        arrayCycle.arrayNew();

    }
}
