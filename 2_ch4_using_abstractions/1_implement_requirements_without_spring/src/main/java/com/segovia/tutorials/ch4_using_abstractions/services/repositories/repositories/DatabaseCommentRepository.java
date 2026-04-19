package com.segovia.tutorials.ch4_using_abstractions.services.repositories.repositories;

import com.segovia.tutorials.ch4_using_abstractions.services.repositories.beans.Comment;

public class DatabaseCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.printf(
                "Storing comment in the database: [author=%s, comment=%s]\n",
                comment.getAuthor(), comment.getText());
    }
}
