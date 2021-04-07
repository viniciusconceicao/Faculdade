package com.example.projetodonload;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @GetMapping("/um")
    public ResponseEntity getUm(){
        return ResponseEntity.ok("{\nome\":\"josé maria\"}");
    }

    @GetMapping(value = "/arquivo-loko", produces = "application/vnd.ms-excel")
    @ResponseBody
    public ResponseEntity getLoko(){
        return ResponseEntity.ok("Só que não!!");
    }


    @GetMapping(value = "/zip-loko", produces = "application/zip")
    @ResponseBody
    public ResponseEntity getZip(){
        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Disposition", "attachment; filename=lokao.zip");
        headers.add("lady-gaga", "Ulálá");

        return new ResponseEntity("Conteúdo zip fake",headers, 200);
    }
}
