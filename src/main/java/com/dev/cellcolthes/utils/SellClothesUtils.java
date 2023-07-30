package com.dev.cellcolthes.utils;

public class SellClothesUtils {
    private static final SellClothesUtils sellClothesUtils = new SellClothesUtils();

    public static SellClothesUtils getInstance() {
        return sellClothesUtils;
    }

    private SellClothesUtils() {
    }
}
