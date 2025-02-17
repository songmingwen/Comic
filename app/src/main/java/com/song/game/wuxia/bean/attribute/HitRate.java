package com.song.game.wuxia.bean.attribute;

import android.util.Log;

import com.song.game.wuxia.bean.character.Character;
import com.song.game.wuxia.bean.condition.Condition;

/**
 * Desc:    命中率
 * Author:  songmingwen
 * Email:   mingwen@mgtv.com
 * Time:    2021/9/15 17:45
 */
public class HitRate implements Attribute {

    @Override
    public float getAttribute(Character character) {
        float rate = 0;
        rate += character.ability.hitRate;
        if (character.equipment.weapon != null) {
            rate += character.equipment.weapon.hitRate;
        }
        if (character.talent != null) {
            rate += character.talent.hitRateIncrease;
        }
        if (character.condition != null && !character.condition.isEmpty()) {
            for (Condition condition : character.condition) {
                rate += condition.hitRateIncrease;
            }
        }
        Log.i("wuxia_attr"+this.getClass().getSimpleName(), "value = " + rate);
        return rate;
    }

}
