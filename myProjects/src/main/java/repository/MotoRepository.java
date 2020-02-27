package repository;

import iterator.Aggregate;
import iterator.Iterator;
import motoInterface.Moto;
import motoType.Enduro;
import motoType.NakedBike;
import motoType.SportBike;


public class MotoRepository implements Aggregate {

    // Array with moto.
    private Moto motos[] = {new Enduro(), new NakedBike(), new SportBike()};

    /**
     * Gets iterator.
     *
     * @return MotoIterator object.
     */

    public Iterator getIterator() {
        return new MotoIterator();
    }

    /**
     * MotoIterator class which implements itarator.Iterator interface.
     */
    private class MotoIterator implements Iterator {

        private int index = 0;

        /**
         * Check if collection contains next value.
         *
         * @return boolean.
         */

        public boolean hasNext() {
            if (index < motos.length) {
                return true;
            }
            return false;
        }

        /**
         * Returns next value from array.
         *
         * @return String value of moto.
         */

        public Object next() {
            return motos[index++];
        }
    }
}