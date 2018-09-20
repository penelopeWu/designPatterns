package command.eg;

/**
 * Created by penelope on 2017/8/8.
 */
public class HelpCommand implements Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
