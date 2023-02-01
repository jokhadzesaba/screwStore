package com.company;

import java.util.Objects;

public class Screw {
    private final double diameter;
    private final double length;
    private double price;
    private final ScrewDrive head;
    public Screw(double diameter, double length, double price, ScrewDrive head) {
        this.diameter = diameter;
        this.length = length;
        this.price = price;
        this.head = head;
    }

    @Override
    public String toString() {
        return "" + head;
    }

    public ScrewDrive getHead() {
        return null;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screw screw = (Screw) o;
        return Double.compare(screw.diameter, diameter) == 0 && Double.compare(screw.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return head.hashCode() + 7*Double.hashCode(diameter)+ 49*Double.hashCode(length);
    }
}


