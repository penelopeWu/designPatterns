package command.normal;

import command.normal.Command;

/**
 * Created by penelope on 2017/8/7.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
