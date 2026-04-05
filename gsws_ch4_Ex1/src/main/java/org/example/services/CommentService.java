package org.example.services;


import org.example.Comment;
import org.example.CommentProcessor;
import org.example.proxies.CommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @Autowired
    private ApplicationContext context;

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(
            CommentRepository commentRepository,
            @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy
    ) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    public void sendComment(Comment comment) {
        CommentProcessor p = context.getBean(CommentProcessor.class);
        System.out.println(p);
        p.setComment(comment);
        p.processComment();
        p.validateComment();

        Comment c = p.getComment();
        ///  추가작업
    }
}
