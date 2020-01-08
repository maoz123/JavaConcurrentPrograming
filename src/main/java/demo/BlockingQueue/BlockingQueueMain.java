package demo.BlockingQueue;

import demo.delayed.DelayedElement;

import java.util.PriorityQueue;
import java.util.concurrent.*;


/*
If the size of of the priority exceeds the largest size, then out of memory will throw.
PriorityBlcokingQueue using a max heap. The first element is the max elements. and the last element is the lowest element.
 */
public class BlockingQueueMain {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue1 = new ArrayBlockingQueue(5);
        //provide a mechanism to build fair or unfair blocking queue for threads that are blocking.
        try {
            blockingQueue1.offer("object1", 1000, TimeUnit.MILLISECONDS);

            blockingQueue1.poll(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BlockingQueue blockingQueue2 = new LinkedBlockingQueue();
        blockingQueue2.offer("object2", 1000, TimeUnit.MILLISECONDS);
        blockingQueue2.poll(1000, TimeUnit.MILLISECONDS);

        BlockingQueue blockingQueue3 = new SynchronousQueue();
        blockingQueue3.offer("object3");

        BlockingQueue<String> blockingQueue4 = new PriorityBlockingQueue();
        blockingQueue4.offer("object", 10, TimeUnit.MILLISECONDS);

        String str1 = blockingQueue4.poll();

        DelayQueue<DelayedElement> delayQueue = new DelayQueue();

        Executors.newScheduledThreadPool(1);

    }
}
