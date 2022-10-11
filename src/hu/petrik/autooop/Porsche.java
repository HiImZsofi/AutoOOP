package hu.petrik.autooop;

public class Porsche implements Auto{
    private double sebesseg;

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public double gyorsul() {
        return this.getSebesseg() + 10.0;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }

    @Override
    public String toString() {
        return String.format(this.getSebesseg() + " " + gyorsul());
    }
}
