package com.dailin.Strateg;

/**
 * 简单描述
 *
 * @author huangdailin on 2019/8/4 15:22
 * @version 1.0
 */
public class CrabCookingStrategy {
    public static void main(String[] args) {
        //厨房
        Kitchen kitchen = new Kitchen();
        //清蒸大闸蟹
        CrabCooking qz = new SteamedCrabs();
        //红烧大闸蟹
        CrabCooking hs = new BraisedCrabs();
        kitchen.setCrabCooking(qz);
        kitchen.CookingMethod();
        System.out.println("-----------------");
        kitchen.setCrabCooking(hs);
        kitchen.CookingMethod();
    }
}
