package com.dailin.command;

/**
 * 命令
 *
 * @author huangdailin on 2019/7/31 16:38
 * @version 1.0
 */
public class CookingCommand {

    public static void main(String[] args) {
        Breakfast food1 = new ChangFen();
        Breakfast food2 = new HunTun();
        Breakfast food3 = new HeFen();
        Waiter waiter = new Waiter();
        waiter.setChangfen(food1);//设置肠粉菜单
        waiter.setHuntun(food2);//设置河粉菜单
        waiter.setHefen(food3);//设置馄饨菜单

        waiter.chooseChangFen();//选择肠粉
        waiter.chooseHunTun();//选择馄饨
        waiter.chooseHeFen();//选择河粉
    }
}
