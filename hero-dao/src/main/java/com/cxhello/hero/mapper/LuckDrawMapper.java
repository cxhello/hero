package com.cxhello.hero.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxhello.hero.entity.LuckDraw;

import java.util.List;

/**
 * @author cxhello
 * @date 2021/5/31
 */
public interface LuckDrawMapper extends BaseMapper<LuckDraw> {

    List<LuckDraw> selectByCondition(Integer isDelete);

}
