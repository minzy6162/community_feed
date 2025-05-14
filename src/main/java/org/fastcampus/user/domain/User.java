package org.fastcampus.user.domain;

import java.util.Objects;

public class User {
    private final long id;
    private final UserInfo userInfo;
    private final UserRelationCounter follingCounter;
    private final UserRelationCounter followerCounter;

    public User(long id, UserInfo userInfo) {
        this.id = id;
        this.userInfo = userInfo;
        this.follingCounter = new UserRelationCounter();
        this.followerCounter = new UserRelationCounter();
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
}
