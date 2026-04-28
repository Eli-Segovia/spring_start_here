package com.segovia.tutorials.ch4_using_abstractions.repositories;

import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;

public interface CommentRepository {

    // all comment repositories should store a comment. How we do this is in the implementor.
    void storeComment(Comment comment);
}
