package com.example.reatapi_ex.controller;

import com.example.reatapi_ex.dto.ItemDto;
import com.example.reatapi_ex.dto.ResponseDto;
import com.example.reatapi_ex.dto.User;
import com.example.reatapi_ex.service.RestExService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RestExController {

    private final RestExService restExService;

    @GetMapping("/test")
    public String test() {
        return "{test}";
    }

    @GetMapping("/test2")
    public String test2(){
        log.info("test2");
        return "test2";
    }

    @GetMapping("/param")
    public String testRequestParam(@RequestParam String name){
        log.info("RequestParam: " + name);
        return "hello, " + name + "!";
    }

    @GetMapping("/path/{name}")
    public String testPathVariable(@PathVariable String name){
        log.info("Pathvariable: " + name);
        return "Path Variable: " + name;
    }

    @PostMapping("/body")
    public String testRequestBody(@RequestBody User user){
        log.info("RequestBody: " + user);
        return "RequestBody: " + user;
    }

    @PostMapping("/item")
    public ResponseDto testRequestBody(@RequestBody ItemDto dto){
        log.info("RequestBody: " + dto);

        boolean b = restExService.registerItem(dto);
        if(b) {
            ResponseDto responseDto = new ResponseDto();
            responseDto.setMessage(dto.getName());
        }

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("fail");
        return responseDto;
    }
}
