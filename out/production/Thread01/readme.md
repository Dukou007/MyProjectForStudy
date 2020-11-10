# Java多线程笔记

1. Java内存加载的顺序:
   
   1. 首先从cpu-->cpu计数器--cpu缓存--RAM
   
2. 操作顺序

   1. 总线概念:

      总线（Bus）是计算机各种功能部件之间传送信息的公共通信干线，它是由[导线](https://baike.baidu.com/item/导线/1413914)组成的传输线束， 按照计算机所传输的信息种类，计算机的总线可以划分为[数据总线](https://baike.baidu.com/item/数据总线/272650)、[地址总线](https://baike.baidu.com/item/地址总线/4307936)和[控制总线](https://baike.baidu.com/item/控制总线/272568)，分别用来传输数据、数据地址和[控制信号](https://baike.baidu.com/item/控制信号/10329713)。总线是一种内部结构，它是cpu、内存、输入、[输出设备](https://baike.baidu.com/item/输出设备/10823333)传递信息的公用通道，[主机](https://baike.baidu.com/item/主机/455151)的各个部件通过总线相连接，[外部设备](https://baike.baidu.com/item/外部设备)通过相应的接口电路再与总线相连接，从而形成了[计算机硬件系统](https://baike.baidu.com/item/计算机硬件系统/8092895)。在计算机系统中，各个部件之间传送信息的公共通路叫总线，[微型计算机](https://baike.baidu.com/item/微型计算机/9287)是以[总线结构](https://baike.baidu.com/item/总线结构/10183496)来连接各个[功能部件](https://baike.baidu.com/item/功能部件/8514356)的。

      

   ![](C:\Users\zhouj\OneDrive\图片\截图\屏幕截图 2020-11-10 152517.png)

![](C:\Users\zhouj\OneDrive\图片\截图\屏幕截图 2020-11-10 152009.png)

