package org.example.blogplatforms.Post;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.example.blogplatforms.User.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    @Operation(summary = "Create a Post for a user")
    public Post createPost(@RequestParam String title, @RequestParam String content) {
        return postService.createPost(title, content);
    }

    @GetMapping("/user")
    @Operation(summary = "Get all posts in the system")
    public List<Post> getAllPosts() {
        return postService.findAllposts();
    }

    @GetMapping("/{postId}")
    @Operation(summary = "Get a post by its ID")
    public Post getPostById(@PathVariable Long postId) {
        return postService.findById(postId);
    }


    @PostMapping("/by-user")
    @Operation(summary = "Get All posts by user")
    public List<Post> getPostsByUser(@RequestBody User user) {
        return postService.findByUser(user);
    }

    @PutMapping("/{postId}")
    @Operation(summary = "Update a post")
    public Post updatePost(@PathVariable Long postId, @RequestBody PostDTO dto) {
        return postService.updatePost(postId, dto.getTitle(), dto.getContent());
    }

    @DeleteMapping("/{postId}")
    @Operation(summary = "Delete a post and its comments")
    public void deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
    }


}
