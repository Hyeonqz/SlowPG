package api.restapi.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/b")
@RestController
@Slf4j
public class RestApiBController {

    @GetMapping("/hello")
    public void hello() {
        throw new NumberFormatException("number format exception");
    }

   /* @ExceptionHandler(value = { NumberFormatException.class})
    public ResponseEntity numberFormatException(NumberFormatException e) {
        log.error("restapibcontroller",e);
        return ResponseEntity.ok().build();
    }*/
}
