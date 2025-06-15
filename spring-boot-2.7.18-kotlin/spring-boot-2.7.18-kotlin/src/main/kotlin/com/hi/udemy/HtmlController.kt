package com.hi.udemy

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HtmlController {
    @GetMapping("/")
    fun index(model: Model): String {
        return "index"
    }

    @GetMapping("/post/{num}")
    fun post(model: Model, @PathVariable num:Int) {

        println("num:\t${num}")
    }
}