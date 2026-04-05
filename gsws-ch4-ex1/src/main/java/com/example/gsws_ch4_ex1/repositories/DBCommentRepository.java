package com.example.gsws_ch4_ex1.repositories;

import com.example.gsws_ch4_ex1.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());
    }
}
