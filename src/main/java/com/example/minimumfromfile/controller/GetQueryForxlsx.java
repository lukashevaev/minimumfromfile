package com.example.minimumfromfile.controller;

import com.example.minimumfromfile.service.SortMinElement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/numbers")
@RequiredArgsConstructor
public class GetQueryForxlsx {

    private final SortMinElement sortingAndMinElement;

    @GetMapping("/min")
    //@RequestMapping("/min/{n}")
    public Integer minNelement(@RequestParam String filePath,
                            @RequestParam Integer n) {
        return sortingAndMinElement.sortAndFindNMin(filePath, n);
    }
}
