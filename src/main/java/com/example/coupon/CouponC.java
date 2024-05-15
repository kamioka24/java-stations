package com.example.coupon;

public class CouponC {

    int postage = 800;

    public float calculate(int[] cartItems) {

        float totalC = 0;
        for (int i = 0; i < cartItems.length; i = i + 1) {
            if (cartItems[i] < 2000 ) {
                totalC = totalC + cartItems[i];   
            } else {
                totalC = totalC + cartItems[i] * 0.8f;
            }
        }
        if (totalC < 5000) {
            totalC = totalC + postage;
        }

        return totalC;
    }
}
