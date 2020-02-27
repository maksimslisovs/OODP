package motoType;

import motoInterface.Moto;

public class Enduro implements Moto, Cloneable {

    private String engineSizes = "350";
    private String name = "KTM EXC";

    // Variables for Tricks
    private int wheelie = 0;
    private int stoppie = 0;


    public String getEngineSizes() {
        return engineSizes;
    }


    public String getName() {
        return name;
    }

    public Enduro() {
    }

    public Enduro(String engineSizes, String name) {
        this.engineSizes = engineSizes;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new NakedBike(engineSizes, name);
    }

    @Override
    public String toString() {
        return "Enduro{" +
                "engineSizes='" + engineSizes + '\'' +
                ", model='" + name + '\'' +
                '}';
    }


    /**
     * Maneuver in which the front wheel or wheels come off the ground.
     */

    public void wheelie() {
        wheelie++;
        System.out.println("wheelie trick count " + wheelie);
    }


    public void stoppie() {
        stoppie++;
        System.out.println("stoppie trick count " + stoppie);
    }
}