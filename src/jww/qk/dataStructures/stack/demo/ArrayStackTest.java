package jww.qk.dataStructures.stack.demo;

import java.util.Scanner;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -15:10
 * @title
 **/
public class ArrayStackTest {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        String key = "";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);


        while (loop){
            System.out.println("1s,\t2push,\t,3pop\t,4\t,5\t");
            key = scanner.next();
            switch (key){
                case "1":
                    stack.list();
                    break;
                case "2":
                    System.out.println("输入数");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "3":
                    int res = stack.pop();
                    System.out.println("res:" + res);

                    break;
                case "4":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }

        System.out.println("退出.");
    }
}
