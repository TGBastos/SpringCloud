package br.ucsal.configserverclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@RefreshScope
public class ConfigController {

    @Value("${service.name}")
    private String serviceInfo;

    @GetMapping
    public  String getServiceInfo(){
        return "service name: " + serviceInfo;
    }

}
