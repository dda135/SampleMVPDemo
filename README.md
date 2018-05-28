# SampleMVPDemo
一个简单的MVP例子
## 想法
传统的做法都是MVC，但是在使用的过程中会发现有这么一个问题，那就是Activity承担了大量的职责，从而使得代码量非常庞大，不利于阅读，同时修改起来会增加产生bug的风险，也不太利于扩展<br>
MVP可以稍微缓解一下这种情况，从使用中来看，MVP相对于MVC来说主要的好处是可以降低Activity的职责，举例说明，如果把Activity当做View来操作，那么Activity中将不再会有业务逻辑，<br>
比方说一个列表页面，实际上Activity只需要做几件事情，设置布局，提供刷新、添加列表的接口就可以了，至于PM的交互和数据处理，对于Activity来说是完全透明的，那么后续对于数据的操作只需要修改presetner或者model就可以了，<br>
这样确实能够大幅度降低Activity的复杂度
