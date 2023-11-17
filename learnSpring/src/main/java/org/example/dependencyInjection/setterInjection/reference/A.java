package org.example.dependencyInjection.setterInjection.reference;

public class A {
    private int val;
    private B b;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A(int val, B b) {
        super();
        this.val = val;
        this.b = b;
    }

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "val=" + val +
                ", b=" + b +
                '}';
    }
}
