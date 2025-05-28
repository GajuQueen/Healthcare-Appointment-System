package org.example.blogplatforms.Comment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

private CommentRepository commentRepository;
  public CommentService(CommentRepository commentRepository) {
     this.commentRepository = commentRepository;
}

    public Comment addcomment(Comment comment){
      return commentRepository.save(comment);
}

public List<Comment> getallcomments(){
      return commentRepository.findAll();
}
}
