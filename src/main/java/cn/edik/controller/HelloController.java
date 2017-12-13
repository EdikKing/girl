package cn.edik.controller;

import cn.edik.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by edik on 2017/12/12.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/say/{id}", "/hi/{id}"}, method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
//        return girlProperties.getCupSize();
    }

//    @RequestMapping(value = "/v2", method = RequestMethod.GET)
    @GetMapping(value = "/v2")
    public String v2(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "myId: " + myId;
    }
}
