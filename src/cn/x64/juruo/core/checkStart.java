package cn.x64.juruo.core;

import java.util.*;

/**
 * checkStart.java
 * Copyright (c) X64bbs JuRuo
 *
 * This file is the check function of project "isComputerStart"
 *
 * @author JuRuoqwq
 * */
public class checkStart {
    /**
     * Function isStart
     * This function can check the computer is or not starting
     * @author JuRuoqwq
     * */
    public static void isStart(){
        //启动状态
        final boolean check = true;
        if (check){
            //开机状态
            System.out.println("The computer is starting!");
        }else {
            //没有开机
            System.out.println("The computer isn't starting!");
        }
    }
}
