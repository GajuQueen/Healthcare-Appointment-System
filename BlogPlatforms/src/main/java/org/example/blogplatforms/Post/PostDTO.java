package org.example.blogplatforms.Post;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PostDTO {
    private String title;
    private String content;

}
