package com.cxhello.hero.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxhello.hero.entity.LuckDraw;

import java.util.List;

/**
 * @author cxhello
 * @date 2021/5/31
 */
public interface LuckDrawService extends IService<LuckDraw> {

    List<LuckDraw> selectByCondition(Integer isDelete);

}
