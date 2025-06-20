## 代理模式
### 静态代理
#### 角色分析
- 抽象角色：一般使用接口或者抽象类（相当于项目中的一类业务）
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色后，我们一般会做一些附属操作
- 客户端：访问代理对象的人


#### 代理模式的好处
- 可以使真实角色的操作更加纯粹，不用去关注一些公共业务
- 公共业务也就交给了代理角色，实现了业务的分工
- 公共业务发生扩展的时候，方便集中管理

#### 缺点
- 一个真实角色就会产生一个代理角色：代码量会翻倍，开发效率变低

### 动态代理
#### Proxy类
- newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
- loader：指定当前目标对象使用的类加载器，获取加载器的方法：this.getClass().getClassLoader()
- interfaces：目标对象实现的接口类型，使用泛型方法获取(为什么不能类对象去获取目标对象实现的接口？是因为一个Java类可以实现多个接口（Runnable, Serializable, Closeable），你可能只想代理业务接口，而不是系统接口；Proxy.newProxyInstance 是低级 API，明确要求你显式声明要代理哪些接口，避免不确定行为)
- h：动态代理对象对应的调用处理程序
- 返回一个动态代理对象：newProxyInstance()方法返回的动态代理对象是proxy对象
#### InvocationHandler接口
- invoke(Object proxy, Method  method, Object[] args)
- proxy：代理对象
- method：正在被调用的方法
- args：调用方法时传入的参数
- 返回值：和目标对象有相同的返回值