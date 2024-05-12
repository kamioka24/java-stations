package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから

        int postage = 800;

        int totalA = 0;
        for (int i = 0; i < itemPrices.length; i = i + 1) {
            totalA = totalA + itemPrices[i];
        }

        float totalB = 0;
        for (int i = 0; i < itemPrices.length; i = i + 1) {
            totalB = totalB + itemPrices[i] * 0.9f;
        }
        if (totalB < 5000) {
            totalB = totalB + postage;
        }

        float totalC = 0;
        for (int i = 0; i < itemPrices.length; i = i + 1) {
            if (itemPrices[i] < 2000 ) {
                totalC = totalC + itemPrices[i];   
            } else {
                totalC = totalC + itemPrices[i] * 0.8f;
            }
        }
        if (totalC < 5000) {
            totalC = totalC + postage;
        }

        if (totalA < totalB && totalA < totalC) {
            System.err.println("A");
        } else if (totalB < totalA && totalB < totalC) {
            System.err.println("B");
        } else {
            System.err.println("C");
        }
        // ここまで
    }
}
