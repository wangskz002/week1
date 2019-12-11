package com.bw.service;

import com.bw.mapper.CinemaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Resource
    private CinemaMapper cm;


    @Override
    public List list(Map map) {
        return cm.list(map);
    }

    @Override
    public void updateStatus(Integer id) {
        cm.updateStatus(id);
    }

    @Override
    public void update(String photo) {
        cm.update(photo);
    }
}
