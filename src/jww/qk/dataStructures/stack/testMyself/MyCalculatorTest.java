package jww.qk.dataStructures.stack.testMyself;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Qiankun
 * @date 2020/2/19 0019 -8:53
 * @title
 **/
public class MyCalculatorTest {

    public static void main(String[] args){

        MyFangFa myFangFa = new MyFangFa();
        //Stack<String> stack = new Stack<>();

//        String str = "4 5 * 8 - 60 + 8 2 / +";
//
//        List<String> list = MyFangFa.stringToList(str);
//
//        //System.out.println(list);
//        int result = myFangFa.operatorList(list);
//        System.out.println("结果：" + result);

        String e = "1+((2+3)*4)-5";
        List<String> list2 = myFangFa.toInfixExpressionList(e);
        System.out.println(list2);
        List<String> list3 = myFangFa.parseSuffixExpressionList(list2);
        System.out.println(list3);
    }
}
