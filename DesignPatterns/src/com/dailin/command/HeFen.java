package com.dailin.command;

/**
 * 河粉类
 *
 * @author huangdailin on 2019/7/31 16:22
 * @version 1.0
 */
public class HeFen implements Breakfast {
    private HeFenChef heFenChef;
    HeFen(){
        heFenChef = new HeFenChef();
    }

    @Override
    public void cooking() {
        heFenChef.cooking();
    }
}
