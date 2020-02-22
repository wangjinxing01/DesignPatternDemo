# 1. SingleTon模式
> ## 构造函数必须为私有
> 构造函数私有化，是为了避免在外部直接调用构造函数，从而避免产生多个实例。
> ## getInstance和instance须为static
> 因为需要通过类名称（而不是类实例）调用getInstance方法，所以该方法必须是static的。  
> 因为getInstance是static的，所以起调用的该类的成员变量instance，必须是static的。
> ## 两种实例化方案
> SingleTon模式有两种实现方案：
> - 进程初始化时进行实例化：
>> `public static SingleTon instance = new SingleTon();`
> - 第一次使用时进行实例化:
 ``` java
    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
 ```
注意，上面通过synchronized确保仅初始化一次
# 2. 策略模式
通过委托而不是继承来实现。

# 3. 观察者模式  
- 通过数据驱动通知；或者通过手工调用来进行通知。各有优劣  
- 如何做到通知时跳过自己，并且是子类无感知的做到。  
>> 观察者子类设置标识，并在基类初始化时调用  
>> 观察者基类中过滤掉自己  
```java
public abstract class Observer {
    protected int source;
    public Observer() {
        setSource();
    }
    public abstract void setSource();
    public void response(DataBean data) {
        if (data.getSource() == source) {
            return;
        }
        response();
    }

    public abstract void response();
}
```

# 2. 减少耦合的代码方案
## 通过接口减少不同类之间的直接耦合
## 通过设计模式（其实还是接口化）来减少耦合
## 通过反射来减少耦合
>> MultiThread类中，就是通过反射来减少耦合