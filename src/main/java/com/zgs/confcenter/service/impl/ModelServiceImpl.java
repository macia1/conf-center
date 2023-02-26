package com.zgs.confcenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgs.confcenter.model.Model;
import com.zgs.confcenter.service.ModelService;
import com.zgs.confcenter.mapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
* @author macia
* @description 针对表【cc_model】的数据库操作Service实现
* @createDate 2023-02-11 23:10:19
*/
@Service
public class ModelServiceImpl extends ServiceImpl<ModelMapper, Model>
    implements ModelService{

}




