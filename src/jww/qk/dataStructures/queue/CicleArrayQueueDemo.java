package jww.qk.dataStructures.queue;

import sun.awt.SunHints;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -20:14
 * @title
 **/
public class CicleArrayQueueDemo {
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

    public CicleArrayQueueDemo(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    public boolean isFull(){
        return (rear + 1)%maxSize == front;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n) throws ArrayQueueException {
        if(isFull()){
            throw new ArrayQueueException("队列已满");
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() throws ArrayQueueException {
        if(isEmpty()){
            throw new ArrayQueueException("队列为空");
        }
        int temp = arr[front];
        front = (front+1) % maxSize;
        return temp;
    }

    public void showQueue() throws ArrayQueueException {
        if(isEmpty()){
            throw new ArrayQueueException("队列为空");
        }
        for (int i = front; i < front + size(); i++) {
            System.out.println("i的值是" + i +"\narr["+ i%maxSize +"] = " + arr[i]);
        }
    }

    public int headQueue() throws ArrayQueueException {
        if(isEmpty()){
            throw new ArrayQueueException("队列为空");
        }
        return arr[front];
    }

    public int size(){
        return (rear + maxSize - front) % maxSize;
    }
}
