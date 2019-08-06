package com.dailin.command;

/**
 * 肠粉类
 *
 * @author huangdailin on 2019/7/31 16:20
 * @version 1.0
 */
public class ChangFen implements Breakfast {

    private ChangFenChef changFenChef;
    ChangFen(){
        changFenChef = new ChangFenChef();
    }
    @Override
    public void cooking() {
        changFenChef.cooking();
    }
}
