package com.glyxybxhtxt.service.impl;

import com.glyxybxhtxt.dao.JdrMapper;
import com.glyxybxhtxt.dao.ShyMapper;
import com.glyxybxhtxt.dataObject.Jdr;
import com.glyxybxhtxt.dataObject.Shy;
import com.glyxybxhtxt.service.SfService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @Author lrt
 * @Date 2020/12/24 13:51
 * @Version 1.0
 **/
@org.springframework.stereotype.Service
public class SfServiceImpl implements SfService {
    @Resource
    private ShyMapper mapper;
    @Resource
    private JdrMapper mapper2;

    @Override
    public int getsf(String ybid) {
        Shy s = mapper.selectByPrimaryKey(ybid);
        Jdr j = mapper2.selectByPrimaryKey(ybid);
        if(s!=null){
            if(s.getGh()!=null)return 3;
        }else if(j!=null){
            if(j.getGh()!=null)return 2;
        }
        return 1;
    }
}
