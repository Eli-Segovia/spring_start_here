package com.segovia.tutorials.ch4_using_abstractions.services.repositories.repositories;

import com.segovia.tutorials.ch4_using_abstractions.services.repositories.beans.Comment;

public interface CommentRepository {

    // all comment repositories should store a comment. How we do this is in the implementor.
    void storeComment(Comment comment);
}
