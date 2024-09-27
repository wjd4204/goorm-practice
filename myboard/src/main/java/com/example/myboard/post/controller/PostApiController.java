package com.example.myboard.post.controller;

import com.example.myboard.post.model.PostRequest;
import com.example.myboard.post.model.PostResponse;
import com.example.myboard.post.model.PostViewRequest;
import com.example.myboard.post.model.PostViewResponse;
import com.example.myboard.post.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;

    @PostMapping
    public PostResponse create(
            @Valid @RequestBody PostRequest postRequest
            ){
        return postService.create(postRequest);
    }

    @PostMapping("/view")
    public PostViewResponse view(
            @Valid @RequestBody PostViewRequest postViewRequest
            ){
        return postService.view(postViewRequest);
    }
}
