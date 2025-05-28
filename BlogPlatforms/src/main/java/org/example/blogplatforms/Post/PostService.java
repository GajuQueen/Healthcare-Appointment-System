package org.example.blogplatforms.Post;

import lombok.RequiredArgsConstructor;
import org.example.blogplatforms.User.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private PostRepository postRepository;

    public Post createPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return postRepository.save(post);
    }

    public List<Post> findByUser(User user) {
        return postRepository.findByUser(user);
    }

    public List<Post> findAllposts() {
        return postRepository.findAll();
    }

    public Post findById(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }

    public void deletePost(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        postRepository.delete(post);
    }

    public Post updatePost(Long postId, String newTitle, String newContent) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        post.setTitle(newTitle);
        post.setContent(newContent);

        return postRepository.save(post);

    }
}
