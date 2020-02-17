package jww.qk.dataStructures.linked.doubleLinkedList;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -14:22
 * @title
 **/
public class DoubleLinkedListTest {
    public static void main(String[] args){
        DoubleLinkedList s = new DoubleLinkedList();
        HeroNode heroNode1 = new HeroNode(1,"WWJ","秦坤");
        HeroNode heroNode2 = new HeroNode(2,"QK","武文杰");
        HeroNode heroNode3 = new HeroNode(3,"qiankun","安安");
        HeroNode heroNode4 = new HeroNode(4,"qinkun","kukuk");
        HeroNode heroNode5 = new HeroNode(5,"AA","aa");
        HeroNode heroNode6 = new HeroNode(6,"BB","bb");
        HeroNode heroNode7 = new HeroNode(7,"CC","cc");

        HeroNode alterHeroNode = new HeroNode(4,"sansan","三三");

        s.addNode(heroNode1);
        s.addNode(heroNode2);
        s.addNode(heroNode3);
        s.addNode(heroNode4);
        s.addNode(heroNode5);
        s.addNode(heroNode6);
        s.alterNode(alterHeroNode);

        s.deleteByNo(6);
        s.addNode(heroNode7);
        s.showNode();
    }
}
