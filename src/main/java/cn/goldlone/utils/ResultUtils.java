package cn.goldlone.utils;

import cn.goldlone.model.Result;

/**
 * Created by CN on 2018/2/16.
 */
public class ResultUtils {
    // 成功
    public static final int RESULT_SUCCESS = 1001;
    // 未找到该商品
    public static final int RESULT_NOT_FOUND = 2001;



    public static Result success(String msg, Object data) {
        return new Result(RESULT_SUCCESS, msg, data);
    }

    public static Result success(String msg) {
        return new Result(RESULT_SUCCESS, msg, null);
    }

    public static Result error(int code, String msg) {
        return new Result(code, msg, null);
    }

}
