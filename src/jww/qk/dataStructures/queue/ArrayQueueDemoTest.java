package jww.qk.dataStructures.queue;

import java.util.Scanner;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -20:32
 * @title
 **/
public class ArrayQueueDemoTest {
    public static void main(String[] args) throws ArrayQueueException {
        ArrayQueueDemo array = new ArrayQueueDemo(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        
        while (loop){
            System.out.println("s(show)：显示");
            System.out.println("e(exit)：退出");
            System.out.println("a(add)：添加");
            System.out.println("g(get)：取");
            System.out.println("h(head)：头数据");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    array.showQueue();
                    break;
                case 'a':
                    System.out.println("取出一个数");
                    int value = scanner.nextInt();
                    array.addQueue(value);
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    System.exit(0);
                case 'g':
                   int res = array.getQueue();
                    System.out.println("去除的是:"+res);
                    break;
                case 'h':
                    int r = array.headQueue();
                    System.out.println("偷看的是:"+r);
                    break;
            }
        }
        System.out.println("退出了");
    }
}
