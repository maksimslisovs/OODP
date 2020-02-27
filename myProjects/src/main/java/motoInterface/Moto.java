package motoInterface;

public interface Moto {

    String getEngineSizes();

    String getName();

    /**
     *  Maneuver in which the front wheel or wheels come off the ground.
     */
    void wheelie();

    /**
     * Trick in which back wheel is lifted and the bike is ridden on the front wheel.
     */
    void stoppie  ();
}
