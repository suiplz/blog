package com.suiplz.blog.test;

import lombok.Builder;
import org.springframework.web.bind.annotation.*;


@RestController
public class HttpControllerTest {

    private static final String TAG="HttpControllerTest : ";

    @GetMapping("/http/lombok")
    public String lombokTest() {
        Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
        System.out.println(TAG + "getter : " + m.getUsername());
        m.setUsername("cos");
        System.out.println(TAG + "setter : " + m.getUsername());
        return "lombok test 완료";
    }

    @GetMapping("/http/get")
    public String getTest(Member m) {
        return "get 요청 :" + m.getId()+ ", " + m.getUsername()+ ", " + m.getPassword()+", "+m.getEmail();
    }

    @PostMapping("/http/post")
    public String postTest() {
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
   }
}
