package org.fastcampus.user.domain;

import org.fastcampus.common.domain.PositiveIntegerCounter;

import java.util.Objects;

public class User {
    private final long id;
    private final UserInfo userInfo;
    private final PositiveIntegerCounter follingCounter;
    private final PositiveIntegerCounter followerCounter;

    public User(long id, UserInfo userInfo) {
        this.id = id;
        this.userInfo = userInfo;
        this.follingCounter = new PositiveIntegerCounter();
        this.followerCounter = new PositiveIntegerCounter();
    }

    public void follow(User targetUser) {
        if (this.equals(targetUser)) {
            throw new IllegalArgumentException();
        }

        follingCounter.increment();
        targetUser.increaseFollowerCounter();
    }

    public void unfollow(User targetUser) {
        if (this.equals(targetUser)) {
            throw new IllegalArgumentException();
        }

        follingCounter.decrease();
        targetUser.decreaseFollowerCounter();

    }

    private void increaseFollowerCounter() {
        followerCounter.increment();
    }

    private void decreaseFollowerCounter() {
        followerCounter.decrease();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }
}
