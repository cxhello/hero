package com.cxhello.hero.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxhello.hero.entity.LuckDraw;
import com.cxhello.hero.mapper.LuckDrawMapper;
import com.cxhello.hero.service.LuckDrawService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cxhello
 * @date 2021/5/31
 */
@Service
public class LuckDrawServiceImpl extends ServiceImpl<LuckDrawMapper, LuckDraw> implements LuckDrawService {

    @Override
    public List<LuckDraw> selectByCondition(Integer isDelete) {
        return baseMapper.selectByCondition(isDelete);
    }

}
