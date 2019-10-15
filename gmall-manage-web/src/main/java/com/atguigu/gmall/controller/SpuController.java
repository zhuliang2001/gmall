package com.atguigu.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("fileUpload")
    @ResponseBody
    public  String fileUpload(@RequestParam("file")MultipartFile multipartFile){
String imgUrl="http://img.mp.sohu.com/upload/20180627/79565e48be0e43eea6e6c1a8965d5d43.jpg";
return imgUrl;
    }
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public  String saveSpuInfo(@RequestParam PmsProductInfo pmsProductInfo){
      return "success";
    }
    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo>spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos=spuService.spuList(catalog3Id);
        return  pmsProductInfos;
    }

}
