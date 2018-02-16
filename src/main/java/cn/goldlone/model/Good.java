package cn.goldlone.model;

import java.sql.Timestamp;

/**
 * Created by CN on 2018/2/16.
 */
public class Good {
    // 商品编号
    private String no;
    // 商品名
    private String name;
    // 商品价格
    private float price;
    // 添加或修改时间
    private Timestamp time;

    public Good() {
    }

    public Good(String no, String name, float price) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.time = new Timestamp(System.currentTimeMillis());
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Good{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
