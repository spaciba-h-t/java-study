import lambda.Lambda;
import stream.StreamSample;
import optional.OptionalSample;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Optional;

public class Java8Sample {
    public static void main(String args[]) {

        // ラムダ式
        Lambda lambda = new Lambda();
        System.out.println(lambda.getLambdaMessage("ラムダ式動作検証"));

        // StreamAPI
        StreamSample stream = new StreamSample();
        System.out.println(String.join(",", stream.getTeamName()));
    }
}
