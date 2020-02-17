package jww.qk.dataStructures.linked.exercise;

import java.util.Stack;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -10:28
 * @title
 **/
public class SingleLinkedList {
    private StudentNode head = new StudentNode(0,"",0,"");

    public int size(){
        int sum = 0;
        StudentNode temp = head;
        for(temp = temp.next; temp != null; temp = temp.next){
            sum++;
        }
        return sum;

    }

    public void addNode(StudentNode studentNode){
        StudentNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = studentNode;
    }


    public StudentNode findNodeIndex(int index){//4
        if(head.next == null ){
            System.out.println("链表为空");
            return null;
        }



        int temp_index = size() - index;


        int i = 0;
        for(StudentNode  temp = head.next; temp != null; temp = temp.next){
            ++i;
            if(temp_index == i){
                return temp;
            }
        }
        return null;
    }



//    StudentNode s1 = new StudentNode(1,"yi",1,"01");
//    StudentNode s2 = new StudentNode(2,"er",2,"02");
//    StudentNode s3 = new StudentNode(3,"san",3,"03");
//    StudentNode s4 = new StudentNode(4,"si",4,"04");
//    StudentNode s5 = new StudentNode(5,"wu",5,"05");
    public void reserve(){

        if(head.next == null || head.next.next == null){
            return;
        }

       // StudentNode temp = head.next;
        StudentNode temp2 = null;
        StudentNode reverseHead = new StudentNode(0,"",0,"");
        for(StudentNode temp = head.next; temp != null; temp = temp2){
            temp2 = temp.next;
            temp.next = reverseHead.next;
            reverseHead.next = temp;
        }
        head.next = reverseHead.next;

    }

    public void showNode(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        for (StudentNode temp = head.next; temp != null; temp = temp.next){
            System.out.println("id:" + temp.id + "\tname:" + temp.name + "\tage:" + temp.age + "\tclassId" + temp.classId);
        }
    }


    public void showFromTailToHead(){
       // showNode();

        if(head.next == null){
            return;
        }

        Stack<StudentNode> stack = new Stack<>();
        StudentNode node = head.next;
        while(node != null){
            stack.push(node);
            node = node.next;
         }
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

}
