package com.maple.smaple.model;

import lombok.*;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/4/13 23:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsEntity {
    private String goodId;
    private String goodName;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
}
