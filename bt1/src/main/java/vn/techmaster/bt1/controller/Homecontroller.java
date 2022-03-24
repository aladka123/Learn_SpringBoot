package vn.techmaster.bt1.controller;

import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Homecontroller {
    
// Bài 1

@RequestMapping(value = "/random", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String Random(){
        return RandomStringUtils.randomAlphanumeric(8);
    }

// Bài 2

@GetMapping("/quote")
@ResponseBody
public String quote(){
    String[] quoteArr = { "Kiến tha lâu đầy tổ", 
"Có công mài sắt có ngày nên kim",
"Không thầy đố mày làm nên",
"Học thầy không tày học bạn"};
Random r = new Random();
return quoteArr[r.nextInt(quoteArr.length)];

}

// Bài 3

@PostMapping(value = "/bmi", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public float echoBmi(@RequestBody Bmi bmi) {
    return bmi.weight() / (bmi.height() * bmi.height());
}


// Bài 4 

ArrayList<Student> list = new ArrayList<>();

@PostMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public void addStudent(@RequestBody Student student) {
    list.add(student);
    return;
}

@GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public ArrayList<Student> getStudent() {
    return list;
}
}
