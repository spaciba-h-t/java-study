import lambda.Lambda;

public class Java8Sample {
    public static void main(String args[]) {

        // ラムダ式
        Lambda lambda = new Lambda();
        System.out.println(lambda.getLambdaMessage("ラムダ式動作検証"));
    }
}
