package com.segovia.tutorials.ch4_using_abstractions.proxies;

import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.printf("Sending comment via email: [author=%s, text=%s]\n", comment.getAuthor(), comment.getText());
    }
}
