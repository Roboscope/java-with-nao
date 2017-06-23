package XframeworkX;

/**
 * Diese Klasse verwaltet die Zeitlimits und Punkte für jede Aufgabe, besser du veränderst Sie nicht :)
 */
public enum Aufgabe {

    SUBSET_SUM("Subset Sum", Long.MAX_VALUE, 10L * 60000L);

    private enum TimeLimitType {
        CONSTANT, POLYNOMIAL, INFINITE;
    }

    private String name;
    private long points;
    private TimeLimitType timeLimitType;
    private long fixedTimeLimit = 0;

    Aufgabe(String name, long points, TimeLimitType timeLimitType) {
        this.name = name;
        this.points = points;
        this.timeLimitType = timeLimitType;
    }

    Aufgabe(String name, long points, long fixedTimeLimit) {
        this(name, points, TimeLimitType.CONSTANT);
        this.fixedTimeLimit = fixedTimeLimit;
    }

    public String getName() {
        return this.name;
    }

    public long getPoints() {
        return this.points;
    }

    public long getTimeLimit(long paramLength) {
        switch (this.timeLimitType) {
            case CONSTANT:
                return this.fixedTimeLimit;
            case POLYNOMIAL:
                return Long.MAX_VALUE;
            case INFINITE:
                return Long.MAX_VALUE;
        }
        return 0;
    }
}
