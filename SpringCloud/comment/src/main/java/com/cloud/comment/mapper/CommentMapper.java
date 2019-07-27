package com.cloud.comment.mapper;

import com.cloud.comment.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    Comment findById(Integer id);
    List<Comment> findAll();
    Integer addComment(Comment user);
    Integer updateComment(Comment user);
    Integer deleteComment(Integer id);
}
