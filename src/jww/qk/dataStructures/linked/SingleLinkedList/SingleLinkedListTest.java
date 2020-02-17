package jww.qk.dataStructures.linked.SingleLinkedList;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -9:15
 * @title
 **/
public class SingleLinkedListTest {
    public static void main(String[] args){
        SingleLinkedList s = new SingleLinkedList();
        HeroNode heroNode1 = new HeroNode(1,"WWJ","秦坤");
        HeroNode heroNode2 = new HeroNode(2,"QK","武文杰");
        HeroNode heroNode3 = new HeroNode(3,"qiankun","安安");
        HeroNode heroNode4 = new HeroNode(4,"qinkun","kukuk");
        HeroNode heroNode5 = new HeroNode(5,"AA","aa");
        HeroNode heroNode6 = new HeroNode(6,"BB","bb");
        HeroNode heroNode7 = new HeroNode(7,"CC","cc");

        HeroNode alterHeroNode = new HeroNode(4,"sansan","三三");
        s.addNode(heroNode2);
        s.addNode(heroNode5);
        s.insertNodeByOrder(heroNode1);
        s.insertNodeByOrder(heroNode4);
        s.insertNodeByOrder(heroNode6);
        s.alterNode(alterHeroNode);
        s.deleteNode(1);
        s.insertNodeByOrder(heroNode3);
        s.insertNodeByOrder(heroNode7);
       // s.insertNodeByOrder(heroNode6);
        s.showNode();
    }
}
