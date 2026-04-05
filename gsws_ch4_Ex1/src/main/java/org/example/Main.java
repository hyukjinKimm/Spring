package org.example;

import org.example.services.CommentService;
import org.example.services.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("haha");
        comment.setAuthor("yumi");

        service.sendComment(comment);
        service.sendComment(comment);
//        var comment = new Comment();
//        comment.setAuthor("Larentiu");
//        comment.setText("Demo comment");
//
//        var commentService = context.getBean(CommentService.class);
//        commentService.publicComment(comment);

    }
}