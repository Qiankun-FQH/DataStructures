package jww.qk.dataStructures.linked.Josepfu;

import javax.print.attribute.standard.PrinterURI;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -14:43
 * @title
 **/
public class CircleSingleLinkedList {
    private Boy first = null;

    public void addBoy(int nums){
        if(nums < 1){
            System.out.println("不能添加");
            return;
        }

        Boy curBoy = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if(i == 1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }else{
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    public void show(){
        if(first == null){
            System.out.println("没有小孩");
            return;
        }

        Boy currBoy = first;
        while(true){
            System.out.println("id ： "+ currBoy.getNo());
            if(currBoy.getNext() == first){
                break;
            }
            currBoy = currBoy.getNext();
        }
    }

    public void countBoy(int startNo, int countNo, int nums){
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("重新输入");
            return;
        }
        Boy helper = first;

        while(true){
            if(helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }

        for(int i = 0; i < startNo - 1; i++){
            first = first.getNext();
            helper = helper.getNext();
        }

        while(true){
            if(helper == first){
                System.out.println("id:" + first.getNo());
                break;
            }
            for(int i = 0; i < countNo - 1; i++){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println("id:" + first.getNo());

            first = first.getNext();
            helper.setNext(first);
        }
        System.out.println("游戏结束");
    }

}
