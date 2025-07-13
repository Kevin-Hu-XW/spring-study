package com.java.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin
 * @date 2025/7/13 18:42
 */
@RestController
@RequestMapping("/api")
@Scope("singleton")
public class SingletonController {
}
