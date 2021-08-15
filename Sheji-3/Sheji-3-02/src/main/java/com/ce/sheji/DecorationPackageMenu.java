package com.ce.sheji;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author c__e
 * @date 2021/8/15 17:26
 */
public class DecorationPackageMenu implements IMenu {
    /**
     * 装修清单
     */
    private List<Matter> list = new ArrayList<>();
    /**
     * 装修价格
     */
    private BigDecimal price = BigDecimal.ZERO;
    /**
     * 面积
     */
    private BigDecimal area;
    /**
     * 装修等级；豪华欧式、轻奢田园、现代简约
     */
    private String grade;

    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, RoundingMode.HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");
        list.forEach(matter ->
                detail.append(matter.scene())
                        .append("：")
                        .append(matter.brand())
                        .append("、")
                        .append(matter.model())
                        .append("、平米价格：")
                        .append(matter.price())
                        .append(" 元。\n"));
        return detail.toString();
    }
}
