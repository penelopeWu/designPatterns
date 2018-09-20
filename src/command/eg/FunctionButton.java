package command.eg;

/**
 * FunctionButton充当请求调用者
 * Created by penelope on 2017/8/8.
 */
public class FunctionButton {
    private String name;//功能键名字
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void onClick(){
        System.out.println("点击功能键");
        command.execute();
    }
}
