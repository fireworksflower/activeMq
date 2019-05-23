package com.hh.controller;

import com.hh.domain.User;
import com.hh.sendactivemq.JmsUtil;
import com.hh.utils.StringToDateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * 使用@ResponseBody 注解实现将controller方法返回对象转换为json相应给客户端
 *
 * @author lijing
 * @date 2019/4/30 14:42
 **/
@Controller
@RequestMapping("user")
@ResponseBody
public class HelloCtrl{

    @Autowired
    private  JmsTemplate jmsTemplate;

    @Autowired
    private javax.jms.Destination checkMessage;




   /* @RequestMapping("/sendActiveMq")
    public String sendActiveMq(){
        String str = "huahuaTest";
        JmsUtil.sendMessage(jmsTemplate, checkMessage, str);
        return "success";
    }*/

    /**
     * RequestParam：把请求中指定名称的参数给控制器中的形参赋值
     * value:请求参数中的名称
     * required:请求参数中是否必须提供此参数，默认值：true.表示必须提供，如果不提供将报错
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username){
        System.out.println(username);

        return "success";
    }

    /**
     * 获取到请求体的内容，直接使用得到key=value&key=value...类似这样的结构的数据
     * get请求方式不适用，get请求得到的数据为null
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);

        return "success";
    }


    /**
     * 用于绑定url中的占位符；例如：请求url中的/testPathVariable/{id}，这个{id}就是url占位符
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println(id);

        return "success";
    }

    public void findById(@RequestParam("idList")ArrayList<Long> idsList){
        User user = new User();

        for (Long id : idsList) {
            user.setId(id);
            //User userList = service.findById(user);

            System.out.println("aa");
        }
    }

}
