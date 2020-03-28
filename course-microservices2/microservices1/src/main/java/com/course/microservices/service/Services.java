package com.course.microservices.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Services {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Environment environment;

    @Value("${spring.application.name}")
    private String instanceId;

    @GetMapping("/services")
    public ResponseEntity<?> getServices() {
        return new ResponseEntity<>(discoveryClient.getServices(), HttpStatus.OK);
    }

    @GetMapping("/services/port")
    public ResponseEntity<?> getPort() {
        return new ResponseEntity<>(environment.getProperty("local.server.port"), HttpStatus.OK);
    }


    @GetMapping("/services/instances")
    public ResponseEntity<List<ServiceInstance>> getInstances() {
        return new ResponseEntity<>(discoveryClient.getInstances(instanceId), HttpStatus.OK);
    }
}
