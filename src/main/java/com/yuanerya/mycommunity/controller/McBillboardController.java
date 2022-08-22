package com.yuanerya.mycommunity.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yuanerya.mycommunity.common.api.ApiResult;
import com.yuanerya.mycommunity.model.entity.McBillboard;
import com.yuanerya.mycommunity.service.IMcBillboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/billboard")
public class McBillboardController extends BaseController{
    @Resource
    private IMcBillboardService mcBillboardService;
    @GetMapping("/show")
    public ApiResult<McBillboard> getNotices(){
        List<McBillboard> list=mcBillboardService.list(
                new LambdaQueryWrapper<McBillboard>().eq(McBillboard::isShow,true));
        return ApiResult.success(list.get(list.size()-1));
    }
}
