package com.bw.controller;

import com.bw.service.CinemaService;
import com.bw.utils.FileUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CinemaController {

    @Resource
    private CinemaService cs;

    @RequestMapping("list.do")
    public String list(Model model, @RequestParam(defaultValue = "1")Integer pageNum){
        Map<String,Object> maps = new HashMap<String, Object>();
        PageHelper.startPage(pageNum,2);
        List list = cs.list(maps);
        PageInfo page = new PageInfo(list);
        model.addAttribute("page",page);
        return "list";
    }

    @RequestMapping("updateStatus.do")
    public  String updateStatus(Integer id){
        cs.updateStatus(id);
        return "redirect:list.do";
    }

    @RequestMapping("update.do")
    public  String update(MultipartFile photo) throws IOException {
        System.out.println(photo);
        String upload = FileUtils.upload(photo);
        cs.update(upload);
        return "redirect:list.do";
    }

    @RequestMapping("looking.do")
    public void looking(String path, HttpServletRequest request,
                          HttpServletResponse response){
        FileUtils.lookImg(path, request, response);
    }
}
