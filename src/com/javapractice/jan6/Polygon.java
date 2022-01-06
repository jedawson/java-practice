package com.javapractice.jan6;

public abstract class Polygon {
    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    int dim1;
    int dim2;
    abstract double getArea();

    @Override
    public String toString() {
        return "Polygon{dim1: "+dim1+", dim2: "+dim2+"}";
    }

    public Polygon(){}
    public Polygon(int dim1, int dim2) {
        this.dim1=dim1;
        this.dim2=dim2;
    }
}
