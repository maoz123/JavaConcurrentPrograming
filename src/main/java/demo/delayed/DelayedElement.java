package demo.delayed;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
    private int value;

    public DelayedElement(int value) {
        this.value = value;
    }

    public long getDelay(TimeUnit unit) {
        return 100;
    }

    public int compareTo(Delayed o) {
        return (int)(getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
    }
}
