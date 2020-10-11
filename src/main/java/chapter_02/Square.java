package chapter_02;

public class Square {
    private int height;
    private int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return height * width;
    }
}
