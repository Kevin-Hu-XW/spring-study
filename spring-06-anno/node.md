## 注解说明
* @Component ：组件放在类上，说明这个类被spring管理了
* @Service ：服务放在类上，说明这个类被spring管理了
* @Repository ：数据访问放在类上，说明这个类被spring管理了
* @Controller ：控制器放在类上，说明这个类被spring管理了
* @Autowired ：自动注入放在属性上，说明这个属性被spring管理了
* @Value ：值放在属性上，说明这个属性的值被spring管理了
* @PostConstruct ：初始化放在方法上，说明这个方法在spring初始化的时候执行
* @PreDestroy ：销毁放在方法上，说明这个方法在spring销毁的时候执行
* @Configuration ：配置放在类上，说明这个类是一个配置类，里面可以放配置信息，比如bean的配置
* @Bean ：bean放在方法上，说明这个方法返回的bean对象被spring管理了