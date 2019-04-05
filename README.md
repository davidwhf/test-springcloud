# SpringCloud Test Demo
* Eureka服务注册中心模块
   * [springcloud-eureka-server](https://github.com/toforo/test-springcloud/tree/master/springcloud/springcloud-eureka-server)
* Eureka服务生产者模块
   * [springcloud-eureka-provider1](https://github.com/toforo/test-springcloud/tree/master/springcloud/springcloud-eureka-provider1)
   * [springcloud-eureka-provider2](https://github.com/toforo/test-springcloud/tree/master/springcloud/springcloud-eureka-provider2)
* Eureka服务消费者模块(集成了Ribbon,Hystrix,Config,Actutor)
   * [springcloud-eureka-consumer](https://github.com/toforo/test-springcloud/tree/master/springcloud/springcloud-eureka-consumer)
* Zuul API网关模块
   * [springcloud-zuul](https://github.com/toforo/test-springcloud/tree/master/springcloud/springcloud-zuul)
* Config配置中心模块
   * [springcloud-config-server](https://github.com/toforo/test-springcloud/tree/master/springcloud/springcloud-config-server)
   
# Test Desc
* Eureka服务注册中心测试:
   * `http://localhost:9000(账号密码: test 123456)`
* Eureka服务生产者测试:
   * `http://localhost:9010/hello/{name}`
   * `http://localhost:9011/hello/{name}`
* Eureka服务消费者测试:
   * `http://localhost:9020/test(需关闭负载均衡)`
* Ribbon负载均衡测试:
   * `http://localhost:9020/ribbon/test`
* Hystrix断路器测试:
   * `http://localhost:9020/hystrix/test/{name}(需关闭一个服务生产者)`
* Config配置中心测试:
   * `http://localhost:9020/config/test(客户端访问配置中心)`
   * `http://localhost:9040/springcloud-eureka-consumer/dev/master(直接访问配置中心)`
* Actutor刷新配置测试:
   * `http://localhost:9020/refresh.html`
* Zuul API网关测试:
   * `http://localhost:9030/provider/hello/{name}`
   * `http://localhost:9030/consumer/ribbon/test`
