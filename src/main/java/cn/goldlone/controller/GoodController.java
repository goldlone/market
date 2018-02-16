package cn.goldlone.controller;

import cn.goldlone.model.Good;
import cn.goldlone.model.Result;
import cn.goldlone.service.GoodService;
import cn.goldlone.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CN on 2018/2/16.
 */
@RestController
public class GoodController {
    @Autowired
    private GoodService gs;

    @PostMapping("/good/select")
    public Result selectGoodInfo(String no) {
//        System.out.println(no);
        return gs.selectGoodInfo(no);
    }

    @PostMapping("/good/insert")
    public Result insertOrUpdateGoodInfo(Good good) {
        if(gs.selectGoodInfo(good.getNo()).getCode() == ResultUtils.RESULT_NOT_FOUND) {
            return gs.insertGoodInfo(good);
        } else {
            return gs.updateGoodInfo(good);
        }
    }

}
