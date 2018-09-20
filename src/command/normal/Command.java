package command.normal;

/**
 * 命令模式的本质是对请求进行封装，
 * 一个请求对应于一个命令，
 * 将发出命令的责任和执行命令的责任分割开。
 * Created by penelope on 2017/8/7.
 */
public interface Command {
    void execute();
}
