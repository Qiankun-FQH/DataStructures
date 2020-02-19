package jww.qk.dataStructures.stack.demo;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -15:02
 * @title
 **/
public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty(){
        return top == - 1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("栈空");
            //throw new RuntimeException("栈空");
        }

        int value = stack[top];

        top--;
        return value;
    }

    public void list(){
        if(isEmpty()){
            System.out.println("栈空");
        }
        for(int i = top; i >= 0; i--){
            System.out.println("stack [" + i + "]" + stack[i]);
        }
    }

}
