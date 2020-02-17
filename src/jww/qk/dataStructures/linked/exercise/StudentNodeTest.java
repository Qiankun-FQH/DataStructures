package jww.qk.dataStructures.linked.exercise;

import org.junit.Test;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -10:36
 * @title
 **/
public class StudentNodeTest {
    //测试
    @Test
    public void test1(){
        StudentNode s1 = new StudentNode(1,"yi",1,"01");
        StudentNode s2 = new StudentNode(2,"er",2,"02");
        StudentNode s3 = new StudentNode(3,"san",3,"03");
        StudentNode s4 = new StudentNode(4,"si",4,"04");
        StudentNode s5 = new StudentNode(5,"wu",5,"05");
        StudentNode s6 = new StudentNode(6,"liu",6,"06");

        SingleLinkedList sll = new SingleLinkedList();

        sll.addNode(s1);
        sll.addNode(s2);
        sll.addNode(s3);
        sll.addNode(s4);
        sll.addNode(s5);

        StudentNode node = sll.findNodeIndex(6);
        if(node != null)
            System.out.println("id:" + node.id + "\tname:"+node.name + "\tage" + node.age + "\tclassId:" + node.classId);
        else
            System.out.println("该人不存在");


        //sll.showNode();
       // sll.reserve();
        System.out.println("------------------------------");

        //sll.showNode();


        sll.showFromTailToHead();

        int size = sll.size();
       // System.out.println(size);


    }

}
