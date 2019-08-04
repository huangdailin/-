package com.dailin.Strateg;

/**
 * 环境类：厨房
 *
 * @author huangdailin on 2019/8/4 15:20
 * @version 1.0
 */
public class Kitchen {
    //抽象策略
    private CrabCooking crabCooking;

    public void setCrabCooking(CrabCooking crabCooking) {
        this.crabCooking = crabCooking;
    }

    public CrabCooking getCrabCooking() {
        return crabCooking;
    }
    public void CookingMethod(){
        //做菜
        crabCooking.CookingMethod();
    }
}
