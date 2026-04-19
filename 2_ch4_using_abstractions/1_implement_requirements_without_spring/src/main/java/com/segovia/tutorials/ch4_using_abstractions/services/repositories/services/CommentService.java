package com.segovia.tutorials.ch4_using_abstractions.services.repositories.services;

import com.segovia.tutorials.ch4_using_abstractions.services.repositories.beans.Comment;
import com.segovia.tutorials.ch4_using_abstractions.services.repositories.proxies.CommentNotificationProxy;
import com.segovia.tutorials.ch4_using_abstractions.services.repositories.repositories.CommentRepository;

public class CommentService {
    private CommentRepository commentRepository;
    private CommentNotificationProxy notificationProxy;

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
