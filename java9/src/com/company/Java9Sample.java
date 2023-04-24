package com.company;

import java.util.List;
import java.util.Map;

public class Java9Sample {

    public static void main(String[] args) {
	    // 不変List/Set/Map用のファクトリメソッド
        List emptyImmutableList = List.of();
        System.out.println(emptyImmutableList);
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(nonemptyImmutableMap);
    }
}
