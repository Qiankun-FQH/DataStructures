package jww.qk.dataStructures.stack.test;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -15:43
 * @title
 **/
public class CalculatorTest {
    public static void main(String[] args){
        String e = "31+12*1-1";
        ArrayStack s1 = new ArrayStack(10);
        ArrayStack s2 = new ArrayStack(10);
        int index = 0;

        int num1 = 0;
        int num2 = 0;
        int oper = 0;

        int res = 0;
        char ch = ' ';
        String keepNumber = "";

        while(true){

            ch = e.substring(index, index+1).charAt(0);

            if(s2.isOper(ch)){
                if(!s2.isEmpty()){
                    if(s2.priority(ch) <= s2.priority(s2.look())){
                        num1 = s1.pop();

                        num2 = s1.pop();

                        oper = s2.pop();

                        res = s1.cal(num1,num2,oper);

                        s1.push(res);

                        s2.push(ch);
                    }else{
                        s2.push(ch);
                    }
                }else{
                        s2.push(ch);
                }
            }else{
                //s1.push(ch - 48);
                keepNumber += ch;

                if(index == e.length() - 1){
                    s1.push(Integer.parseInt(keepNumber));
                }

                else if(s2.isOper(e.substring(index+1,index+2).charAt(0))){
                    s1.push(Integer.parseInt(keepNumber));

                    keepNumber = "";
                }

            }
            index++;
            if(index >= e.length()){
                break;
            }
        }
        while (true){
            if(s2.isEmpty()){
                break;
            }
            num1 = s1.pop();

            num2 = s1.pop();

            oper = s2.pop();

            res = s1.cal(num1,num2,oper);

            s1.push(res);
        }
        System.out.println("值为："+ s1.pop());
    }

}
