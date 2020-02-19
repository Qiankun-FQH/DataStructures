package jww.qk.dataStructures.stack.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -16:44
 * @title
 **/
public class PolandNotation {
    public static void main(String[] args){

//        String e = "1+((2+3)*4)-5";
//        List<String> list = toInfixExpressionList(e);
//        System.out.println(list);

        String suffixE = "4 5 * 8 - 60 + 8 2 / +";//= "30 4 + 5 * 6 -";
//
//

        List<String> list = getListString(suffixE);
        System.out.println("rpnList = "+ list);
        int res = cal(list);
        System.out.println("结果：" + res);

    }

    public static List<String> toInfixExpressionList(String s){

        List<String> ls = new ArrayList<>();

        int i = 0;
        String str;
        char c;
        do{
            if((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57){
                ls.add("" +c);
                i++;
            }else{
                str = "";
                while (i < s.length() && (c = s.charAt(i)) >= 48 && (c=s.charAt(i)) < 57){
                    str += c;
                    i++;
                }
                ls.add(str);
            }
        }while(i < s.length());
        return ls;
    }


    public static List<String> getListString(String su){
        String[] s = su.split(" ");
        List<String> list = new ArrayList<>();
        for (String ele : s){
            list.add(ele);
        }
        return list;
    }

    public static int cal(List<String> ls){
        Stack<String> stack = new Stack<>();
        //        String suffixE = "4 5 * 8 - 60 + 8 2 / +";//= "30 4 + 5 * 6 -";
        for(String item : ls){
            if(item.matches("\\d+")){
                stack.push(item);//*
            }else{
                int num2 = Integer.parseInt(stack.pop());//4
                int num1 = Integer.parseInt(stack.pop());//5

                int res = AOperB(num1, num2, item);

                stack.push(res + "");
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static int AOperB(int num1, int num2, String item){
        int res = 0;
        if(item.equals("+")){
            res = num1 + num2;
        }else if(item.equals("-")){
            res = num1 - num2;
        }else if(item.equals("*")){
            res = num1 * num2;
        }else if(item.equals("/")){
            res = num1 / num2;
        }else{
            throw new RuntimeException("运算符错误");
        }
        return res;
    }


}
