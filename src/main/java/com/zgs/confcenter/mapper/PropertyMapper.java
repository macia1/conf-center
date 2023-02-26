package com.zgs.confcenter.mapper;

import com.zgs.confcenter.model.Property;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author macia
* @description 针对表【cc_property】的数据库操作Mapper
* @createDate 2023-02-11 23:10:19
* @Entity com.zgs.confcenter.model.Property
*/
@Mapper
public interface PropertyMapper extends BaseMapper<Property> {

}




