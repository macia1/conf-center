package com.zgs.confcenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgs.confcenter.model.Property;
import com.zgs.confcenter.service.PropertyService;
import com.zgs.confcenter.mapper.PropertyMapper;
import org.springframework.stereotype.Service;

/**
* @author macia
* @description 针对表【cc_property】的数据库操作Service实现
* @createDate 2023-02-11 23:10:19
*/
@Service
public class PropertyServiceImpl extends ServiceImpl<PropertyMapper, Property>
    implements PropertyService{

}




