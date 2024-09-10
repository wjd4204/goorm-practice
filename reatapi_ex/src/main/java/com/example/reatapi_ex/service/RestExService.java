package com.example.reatapi_ex.service;

import com.example.reatapi_ex.dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RestExService {

    public boolean registerItem(ItemDto itemDto) {

        log.info("service: loading..");

        // db insert가 성공했을 때 true 반환
        return true;
    }
}
