package optional;

import java.util.Random;

public class OptionalSample {
    public Integer getOptString() {
        Random rand = new Random();
        int randomInt = rand.nextInt(2) + 100;;
        if(randomInt != 1) {
            return null;
        }
        return randomInt;
    }
}
