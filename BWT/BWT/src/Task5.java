public class Task5 {
    public static void main(String[] args) {
        Vector vec1 = new Vector(3, 5);
        Vector vec2 = new Vector(8, 7);
        System.out.println("Сума:");
        Vector.show(Vector.sumVector(vec1, vec2));
        System.out.println("Віднімання векторів:");
        Vector.show(Vector.subVector(vec2, vec1));
        System.out.println("Множення вектора на число");
        Vector.show(Vector.multVector(vec1, 5));
        System.out.println("Вивести вектор1:");
        Vector.show(vec1);
    }
}

class Vector {

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Vector sumVector(Vector a, Vector b){
        Vector c = new Vector(0,0);
        c.x = a.getX()+ b.getX();
        c.y = a.getY()+b.getY();
        return c;
    }

    public static Vector subVector(Vector a, Vector b){
        Vector c = new Vector(0,0);
        c.x = a.getX() - b.getX();
        c.y = a.getY() - b.getY();
        return c;
    }

    public static Vector multVector(Vector a, int b){
        Vector c = new Vector(0,0);
        c.x = a.getX() * b;
        c.y = a.getY() * b;
        return c;
    }

    public static void show(Vector c){
        System.out.println("x = "+ c.getX()+" "+"y = "+ c.getY());
    }
}