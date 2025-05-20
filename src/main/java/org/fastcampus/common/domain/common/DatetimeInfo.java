package org.fastcampus.common.domain.common;

import java.time.LocalDateTime;

public class DatetimeInfo {

    private final boolean isEdited;
    private final LocalDateTime datetime;
    private LocalDateTime dateTime;

    public DatetimeInfo(){
        this.isEdited = false;
        this.datetime = LocalDateTime.now();
    }

    public void updateEditDatetime(){
        this.isEdited = true;
        this.dateTime = LocalDateTime.now();
    }

    public boolean isEdited() {
        return isEdited;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }
}
