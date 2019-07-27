package com.cloud.comment.controller;

import com.cloud.comment.entity.Comment;
import com.cloud.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/findComment")
    public Comment findById(@RequestParam Integer id){
        return commentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Comment> findAll(){
        return commentService.findAll();
    }

    @PostMapping("/addComment")
    public Integer addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }

    @PutMapping("/updateComment")
    public Integer updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/deleteComment")
    public Integer deleteComment(@RequestParam Integer id){
        return commentService.deleteComment(id);
    }
}
