package br.com.posts.endpoint.service;

import br.com.posts.endpoint.entity.Post;
import br.com.posts.endpoint.enums.PostStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostServiceTest {

    @Autowired
    PostService postService;

    @Test
    public void savePostTest() {



    }

    private Post createPost() {
        Post post = new Post();
        post.setId(1l);
        post.setStatus(PostStatusEnum.ACTIVE);
        post.setTitle("Test title");
        post.setDescription("Test Description");
        post.setDateInsert(LocalDateTime.now());
        return post;
    }

}
