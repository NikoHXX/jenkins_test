/**
 * 项目名：jenkins_test
 * 日  期：2019-06-29
 * 包  名：com.yuanzhan.jenkins.test.jenkins_test.controller
 *
 * @author： HuangXiuxiang
 */
package com.yuanzhan.jenkins.test.jenkins_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/test")
    public String test(){
        return  "Hello jenKins + web+github";
    }
}