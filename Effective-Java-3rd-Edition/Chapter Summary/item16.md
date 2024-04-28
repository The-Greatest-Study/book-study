### ITEM 16 - public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라

> public 클래스는 절대 가변 필드를 직접 노출해서는 안된다

### 필드를 노출시키면 안되는 이유
- 캡슐화의 이점을 제공하지 못한다
- API를 직접 수정하지 않고는 내부 표현을 바꿀 수 없다
- 불변성을 보장할 수 없다
- 외부에서 필드에 접근할 때 부수 작업을 수행할 수 없다

### 올바른 접근자 메서드 사용 예제
```java
class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
}
```