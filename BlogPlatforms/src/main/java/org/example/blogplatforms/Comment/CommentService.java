package org.example.blogplatforms.Comment;

import io.swagger.v3.oas.annotations.Operation;
import org.example.blogplatforms.Post;
import org.example.blogplatforms.User.User;
import org.example.blogplatforms.UserProfile.UserProfile;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

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
