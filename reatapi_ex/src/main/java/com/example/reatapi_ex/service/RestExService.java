package com.example.reatapi_ex.service;

import com.example.reatapi_ex.dto.ItemDto;
import com.example.reatapi_ex.mapper.ExMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
@Slf4j
public class RestExService {

    private final ExMapper exMapper;

    public boolean registerItem(ItemDto itemDto) {

        log.info("service: loading..");

        // db insert가 성공했을 때 true 반환
        return true;
    }

//    public ItemDto getItem(String id){
//        HashMap<String, Object> map = new HashMap<>();
//
//    }
}
