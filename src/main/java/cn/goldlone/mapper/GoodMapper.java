package cn.goldlone.mapper;

import cn.goldlone.model.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by CN on 2018/2/16.
 */
@Mapper
public interface GoodMapper {
    // 查询商品信息
    @Select("SELECT * FROM Good WHERE no=#{no};")
    public Good selectGoodInfoByNo(String no);

    // 插入商品信息
    @Insert("INSERT INTO Good VALUES (#{no}, #{name}, #{price}, now());")
    public Integer insertGoodInfo(Good good);

    // 更新商品信息
    @Update("UPDATE Good SET name=#{name}, price=#{price}, time=now() WHERE no=#{no};")
    public Integer updateGoodInfo(Good good);
}
