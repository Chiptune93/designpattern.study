# 싱글턴 패턴
> 클래스 인스턴스를 하나만 만들고, 그 인스턴스로의 전역 접근을 제공한다.
> - 반드시 인스턴스가 필요하면 관리하는 그 클래스를 거쳐야함
> - 인스턴스는 전역으로 접근 가능해야함

Kotlin 에서는 object 를 확용하여 싱글턴을 간단하게 만들 수 있음

## java static vs Kotlin object
- 자바에서 싱글톤 패턴을 구현하기 위해서는 많은 보일러 플레이트 코드가 필요
- kotlin 에서는 object 라는 키워드로 간편하게 싱글톤 패턴을 수현

### 인스턴스 생성 시점
- 자바는 호출되는 시점에서 인스턴스가 생성
- 코틀린은 프로세스가 메모리 상에 올라갈 때 바로 생성



> 코틀린에서는 object 와 companion object 로 싱글톤 패턴을 구현 할 수 있다.
> 차이

<pre><code>
object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {
        // ...
    }

    val allDataProviders: Collection<DataProvider>
        get() = // ...
}
</code></pre>

<pre><code>
class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}
}</code></pre>

### object declaration
- object 는 thread-safe 가 됨
- 실제로 사용될 때 초기화 됨
- object 내부에 선언된 변수와 함수들은 java 의 static 이 아님

### companion object 
- 클래스가 로드 될 때 초기화 됨
- 해당 클래스(companion obejct 는 클래스 내부에 들어가는 블럭이므로) 자체가 static 이 아님
  즉, CompanionObjectTest() 로 생성할 때 마다 객체의 주소값은 다름
- ompanion object 내부에 선언된 변수와 함수들은 java 의 static 이 아님

### 공통
- const val로 선언된 상수는 static 변수
- object 내부에 선언된 변수와 함수들은 java 의 static 이 아님
- 아래 케이스들은 static
  - const val 로 상수 선언한 것들
  - @JVMStatic 또는 @JVMField의 어노테이션이 붙은 변수 및 함수들

### 차이점
- object declaration 초기화 시점 -> 실제로 사용될 때 initialized 된다. 실제로 내부 함수를 접근해야 init 블럭이 호출됨
  - i.e. ObjectTest.nonStaticFun() 을 호출할 때 초기화
- companion object 초기화 시점 -> 해당 클래스가 로드될 때 initialized 된다. 실제로 해당 클래스 (CompanionObjectTest)를 생성하면 companion object 내부 init 블럭이 호출됨을 확인
  - i.e. val test =  CompanionObjectTest() 시 초기화

> 여기 잘 정리되어 있다. https://nuritech.tistory.com/18