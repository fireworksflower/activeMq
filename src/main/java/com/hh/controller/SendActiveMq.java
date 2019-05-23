

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
public class SendActiveMq {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private javax.jms.Destination checkMessage;


    @RequestMapping("/sendActiveMq")
    public String sendActiveMq() {
        String str = "huahuaTest";
        JmsUtil.sendMessage(jmsTemplate, checkMessage, str);
        return "success";
    }
}