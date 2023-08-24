import edu.princeton.cs.algs4.Stopwatch;

public class TimeCollector {
    private Stopwatch sw;
    private Move move;

    public TimeCollector(Move m){
        move = m;
    }

    public double timeCollect(int[] src){
        sw = new Stopwatch();
        move.move(src);
        double timeInSeconds = sw.elapsedTime();
        return timeInSeconds;
    }
}
