package com.example.fouriertransfrom;

public class FourierTransform {
    static final double PI = Math.acos(-1);
    public static void FFT(Complex[] a, boolean invert) {
        int n = a.length;
        if (n == 1)
            return;

        Complex[] a0 = new Complex[n / 2];
        Complex[] a1 = new Complex[n / 2];
        for (int i = 0; 2 * i < n; i++) {
            a0[i] = a[2*i];
            a1[i] = a[2*i+1];
        }
        FFT(a0, invert);
        FFT(a1, invert);

        double ang = 2 * PI / n * (invert ? -1 : 1);
        Complex w = new Complex(1, 0);
        Complex wn = new Complex(Math.cos(ang), Math.sin(ang));
        for (int i = 0; 2 * i < n; i++) {
            a[i] = a0[i].add(w.mul(a1[i]));
            a[i + n/2] = a0[i].sub(w.mul(a1[i]));
            if (invert) {
                a[i] = a[i].div(2);
                a[i + n/2] = a[i + n/2].div(2);
            }
            w = w.mul(wn);
        }
    }
}
