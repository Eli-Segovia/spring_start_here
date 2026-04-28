package com.segovia.tutorials.ch4_using_abstractions.services;

import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;
import com.segovia.tutorials.ch4_using_abstractions.proxies.CommentNotificationProxy;
import com.segovia.tutorials.ch4_using_abstractions.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy notificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy notificationProxy) {
        this.commentRepository = commentRepository;
        this.notificationProxy = notificationProxy;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public CommentNotificationProxy getNotificationProxy() {
        return notificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        notificationProxy.sendComment(comment);
    }
}
