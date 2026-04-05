package com.example.gsws_ch4_ex1.proxies;

import com.example.gsws_ch4_ex1.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
