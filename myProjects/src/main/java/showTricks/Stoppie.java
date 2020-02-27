package showTricks;

import motoInterface.Moto;

    /**
     *  showTricks.Wheelie class implements showTricks.Command interface.
     */
    public class Stoppie implements Command {

        private Moto moto;

        /**
         * Constructor for easier initialization.
         * @param moto Device object.
         */
        public Stoppie(Moto moto){
            this.moto = moto;
        }

        /**
         * Execute device's moveBackward command.
         */

        public void execute() {
            moto.stoppie();
        }
    }

