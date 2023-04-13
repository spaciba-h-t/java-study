package defaultMethod;

/**
 * デフォルトメソッド
 */
public interface DefaultMethod {
    public default String getMessage() {
        return "Default Method";
    }
}
