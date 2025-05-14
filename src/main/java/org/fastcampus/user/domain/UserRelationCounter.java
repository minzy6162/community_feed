package org.fastcampus.user.domain;

public class UserRelationCounter {
    private int count;

    public UserRelationCounter() {
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
}
