package jww.qk.dataStructures.linked.SingleLinkedList;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -8:56
 * @title
 **/
public class HeroNode {
        public int no;
        public String name;
        public String nickName;
        public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }



}
