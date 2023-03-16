package cn.springcloud.book.feign.controller;

import cn.springcloud.book.feign.service.HelloFeignService;
import cn.springcloud.book.feign.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/consumer/feign")
    public String findByIdByEurekaServer() {
        return userFeignService.helloFeign();

    }

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String hello() {
        return "hello,feign";
    }

    // 服务消费者对外提供的服务
    @GetMapping(value = "/search/github")
    public String searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }

    @GetMapping(value = "/search/zip")
    public ResponseEntity<byte[]> searchGithubRepoByStrZip(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo2(queryStr);
    }

}
