package repository;

import motoInterface.Moto;

import java.util.ArrayList;
import java.util.List;

public class MotoShow implements Moto {

    /**
     * Composite which could contain different cars.
     */
    private List<Moto> motosSystem = new ArrayList<Moto>();

    /**
     * Adding objects to Array list.
     * @param moto New moto to add.
     */
    public void addMoto(Moto moto){
        motosSystem.add(moto);
    }

    /**
     * Removing objects from Array list.
     * @param moto File to remove.
     */
    public void removeFile(Moto moto){
        motosSystem.add(moto);
    }


    public String getEngineSizes() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - points ");
        double points = 0;
        for (Moto moto : motosSystem) {
            points += Double.parseDouble(moto.getEngineSizes());
        }
        builder.append(points + " - P");

        return builder.toString();
    }


    public String getName() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Diving into repository.Show");
        for (Moto moto : motosSystem) {
            builder.append(moto.getName());
        }
        builder.append(" - repository.Show processed");

        return builder.toString();
    }

    /**
     * Showing Stoppie and display result.
     */
    public void wheelie() {

    }

    /**
     * Showing Wheelie and display result.
     */
    public void stoppie() {

    }

}