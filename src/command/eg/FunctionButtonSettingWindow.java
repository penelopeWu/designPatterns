package command.eg;

import java.util.ArrayList;

/**
 * “功能键设置”界面类
 * Created by penelope on 2017/8/8.
 */
public class FunctionButtonSettingWindow {
    private String title;//窗口标题
    //定义一个ArrayList来存储
    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();

    public FunctionButtonSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button){
        functionButtons.add(button);
    }

    public void removeFunctionButton(FunctionButton button){
        functionButtons.remove(button);
    }

    //显示窗口及功能键
    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for(Object button:functionButtons){
            System.out.println(((FunctionButton)button).getName());
        }
    }
}
