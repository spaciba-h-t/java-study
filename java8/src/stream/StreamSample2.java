package stream;

import java.util.Arrays;
import java.util.stream.Stream;
/**
 * Stream
 * 文字列配列をStreamに変換する
 */
public class StreamSample2 {
    public Object[] getStringArray(){
        String[] str_array = new String[] { "sagan-tosu", "kasiwa", "sanfrecce"};
        Stream<String> strStream = Arrays.stream(str_array).sorted();

        return strStream.toArray();
    }
}
