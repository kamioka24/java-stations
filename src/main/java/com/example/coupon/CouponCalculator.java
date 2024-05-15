package com.example.coupon;

public class CouponCalculator {

    public String findBestCoupon(int[] cartItems) {

        CouponA couponA = new CouponA();
        CouponB couponB = new CouponB();
        CouponC couponC = new CouponC();

        float totalA = couponA.calculate(cartItems);
        float totalB = couponB.calculate(cartItems);
        float totalC = couponC.calculate(cartItems);

        if (totalA < totalB && totalA < totalC) {
            return "A";
        } else if (totalB < totalA && totalB < totalC) {
            return "B";
        } else {
            return "C";
        }
    }
}
