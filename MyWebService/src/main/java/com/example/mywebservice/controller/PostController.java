package com.example.mywebservice.controller;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.entity.User;
import com.example.mywebservice.repository.PostRepository;
import com.example.mywebservice.repository.UserRepository;
import com.example.mywebservice.service.PostService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public String list(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Optional<User> user = userRepository.findByEmail(userDetails.getUsername());
        model.addAttribute("nickname", user.get().getNickname());
        System.out.println("user email: " + userDetails.getUsername());

        List<PostDto> postDtos = postService.getAllPosts();
        model.addAttribute("posts", postDtos);
        return "list";
    }

    // post form
    @GetMapping("/create")
    public String createForm(Authentication authentication, Model model) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Optional<User> user = userRepository.findByEmail(userDetails.getUsername());

        model.addAttribute("nickname", user.get().getNickname());
        model.addAttribute("post", new PostDto());
        return "create";
    }

    // post
    @PostMapping("/create")
    public String createPost(@ModelAttribute("postDto") PostDto postDto){
        postService.createPost(postDto);
        return "redirect:/posts";
    }

    // get detail
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Authentication authentication, Model model) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Optional<User> user = userRepository.findByEmail(userDetails.getUsername());

        PostDto postDto = postService.getPostById(id).orElseThrow(() -> new RuntimeException("not found id"));
        model.addAttribute("isMyPost", postService.isMyPost(id, user.get().getNickname()));
        model.addAttribute("post", postDto);
        return "detail";
    }

    //update form
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Authentication authentication, Model model) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Optional<User> user = userRepository.findByEmail(userDetails.getUsername());

        model.addAttribute("nickname", user.get().getNickname());
        PostDto postDto = postService.getPostById(id).orElseThrow(() -> new RuntimeException("not found id"));
        model.addAttribute("post", postDto);
        return "edit";
    }

    // update
    @PostMapping("/{id}/edit")
    public String editPost(@PathVariable Long id, @ModelAttribute("post") PostDto postDto) {
        postService.updatePost(id, postDto);
        return "redirect:/posts";
    }

    // delete
    @PostMapping("/{id}/delete")
    public String deletePost(@PathVariable Long id, Authentication authentication) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
}
