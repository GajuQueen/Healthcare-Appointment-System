package org.example.blogplatforms.Comment;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping
    @Operation(summary = "Add a comment to a Post")
    public Comment addcomment(@RequestBody Comment comment) {
        return commentService.addcomment(comment);
    }

    @GetMapping
    @Operation
    public List<Comment> getallcomments(@RequestBody Comment comment) {
        return commentService.getallcomments();
    }

}
