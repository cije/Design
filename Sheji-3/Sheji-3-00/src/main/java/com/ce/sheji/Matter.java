package com.ce.sheji;

import java.math.BigDecimal;

/**
 * 物料接口
 * 物料接口提供了基本的信息，以保证所有的装修材料都可以按照统一标准进行获取
 *
 * @author c__e
 * @date 2021/8/15 16:06
 */
public interface Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 价格
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();
}
