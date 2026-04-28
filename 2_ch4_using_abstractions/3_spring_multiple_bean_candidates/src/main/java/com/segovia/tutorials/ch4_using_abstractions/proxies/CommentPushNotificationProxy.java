package com.segovia.tutorials.ch4_using_abstractions.proxies;

import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.printf("Sending comment via push notification: [author=%s, text=%s]\n", comment.getAuthor(), comment.getText());
    }
}
