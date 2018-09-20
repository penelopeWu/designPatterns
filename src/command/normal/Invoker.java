package command.normal;

import command.normal.Command;

/**
 * Created by penelope on 2017/8/7.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
