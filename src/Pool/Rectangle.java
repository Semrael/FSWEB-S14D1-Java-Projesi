package Pool;

public class Rectangle
{
    private int width;
    private int length;

    public Rectangle(int width,int length) {
            this.length= Math.max(length, 0);
            this.width= Math.max(width, 0);

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return this.width*this.length;
    }
}
