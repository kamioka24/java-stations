package com.example.coupon;

public class CouponB {

    int postage = 800;

    public float calculate(int[] cartItems) {
        
        float totalB = 0;
        for (int i = 0; i < cartItems.length; i = i + 1) {
            totalB = totalB + cartItems[i] * 0.9f;
        }
        if (totalB < 5000) {
            totalB = totalB + postage;
        }
        return totalB;
    }
}
