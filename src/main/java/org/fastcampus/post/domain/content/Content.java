package org.fastcampus.post.domain.content;

import org.fastcampus.common.domain.common.DatetimeInfo;

import java.util.Date;

public abstract class Content {
    String contentText;
    final DatetimeInfo datetimeInfo;

    protected Content(String contentText, DatetimeInfo datetimeInfo) {
        checkText(contentText);
        this.contentText = contentText;
        this.datetimeInfo = new DatetimeInfo();
    }

    public void updateContent(String updateContent){
        checkText(updateContent);
        this.contentText = updateContent;
        this.datetimeInfo = datetimeInfo.updateEditDatetime();
    }

    protected abstract void checkText(String contentText);

    public String getContentText() {
        return contentText;
    }
}
