package com.segovia.tutorials.ch4_using_abstractions.proxies;

import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
