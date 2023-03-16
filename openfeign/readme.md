
## Feig查询Github第三方服务入门案例

## 测试
### 1.启动访问 没有开启Gzip压缩

http://localhost:8010/search/github?str=spring-cloud-dubbo

### 2.启动访问 开启了Gzip压缩

http://localhost:8010/search/zip?str=spring-cloud-dubbo



实际调用的是:
https://api.github.com/search/repositories?q=spring-cloud-minos





