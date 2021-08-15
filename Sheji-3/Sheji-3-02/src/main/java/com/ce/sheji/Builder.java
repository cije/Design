package com.ce.sheji;

import com.ce.sheji.ceilling.LevelOneCeiling;
import com.ce.sheji.ceilling.LevelTwoCeiling;
import com.ce.sheji.coat.DuluxCoat;
import com.ce.sheji.coat.LiBangCoat;
import com.ce.sheji.floor.ShengXiangFloor;
import com.ce.sheji.tile.DongPengTile;
import com.ce.sheji.tile.MarcoPoloTile;

/**
 * @author c__e
 * @date 2021/8/15 17:31
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                // 吊顶，二级顶
                .appendCeiling(new LevelTwoCeiling())
                // 涂料，多乐士
                .appendCoat(new DuluxCoat())
                // 地板，圣象
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                // 吊顶，二级顶
                .appendCeiling(new LevelTwoCeiling())
                // 涂料，立邦
                .appendCoat(new LiBangCoat())
                // 地砖，马可波罗
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                // 吊顶，二级顶
                .appendCeiling(new LevelOneCeiling())
                // 涂料，立邦
                .appendCoat(new LiBangCoat())
                // 地砖，东鹏
                .appendTile(new DongPengTile());
    }

}
