package com.example.coupon;

public class CouponA {

    public float calculate(int[] cartItems) {
        int totalA = 0;
        for (int i = 0; i < cartItems.length; i = i + 1) {
            totalA = totalA + cartItems[i];
        }
        return totalA;
    }
}
