package com.cloud.comment.service;

import com.cloud.comment.entity.Comment;
import com.cloud.comment.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public Comment findById(Integer id){
        return commentMapper.findById(id);
    }

    public List<Comment> findAll(){return commentMapper.findAll();}

    public Integer addComment(Comment comment){
        return commentMapper.addComment(comment);
    }

    public Integer updateComment(Comment comment){
        return commentMapper.updateComment(comment);
    }

    public Integer deleteComment(Integer id){
        return commentMapper.deleteComment(id);
    }
}
