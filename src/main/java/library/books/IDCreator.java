package library.books;

import java.util.concurrent.atomic.AtomicInteger;

public final class IDCreator {
    private final AtomicInteger atomicInteger = new AtomicInteger(100000);
    public int getID() {
        return atomicInteger.incrementAndGet();
    }
}
