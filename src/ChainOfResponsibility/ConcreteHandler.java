package ChainOfResponsibility;

/**
 * Created by penelope on 2017/8/7.
 */
public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if(true){
            //满足条件，处理请求。。。
        }else {
            successor.handleRequest(request);//转发请求
        }
    }
}
