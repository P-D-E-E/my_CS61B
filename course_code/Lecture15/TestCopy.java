import edu.princeton.cs.algs4.Stopwatch;

import java.sql.Time;
import java.util.List;
public class TestCopy {
    private static void printTimingTable(AList<Integer> arrayLength, AList<Double> ForTime, AList<Double> ACTime) {
        System.out.printf("%12s %12s %12s\n", "Length", "time(For)", "time(AC)");
        System.out.printf("-------------------------------------------------\n");
        for (int i = 0; i < arrayLength.size(); i += 1) {
            int N = arrayLength.get(i) * 2;
            double Ftime = ForTime.get(i) * 1000;
            double ACtime = ACTime.get(i) * 1000;
            System.out.printf("%12d %12.2f %12.2f\n", N, Ftime, ACtime);
        }
    }
    public static void TestMoveSpeed(){
        AList<Integer> arrayLength = AList.of(1000000, 2000000, 4000000, 8000000, 16000000, 32000000, 64000000, 128000000);
        AList<Double> ForTime = new AList<>();
        AList<Double> ACTime = new AList<>();
        for (int i = 0; i < arrayLength.size(); i++){
            int[] src = new int[arrayLength.get(i) * 2];
            TimeCollector FTC = new TimeCollector(new ForMove());
            double FtimeInSeconds = FTC.timeCollect(src);
            ForTime.addLast(FtimeInSeconds);

            TimeCollector ATC = new TimeCollector(new ACMove());
            double AtimeInSeconds = ATC.timeCollect(src);
            ACTime.addLast(AtimeInSeconds);
        }
        printTimingTable(arrayLength,ForTime, ACTime);
    }

    public static void main(String[] args){
        TestMoveSpeed();
    }

}
