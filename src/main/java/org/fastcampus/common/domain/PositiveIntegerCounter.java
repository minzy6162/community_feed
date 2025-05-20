package org.fastcampus.common.domain;

public class PositiveIntegerCounter {
    private int count;

    public PositiveIntegerCounter() {
        this.count = 0;
    }

    public void increment() {
        this.count++;
    }

    public void decrease() {
        if (this.count <= 0) {
            return;
        }
        this.count--;
    }

    public void increase() {
    }
}
