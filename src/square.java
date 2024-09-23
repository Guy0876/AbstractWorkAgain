public class square extends shape{

    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public square(float side) {
        this.side = side;
    }

    @Override
    float calculateArea() {
        return getSide()*getSide();
    }

    @Override
    float calculatePerimiter() {
        return getSide()*4;
    }
}
