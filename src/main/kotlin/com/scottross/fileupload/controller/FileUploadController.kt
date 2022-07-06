package com.scottross.fileupload.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FileUploadController {

    @GetMapping("/")
    fun files(): String {
        return "index.html";
    }
}