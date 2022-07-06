package com.scottross.fileupload.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile
import java.io.File
import javax.swing.text.html.parser.Entity

@Controller
class FileUploadController {

    @GetMapping("/")
    fun files(): String {
        return "index";
    }

    @PostMapping("/upload")
    fun upload(@RequestParam("file") file: MultipartFile): ResponseEntity<String> {
        var fileName: String? = file.originalFilename;

        try {
            file.transferTo(File("/Users/scottross/Development/file-upload/uploads/upload"));
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.I_AM_A_TEAPOT)
        }
        return ResponseEntity.ok("nice")
    }
}