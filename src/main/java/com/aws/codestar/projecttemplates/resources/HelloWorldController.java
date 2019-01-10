package com.aws.codestar.projecttemplates.resources;

import com.aws.codestar.projecttemplates.GatewayResponse;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Hello world controller.
 */
@RestController
@RequestMapping(path = "/rest/v1")
public class HelloWorldController {

    /**
     * Say default hello gateway response.
     *
     * @return the gateway response
     */
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public GatewayResponse sayDefaultHello() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        return new GatewayResponse(new JSONObject().put("greeting", "Hello World!").toString(),
                headers, 200);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello/{userName}")
    public GatewayResponse sayHello(@PathVariable("userName") String userName) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        return new GatewayResponse(new JSONObject().put("greeting", "Hello, " + userName + "!").toString(),
                headers, 200);
    }
}
