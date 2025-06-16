package com.hi.udemy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HtmlController {

    @Autowired
    lateinit var repository:UserRepository

    @GetMapping("/")
    fun index(model: Model): String {
        return "index"
    }

    @GetMapping("/{formType}")
    fun htmlForm(model: Model, @PathVariable formType:String): String {

        var response: String = ""
        if (formType.equals("sign")) {
            response = "sign"
        } else if (formType.equals("login")) {
            response = "login"
        }

        model.addAttribute("title" ,response)

        return response
    }

    @PostMapping("/sign")
    fun postSign(model: Model,
                 @RequestParam(value = "id") userId:String,
                 @RequestParam(value = "password") password:String): String {
        try {
            val user = repository.save(User(userId,password))
            println(user.toString())
        }catch (e:Exception){
            e.printStackTrace()
        }

        return "index"
    }
}