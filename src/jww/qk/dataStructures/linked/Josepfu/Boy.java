package jww.qk.dataStructures.linked.Josepfu;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -14:41
 * @title
 **/
public class Boy {
    private int no;
    private Boy next;
    public Boy(int no){
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
