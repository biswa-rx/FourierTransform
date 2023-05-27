package com.example.fouriertransfrom;

public class Complex {
    double re, im;
    public static final Complex ZERO = new Complex(0, 0);
    public Complex(double x, double y) { re = x; im = y; }
    public Complex() { this(0, 0); }
    public Complex add(Complex b) { return new Complex(re+b.re, im+b.im); }
    public Complex sub(Complex b) { return new Complex(re-b.re, im-b.im); }
    public Complex mul(Complex b) { return new Complex(re*b.re - im*b.im, re*b.im + im*b.re); }
    public Complex div(double x) { return new Complex(re/x, im/x); }

    public String toString() {
        return "Real " + Double.toString(re) + "  Imaginary " + Double.toString(im);
    }
}
