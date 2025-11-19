class PaintBrush {
    String color;
    int size;
    PaintBrush(String color, int size) {
        this.color = color;
        this.size = size;
    }
    void paint() {
        System.out.println("Color:"+color+"Size:"+size);
    }
    void changecolor(String newColor) {
        color = newColor;
        System.out.println("Color changed to "+color);
    }
}

public class obj1 {
    public static void main(String[] args) {
        PaintBrush x = new PaintBrush("Red ",5);
        x.paint();
        x.changecolor("Blue ");
        x.paint();
    }
}
