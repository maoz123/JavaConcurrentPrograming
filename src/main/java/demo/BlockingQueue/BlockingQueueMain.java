package demo.BlockingQueue;

import java.util.concurrent.*;

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

    }
}
