package showTricks;

public class ShowControl {
    private Command command;

    /**
     * Constructor for easier initialization.
     * @param command showTricks.Command object.
     */
    public ShowControl(Command command){
        this.command = command;
    }

    /**
     * Calls showTricks.Command object method execute.
     */
    public void pressButton(){
        command.execute();
    }
}
