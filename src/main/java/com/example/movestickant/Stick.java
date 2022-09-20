package com.example.movestickant;

import java.util.List;

public class Stick {
    private Double length;

    //检测蚂蚁是否爬出棍子
    public List<Boolean> isOut(Ant[] ant){
        List<Boolean> result = null;
        for (Ant value : ant) {
            if (value.getPosition() > length || value.getPosition() < 0) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public Stick(Double length) {
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}