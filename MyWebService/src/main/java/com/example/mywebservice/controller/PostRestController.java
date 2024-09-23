package com.example.mywebservice.controller;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostRestController {

    @Autowired
    private PostService postService;

    @GetMapping("/api/posts")
    public List<PostDto> getPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/api/posts/{id}")
    public PostDto getPostById(@PathVariable Long id){
        PostDto postDto = postService.getPostById(id).orElseThrow(() -> new RuntimeException("not found id"));

        return postDto;
    }

    @PostMapping("/api/posts")
    public PostDto createPost(@RequestBody PostDto postDto){
        return postService.createPost(postDto);
    }

    @PutMapping("/api/posts/{id}")
    public PostDto updatePost(@PathVariable Long id, @RequestBody PostDto postDto){
        return postService.updatePost(id, postDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public String deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return "Delete Success!";
    }
}
