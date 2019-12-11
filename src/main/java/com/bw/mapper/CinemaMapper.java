package com.bw.mapper;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface CinemaMapper {

    List list(Map map);

    void updateStatus(Integer id);

    void update(String photo);
}
