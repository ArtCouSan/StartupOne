package br.com.posts.endpoint.dto;

import br.com.posts.endpoint.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostAlterDTO {

    private String title;
    private String description;

    public Post parsePostDTO() {
        Post post = new Post();
        post.setTitle(this.title);
        post.setDescription(this.description);
        return post;
    }

}
