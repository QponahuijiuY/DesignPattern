### 建造者模式

- 他就是使用多个简单的对象一步一步的构建出一个复杂的对象,每一个Builder类独立于其他的对象
- 建造者模式主要是为了将一个复杂的构建与其表示相分离,
- 优点: 建造者是独立的,易扩展
- 缺点: 产品必须有共同点,范围有限制,如果内部变化复杂,就会有很多的建造类
- 与工厂模式的区别是,建造者模式更加关注顺序,它是有层次关系的.
- 产品角色:一个具体的对象产品
- 抽象建造者:创建一个产品角色的各个部件指定的接口
- 具体建造者:实现接口,构建和装配各个部件
- 指挥者:构建一个使用抽象建造者接口的对象.
### UML建模
![设计模式](http://a1.qpic.cn/psc?/V11x0rNG1YHIQY/ChQ0KIcA.iub3F93BayOjH0*caV1m1Z2G5DiGLR90Euh92q1Qdq0N5PtA2SGc6D89JbLumWZkqm9SXtDBFIAxQ!!/m&ek=1&kp=1&pt=0&bo=nAIkAQAAAAADF4k!&tl=1&vuin=1530201142&tm=1582426800&sce=60-4-3&rf=viewer_4)

### StringBuilder实现
![](http://m.qpic.cn/psc?/V11x0rNG1YHIQY/ks03zzQZIOtARaEs1LwLEN3WAPmmYY2pjjBPapsxAMbrLgprawHGW2hAfcYhjYyIb7D0zusQPhX.e982R3rAce25Nmbb4c4n1w3ReLl1c3c!/b&bo=rQH*AAAAAAADB3E!&rf=viewer_4)
- 首先StringBuilder继承AbstractBuilder,AbstractBuilder实现了两个接口,