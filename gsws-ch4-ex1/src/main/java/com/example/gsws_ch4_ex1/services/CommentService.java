package com.example.gsws_ch4_ex1.services;

import com.example.gsws_ch4_ex1.Comment;
import com.example.gsws_ch4_ex1.proxies.CommentNotificationProxy;
import com.example.gsws_ch4_ex1.repositories.CommentRepository;

public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy
    ) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
