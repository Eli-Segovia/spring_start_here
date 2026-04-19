package com.segovia.tutorials.ch4_using_abstractions.services.repositories.proxies;

import com.segovia.tutorials.ch4_using_abstractions.services.repositories.beans.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
