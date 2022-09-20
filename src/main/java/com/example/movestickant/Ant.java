package com.example.movestickant;

import java.util.Objects;

public class Ant {
    private Integer id;
    private Double speed;
    private Double position;

    //爬行操作，返回爬行后的位置
    public Double creep(double time){
        this.position = this.position + time * speed;
        return this.position;
    }

    //改变方向
    public void changeDirection(){
        speed *= -1;
    }

    //碰撞检测
    public void collideDetect(Ant[] ant){
        for(int i = 0; i<ant.length && !Objects.equals(this.id, ant[i].id); i++){
            if(Math.abs(this.position - ant[i].position) < 1){
                this.changeDirection();
                ant[i].changeDirection();
            }
        }
    }


    public Ant(Integer id, Double speed, Double position) {
        this.id = id;
        this.speed = speed;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }
}
