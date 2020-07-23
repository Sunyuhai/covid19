package cn.itcast.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author itcast
 * Date 2020/5/27 21:31
 * Desc 用来封装防疫物资的JavaBean
 */

public class MateriaBean {
    private String name;//物资名称
    private String from;//物质来源
    private Integer count;//物资数量

    @Override
    public String toString() {
        return "MateriaBean{" +
                "name='" + name + '\'' +
                ", from='" + from + '\'' +
                ", count=" + count +
                '}';
    }

    public MateriaBean() { }

    public MateriaBean(String name, String from, Integer count) {
        this.name = name;
        this.from = from;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
