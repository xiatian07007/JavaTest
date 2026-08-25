# Java 封装、继承与重写：30 分钟快速复习

## 0～5 分钟：类、对象、构造方法

类是设计图，对象是根据设计图创建出来的具体事物。

```java
Student student = new Student("张三", 18);
```

- `Student`：变量类型（类名）。
- `student`：变量名。
- `new Student(...)`：调用构造方法创建对象。
- `this.name = name`：左边是当前对象的属性，右边是传入的参数。

先阅读并手写一遍 `src/Student.java`，不要复制粘贴。

## 5～13 分钟：封装

封装就是把属性设为 `private`，不允许外部直接修改，再提供受控制的公共方法。

```java
private int age;

public int getAge() {
    return age;
}

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
}
```

- Getter 负责读取：通常有返回值、没有参数。
- Setter 负责修改：通常没有返回值、接收一个参数。
- Setter 可以验证数据，这才是封装的重要价值。

阅读 `src/getseTest.java`，然后练习：创建对象、读取年龄、修改年龄、再次读取年龄。

## 13～20 分钟：继承和 super

```java
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
}
```

- `extends` 表示“是一个”：Dog 是一种 Animal。
- 父类放共有内容，子类放自己特有的内容。
- `super(name, age)` 调用父类构造方法，初始化对象中的父类部分。
- `this` 指当前对象；`super` 指当前对象的父类部分。
- 父类的 `private` 属性存在于子类对象中，但子类不能直接访问，应该使用父类提供的 Getter/Setter。

对照阅读 `src/Vehicle.java` 和 `src/Car.java`。

## 20～25 分钟：方法重写

```java
@Override
public void makeSound() {
    System.out.println(getName() + "：汪汪汪");
}
```

重写表示子类重新实现父类已有的方法。方法名和参数列表必须相同，返回类型要兼容，访问权限不能比父类更严格。`@Override` 会帮助编译器发现拼写或参数错误。

如果要保留父类行为，可以在子类方法中先调用 `super.makeSound()`，再补充子类行为。项目中的 `Bus.makeSound()` 就是这个写法。

## 25～30 分钟：运行、手写、自测

先运行 `OopReviewMain.main()`，再关闭参考代码，自己重新写一遍 `Animal` 和 `Dog`。

预期结果：

```text
姓名：小黑
年龄：3
修改后：旺财，4岁
年龄必须大于0，本次修改无效
非法修改后的年龄：4
旺财：汪汪汪
```

自测答案：

1. 属性为什么通常用 `private`？防止外部随意修改，让数据通过可验证的方法访问。
2. 子类为什么不能直接访问父类私有属性？`private` 只允许声明它的类访问。
3. `super(...)` 有什么作用？调用父类构造方法，初始化父类部分。
4. 重写和新增方法有什么区别？重写的方法在父类中已经存在且签名一致；新增方法是子类独有的方法。

最后记住三句话：封装隐藏并保护数据；继承复用公共特征和行为；重写让子类重新定义继承到的行为。
