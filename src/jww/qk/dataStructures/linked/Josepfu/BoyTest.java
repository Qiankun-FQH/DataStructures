package jww.qk.dataStructures.linked.Josepfu;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -14:51
 * @title
 **/
public class BoyTest {
    public static void main(String[] args){
        CircleSingleLinkedList list = new CircleSingleLinkedList();
        list.addBoy(17);
        list.show();;
        System.out.println("=------------------------");
        list.countBoy(1,7,17);
    }

}
