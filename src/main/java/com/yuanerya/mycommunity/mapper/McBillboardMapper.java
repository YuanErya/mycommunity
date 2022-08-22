package com.yuanerya.mycommunity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuanerya.mycommunity.model.entity.McBillboard;
import org.springframework.stereotype.Repository;


//继承于BaseMapper，基础的增删改查用他所携带的方法即可
@Repository
public interface McBillboardMapper extends BaseMapper<McBillboard> {
}
