/**
 * Main.java
 * Copyright (c) X64bbs JuRuo
 *
 * This file is the main file of project "isComputerStart"
 *
 * @author JuRuoqwq
 * */

import cn.x64.juruo.loadCheckFunction;
import cn.x64.juruo.core.checkStart;
import cn.x64.juruo.core.calculateRunTime;
public class Main {
    public static void main(String[] args) {
        loadCheckFunction.printMessage();
        checkStart.isStart();
        calculateRunTime.calculateTime();
    }
}