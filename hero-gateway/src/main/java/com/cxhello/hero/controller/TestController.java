package com.cxhello.hero.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cxhello.hero.entity.LuckDraw;
import com.cxhello.hero.service.LuckDrawService;
import com.cxhello.hero.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cxhello
 * @date 2021/5/31
 */
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private LuckDrawService luckDrawService;

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping(value = "/list")
    public List<LuckDraw> list() {
        return luckDrawService.list();
    }

    @RequestMapping(value = "/selectByCondition")
    public List<LuckDraw> selectByCondition(Integer isDelete) {
        logger.info("条件查询入参: {}", isDelete);
        return luckDrawService.selectByCondition(isDelete);
    }

    @RequestMapping(value = "/page")
    public Page<LuckDraw> page() {
        return luckDrawService.page(new Page<>(1, 10));
    }

    @RequestMapping(value = "/testRedis")
    public String testRedis() {
        redisUtils.set("smoke", "success");
        return "success";
    }

}
