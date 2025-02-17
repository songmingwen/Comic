package com.song.sunset.design.creational.factory.abs;

import com.song.sunset.design.creational.factory.color.Color;
import com.song.sunset.design.creational.factory.shape.Shape;

/**
 * Desc:
 * Author:  songmingwen
 * Email:   mingwen@mgtv.com
 * Time:    2021/5/7 15:13
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);

}
