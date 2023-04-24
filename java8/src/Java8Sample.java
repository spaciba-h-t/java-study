import defaultMethod.DefaultMethod;
import defaultMethod.DefaultmethodImpl;
import lambda.Lambda;
import stream.StreamSample;
import optional.OptionalSample;
import stream.StreamSample2;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Optional;

public class Java8Sample {
    public static void main(String args[]) {

        // ラムダ式
        Lambda lambda = new Lambda();
        System.out.println(lambda.getLambdaMessage("ラムダ式動作検証"));

        // StreamAPI
        // 文字列
        StreamSample stream = new StreamSample();
        System.out.println(String.join(",", stream.getTeamName()));
        // 配列
        StreamSample2 stream2 = new StreamSample2();
        System.out.println(Arrays.toString(stream2.getStringArray()));
        //

        // Optional
        OptionalSample optionalSample = new OptionalSample();
        Optional<Integer> opt = Optional.ofNullable(optionalSample.getOptString());
        opt.ifPresent(optValue -> System.out.println(optValue)); // 値が存在する場合のみ実行

        // Date and Time
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss Z");

        ZonedDateTime t1 = now.withMinute(0).withSecond(0).withNano(0); // 分、秒、ナノ秒を0
        System.out.println(formatter.format(t1));
        ZonedDateTime t2 = now.with(TemporalAdjusters.lastDayOfMonth()); // 月末日
        System.out.println(formatter.format(t2));
        ZonedDateTime t3 = now.plusYears(1).minusHours(2); // 1年ごと２時間前
        System.out.println(formatter.format(t3));

        // デフォルトメソッド
        DefaultmethodImpl defaultMethod = new DefaultmethodImpl();
        System.out.println(defaultMethod.getMessage());

    }
}
