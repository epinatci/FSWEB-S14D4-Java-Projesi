package com.workintech.store.main;

import com.workintech.store.rpg.Monster;
import com.workintech.store.rpg.Spider;
import com.workintech.store.rpg.Troll;
import com.workintech.store.rpg.WareWolf;

public class MonsterMain {
    public static void main(String[] args) {
        Monster troll = new Troll("Shrek", 1000,40);
        System.out.println(troll.attack());

        Monster warewolf = new WareWolf("X",700, 90);
        System.out.println(warewolf.attack());

        Monster spider = new Spider("SHelob", 400, 50);
        System.out.println(spider.attack());

    }
}
