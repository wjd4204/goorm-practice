package com.example.reatapi_ex.mapper;

import org.mapstruct.Mapper;

import java.util.HashMap;

@Mapper
public interface ExMapper {

    HashMap<String, Object> findById(HashMap<String, Object> dto);
}
