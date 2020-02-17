package jww.qk.dataStructures.linked.SingleLinkedList;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -9:01
 * @title
 **/
public class SingleLinkedList {
    private HeroNode head = new HeroNode(0,"","");

    public void addNode(HeroNode heroNode){
        HeroNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = heroNode;

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

    public void insertNodeByOrder(HeroNode heroNode){//(1,"WWJ","秦坤");

        HeroNode temp = head;

        for(; temp.next != null; temp = temp.next){
            if(temp.next.no > heroNode.no){
                break;
            }
            if(temp.next.no == heroNode.no){
                System.out.println("已有该标号");
                return;
            }
        }
        heroNode.next = temp.next;
        temp.next = heroNode;

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

    public void deleteNode(int no){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        for (HeroNode temp = head; temp != null; temp = temp.next){
            if(temp.next == null){
                break;
            }
            if(temp.next.no == no){
                temp.next = temp.next.next;
                return;
            }
        }
        System.out.println("无法删除，找不到该英雄");
    }
}
