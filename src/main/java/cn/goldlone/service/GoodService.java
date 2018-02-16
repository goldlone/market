package cn.goldlone.service;

import cn.goldlone.mapper.GoodMapper;
import cn.goldlone.model.Good;
import cn.goldlone.model.Result;
import cn.goldlone.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CN on 2018/2/16.
 */
@Service
public class GoodService {
    @Autowired
    private GoodMapper gm;

    /**
     * 修改商品信息
     * @param good
     * @return
     */
    public Result insertGoodInfo(Good good) {
        Result res = null;
        if(gm.insertGoodInfo(good)>0) {
            res = ResultUtils.success("录入商品信息成功");
        } else {
            res = ResultUtils.error(ResultUtils.RESULT_NOT_FOUND, "录入失败，未知原因");
        }
        return res;
    }

    /**
     * 查询商品
     * @param no
     * @return
     */
    public Result selectGoodInfo(String no) {
        Result res = null;
        Good good = gm.selectGoodInfoByNo(no);
        if(good==null) {
            res = ResultUtils.error(ResultUtils.RESULT_NOT_FOUND, "未找到该商品，请先录入");
        } else {
            res = ResultUtils.success("查询成功", good);
        }
        return res;
    }

    /**
     * 修改商品信息
     * @param good
     * @return
     */
    public Result updateGoodInfo(Good good) {
        Result res = null;
        if(gm.updateGoodInfo(good)>0) {
            res = ResultUtils.success("修改成功");
        } else {
            res = ResultUtils.error(ResultUtils.RESULT_NOT_FOUND, "未找到该商品，请先录入");
        }
        return res;
    }

}
