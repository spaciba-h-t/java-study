package com.company.privatemethod;

public interface PrivateMethod {
    // 変数
    public static final int NUM = 100;
    // privateは具象メソッドのみ定義可能
    private int privateNum() {
        return 0;
    }
    // デフォルトメソッドは具象メソッドを定義するために使う
    public default void printNum() {
        System.out.println("privateNum = " + privateNum() + ", NUM = " + NUM);
    }
}
