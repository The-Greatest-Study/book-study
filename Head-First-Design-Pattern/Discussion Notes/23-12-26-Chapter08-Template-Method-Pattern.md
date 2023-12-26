### 템플릿 메소드 패턴이란?
> 알고리즘의 각 단계를 정의하며 (전체적인 골격을 정의하며), 서브클래스에서 일부 단계를 구현할수 있도록 유도하는 패턴

##### 템플릿 메소드의 장점
- 템플릿 클래스에서 공통된 작업을 처리하여 재사용이 가능
- 수정 및 유지보수가 쉬움
- 서브 클래스가 늘어났을때 확장이 쉬움
- 템플릿 클래스에 복잡한 알고리즘이 구현되어 있어, 일부 구현만 서브클래스에 의존할 수 있음

##### 후크란?
> 추상 클래스에서 선언되지만, 기본적인 내용만 구현되어 있거나 아무 코드도 들어 있지 않은 메소드
> 
> Abstract로 정의할 경우 상속 받을때 필수적으로 구현해야 하는 문제가 있는 반면, 필수 구현 요소가 아닌 메소드는 후크로 정의하여, 서브클래스에서 오버라이드 할지 하지 않을지 결정할 수 있다.

### 템플릿 메소드 패턴 vs. 팩토리 메소드 패턴 vs. 전략 패턴

1. 템플릿 메소드 패턴: 다르게 구현이 필요한 행동들을 템플릿 클래스에 골격을 잡아놓고, **메서드를 어떻게 구현할지 서브클래스에서 직접 구현**
- 서브클래스의 전체 골격을 잡아놓는데에 초점이 맞춰져 있음

```java
public abstract class CaffeineBeverage {
	final void prepareRecipe() {  
	    boilWater();  
	    brew();  
	    pourInCup();   
		addCondiments(); 
	}
}

public class Tea extends CaffeineBeverage {  
  
    @Override  
    public void brew() {  
        System.out.println("찻잎을 우려내는 중");  
    }  
  
    @Override  
    public void addCondiments() {  
        System.out.println("레몬을 추가하는 중");  
    }   
}

public class Coffee extends CaffeineBeverage {  
  
    @Override  
	public void brew() {  
	    System.out.println("필터로 커피를 우려내는 중");  
	}  
	  
	@Override  
	public void addCondiments() {  
	    System.out.println("설탕과 우유를 추가하는 중");  
	}
}
```

2. 전략 패턴: 다르게 구현이 필요한 행동들을 각각 캡슐화 하여 구현하고, **어떤 메서드를 사용할지 서브클래스에서 결정**
- 각각의 필요한 메소드들의 구현을 개별 파일로 분리하고 재사용하는데 초점이 맞춰져 있음

```java
public abstract class CaffeineBeverage {
	BrewBehavior brewBehavior;
	
	final void prepareRecipe() {  
	    boilWater();  
	    brewBehavior.brew();  
	    pourInCup();   
		addCondiments(); 
	}
}

public class BrewTea implements BrewBehavior {
	@Override
	public void brew() {
		System.out.println("찻잎을 우려내는 중");
	}
}

public class BrewCoffee implements BrewBehavior {
	@Override
	public void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}
}

public class Tea extends CaffeineBeverage {
	public Tea() {
		this.brewBehavior = new BrewTea();
	}
}

public class Coffee extends CaffeineBeverage {
	public Coffee() {
		this.brewBehavior = new BrewCoffee();
	}
}

```

3. 팩토리 메소드 패턴: 템플릿, 전략 패턴과는 다르게 행동 (behavioral) 중심이 아닌 생성 (creational) 중심의 디자인 패턴이다


### 이번 챕터에서 배운것들
##### Interface 대신 Abstract를 쓰는 이유?
1. Abstract는 클래스 내에 일부 특정 메소드만 override 할수있도록 정의할수 있다  
	1. 공통적으로 구현되는 메소드는 abstract class 내에서 구현할 수 있다  
2. private 또는 protected class를 사용할 수 있다  
3. 필요시, abstract method가 interface를 implement 받는 형태로도 사용할 수 있다  
4. class 내에서 non-static한 멤버 변수를 사용할 수 있다 (실제 객체화 가능)

##### Template Method에서 public/private 과 같은 키워들를 사용하지 않는 이유
public, private, protected 가 붙어있지 않으면 default로 package 설정이 적용됨  
--> 같은 패키지 내에서만 참조를 가능하게 해서 상속을 받을수 있게 하기 위해서?

##### Abstract Method를 상속받을 때 `@Override` Annotation을 꼭 넣어야 할까?
참고 : https://stackoverflow.com/questions/1005898/should-i-add-an-override-annotation-when-implementing-abstract-methods-in-java

Abstract Method를 상속받을때 `@Override`를 따로 붙혀주지 않아도 에러가 나지 않고, 실제로 오버라이딩도 잘 되는것을 볼수 있다 (책에서도 이렇게 사용하고 있음) -- 그렇다면 저 Annotation의 역할은 무엇일까?

실제로 동작에는 아무런 문제가 없지만, 만약 상속 받고 있는 Superclass에서 해당 메서드가 변경되거나 삭제되었을 경우, `@Override`를 붙인 Subclass의 메서드는 컴파일 시 에러가 발생하기 때문에, 변경사항에 발견하고 수정하는데에 용이하다. 그러므로 꼭 Superclass의 형상을 따라야 한다면 Annotation을 붙혀주는것을 추천!

