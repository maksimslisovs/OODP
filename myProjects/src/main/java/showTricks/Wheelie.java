package showTricks;

import motoInterface.Moto;

/**
 *  showTricks.Wheelie class implements showTricks.Command interface.
 */
public class Wheelie implements Command {

    private Moto moto;

    /**
     * Constructor for easier initialization.
     * @param moto Device object.
     */
    public Wheelie(Moto moto){
        this.moto = moto;
    }

    /**
     * Execute device's moveBackward command.
     */
    @Override
    public void execute() {
        moto.wheelie();
    }
}