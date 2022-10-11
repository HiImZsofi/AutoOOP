package hu.petrik.autooop;

public class Tesla implements  Auto{
    private double sebesseg;

    public Tesla() {
        this.sebesseg = Math.floor(Math.random()*60) ;
    }

    @Override
    public double gyorsul() {
        return this.getSebesseg() + Math.floor(Math.random()*15 + 5);
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }

    public String toString() {
        return String.format(this.getSebesseg() + " " + gyorsul());
    }
}
