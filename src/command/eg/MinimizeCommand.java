package command.eg;

/**
 * 最小化命令类：具体命令类
 * Created by penelope on 2017/8/8.
 */
public class MinimizeCommand implements Command {
    private WindowHandler windowHandler;

    public MinimizeCommand() {
        this.windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
