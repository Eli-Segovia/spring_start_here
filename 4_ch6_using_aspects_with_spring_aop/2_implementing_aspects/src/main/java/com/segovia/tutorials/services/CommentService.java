package com.segovia.tutorials.services;

import com.segovia.tutorials.beans.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing the comment with text: " + comment.getText());
    }
}
