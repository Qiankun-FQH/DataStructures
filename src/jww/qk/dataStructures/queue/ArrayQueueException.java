package jww.qk.dataStructures.queue;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -20:22
 * @title
 **/
public class ArrayQueueException extends Exception{
    private String msg;

    public ArrayQueueException( String msg) {
        super(msg);
        this.msg = msg;
    }
}
