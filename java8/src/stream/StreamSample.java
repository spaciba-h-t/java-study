package stream;

import java.util.stream.Stream;
/**
 * Stream
 */
public class StreamSample {
    public String[] getTeamName(){
        String[] teams = Stream.of("antlers", "frontale", "urawa-reds", "cerezo", "consadole-sapporo")
                .map(s -> s.toUpperCase())
                .sorted()
                .toArray(String[]::new);
        return teams;
    }
}
