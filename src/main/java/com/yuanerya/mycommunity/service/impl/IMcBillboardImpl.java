package com.yuanerya.mycommunity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanerya.mycommunity.mapper.McBillboardMapper;
import com.yuanerya.mycommunity.model.entity.McBillboard;
import com.yuanerya.mycommunity.service.IMcBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IMcBillboardImpl extends ServiceImpl <McBillboardMapper,McBillboard>
        implements IMcBillboardService {
}
