package jww.qk.dataStructures.stack.testMyself;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Qiankun
 * @date 2020/2/19 0019 -8:53
 * @title
 **/
public class MyFangFa {


    public static List<String> stringToList(String str) {
        List<String> ls = new ArrayList<>();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            ls.add(s[i]);
        }
        return ls;
    }

    public int operatorList(List<String> list) {

        Stack<String> stack = new Stack<>();

        for(String str : list){
            if(str.matches("\\d+")){
                stack.push(str);//*
            }
            else{
                System.out.println("第一步");
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                System.out.println("第二步");

                int res = AOperB(num2, num1, str);

                stack.push(res + "");
            }
        }
        return Integer.parseInt(stack.pop());
    }

       /* for(String item : list){
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
    }*/

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

    public boolean isOper(String val){
        System.out.println(val);
        char a = val.charAt(0);
        return a == '+'
                || a =='-'
                || a == '*'
                || a == '/';
    }

    public List<String> stringToList2(String str){
        List<String> ls = new ArrayList<String>();
        String s = "";
        int index = 0;

        while(true){
            if(str.charAt(index)=='('){
                ls.add(str.charAt(index) + "");
                ++index;
                continue;
            }
            if(str.charAt(index) == ')'){
                ls.add(str.charAt(index) + "");
                ++index;
                continue;
            }
            if(isOper(str.charAt(index))){
                ls.add(s);
                ls.add(str.charAt(index) + "");
                ++index;
                s = "";
                continue;
            }
            s += str.charAt(index);

            index++;
            if(index > str.length() - 1){
                ls.add(s);
                break;
            }
        }

        //reverse(ls);

        return ls;
    }

    public boolean isOper(int val){
        return val == '+'
                || val =='-'
                || val == '*'
                || val == '/';
    }

    public  List<String> parseSuffixExpressionList(List<String> ls){
        Stack<String> s1 = new Stack<>();

        List<String> s2 = new ArrayList<>();

        for(String item : ls){
            if(item.matches("\\d+")){
                s2.add(item);
            }else if(item.equals("(")){
                s1.add(item);
            }else if(item.equals((")"))){
                while(!s1.peek().equals("(")){
                    s2.add(s1.pop());
                }
                s1.pop();
            }else{
            while(s1.size() != 0 && getValue(s1.peek()) >= getValue(item)){
                s2.add(s1.pop());
            }
            s1.push(item);
        }
    }
        while (s1.size() != 0){
            s2.add(s1.pop());
        }
        return s2;
    }
    public  int getValue(String op){
        int result = 0;
        switch (op){
            case "+":
                result = 1;
                break;
            case "-":
                result = 1;
                break;
            case "*":
                result = 2;
                break;
            case "/":
                result = 2;
                break;
            default:
                System.out.println("错误");
                break;
        }
        return result;
    }
    public  List<String> toInfixExpressionList(String s){

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
}
