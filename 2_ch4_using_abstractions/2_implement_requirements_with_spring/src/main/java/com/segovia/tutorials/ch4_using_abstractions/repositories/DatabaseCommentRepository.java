package com.segovia.tutorials.ch4_using_abstractions.repositories;

import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.printf(
                "Storing comment in the database: [author=%s, comment=%s]\n",
                comment.getAuthor(), comment.getText());
    }
}
