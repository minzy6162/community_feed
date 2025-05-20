package org.fastcampus.post.domain.content;

public class CommentContent  extends Content {
    private static final int MAX_CONTENT_LENGTH = 100;

    public CommentContent(String contnet) {
        super(contnet);
    }

    @Override
    protected void checkText(String contentText) {
        if (contentText == null || contentText.isEmpty()){
            throw new IllegalArgumentException();
        }

        if (MAX_CONTENT_LENGTH < contentText.length()){
            throw new IllegalArgumentException();
        }
    }
}
