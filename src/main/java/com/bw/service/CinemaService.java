package com.bw.service;

import java.util.List;
import java.util.Map;

public interface CinemaService {

    List list(Map<String, Object> maps);

    void updateStatus(Integer id);

    void update(String photo);
}
