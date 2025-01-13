package com.workintech.pool;

public class Rectangle {
    private float width;
    private float length;

    public Rectangle(float width, float length){
        this.width = (width <0) ? 0 : width;
        this.length = (width <0) ? 0 : length;
    }
    public float getWidth(){
        return width;
    }
    public float getLength(){
        return length;
    }
    public float getArea(){
        return width*length;
    }
}
