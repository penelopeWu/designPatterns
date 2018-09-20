package command.eg;

/**
 * Created by penelope on 2017/8/8.
 */
public class Client {
    public static void main(String[] args) {
        FunctionButtonSettingWindow window = new FunctionButtonSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1,command2;
        command1 = new MinimizeCommand();
        command2 = new HelpCommand();

        //将命令注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        window.addFunctionButton(fb1);
        window.addFunctionButton(fb2);

        fb1.onClick();
        fb2.onClick();

    }
}
