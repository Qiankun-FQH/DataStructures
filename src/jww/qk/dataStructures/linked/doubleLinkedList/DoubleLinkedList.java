package jww.qk.dataStructures.linked.doubleLinkedList;



/**
 * @author Qiankun
 * @date 2020/2/17 0017 -14:16
 * @title
 **/
public class DoubleLinkedList {
    private HeroNode head = new HeroNode(0,"","");

    public void addNode(HeroNode heroNode){
        HeroNode temp = head;
        for(;temp.next != null;temp = temp.next);
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    public void showNode(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        for (HeroNode temp = head.next; temp != null; temp = temp.next){
            System.out.println("id:" + temp.no + "\tname:" + temp.name + "\tnickName:"+temp.nickName);
        }
    }
    public void alterNode(HeroNode heroNode){

        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        for (HeroNode temp = head.next; temp != null; temp = temp.next){
            if(temp.no == heroNode.no){
                temp.name = heroNode.name;
                temp.nickName = heroNode.nickName;
                return;
            }
        }
        System.out.println("无法修改，找不到该英雄");

    }

    public void deleteByNo(int no){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        for (HeroNode temp = head.next; temp != null; temp = temp.next){
            if(temp.no == no){
                temp.pre.next = temp.next;
                if(temp.next != null)
                     temp.next.pre = temp.pre;
                return;
            }
        }
        System.out.println("无法删除，找不到该英雄");
    }

}
