package org.example;

import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;
    final private CommentRepository commentRepository;

    public CommentProcessor(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment() {

    }

    public void validateComment() {

    }
}
