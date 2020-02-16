package jww.qk.dataStructures.queue;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -20:14
 * @title
 **/
public class ArrayQueueDemo {
    /**
     * 最大值
     */
    private int maxSize;
    
    /**
     * 队头
     */
    private int front;
    
    /**
     * 队尾
     */
    private int rear;

    /**
     * 队列
     */
    private int[] arr;

    public ArrayQueueDemo(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        return rear == maxSize - 1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n) throws ArrayQueueException {
        if(isFull()){
                throw new ArrayQueueException("队列已满");
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() throws ArrayQueueException {
        if(isEmpty()){
            throw new ArrayQueueException("队列为空");
        }
        front++;
        return arr[front];
    }

    public void showQueue() throws ArrayQueueException {
        if(isEmpty()){
            throw new ArrayQueueException("队列为aa");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int headQueue() throws ArrayQueueException {
        if(isEmpty()){
            throw new ArrayQueueException("队列为空");
        }
        return arr[front + 1];
    }
}
