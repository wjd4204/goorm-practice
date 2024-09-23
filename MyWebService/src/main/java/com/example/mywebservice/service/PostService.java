package com.example.mywebservice.service;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.entity.Post;
import com.example.mywebservice.repository.PostRepository;
import com.example.mywebservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    // post
    public PostDto createPost(PostDto postDto) {
        Post post = new Post(postDto.getTitle(), postDto.getContent(), postDto.getAuthor());
        Post savePost = postRepository.save(post);

        return convertToDto(savePost);
    }

    // getList
    public List<PostDto> getAllPosts() {
        return postRepository.findAll().stream()
                .map(o -> convertToDto(o))
                .toList();
    }

    // getPost
    public Optional<PostDto> getPostById(Long id) {
        return postRepository.findById(id).map(o -> convertToDto(o));
    }

    // update
    public PostDto updatePost(Long id, PostDto postDto) {
        return postRepository.findById(id)
                .map(post -> {
                    post.update(postDto.getTitle(), postDto.getContent(), postDto.getAuthor());
                    return convertToDto(postRepository.save(post));
                })
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public boolean isMyPost(Long id, String currentUser) {
        Optional<Post> post = postRepository.findById(id);
        if((post.get().getAuthor()).equals(currentUser)) {
            return true;
        }
        return false;
    }

    private PostDto convertToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        postDto.setAuthor(post.getAuthor());
        return postDto;
    }
}
