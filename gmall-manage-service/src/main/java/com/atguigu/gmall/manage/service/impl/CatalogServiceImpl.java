package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.service.CatalogService;

import java.util.List;

@Service
class CatalogServiceImpl implements CatalogService {




    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return null;
    }

    @Override
    public List <PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        return null;
    }

    @Override
    public List <PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return null;
    }
}
