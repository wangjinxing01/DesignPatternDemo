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
# 2. 减少耦合的代码方案
## 通过接口减少不同类之间的直接耦合
## 通过设计模式（其实还是接口化）来减少耦合
## 通过反射来减少耦合
>> MultiThread类中，就是通过反射来减少耦合