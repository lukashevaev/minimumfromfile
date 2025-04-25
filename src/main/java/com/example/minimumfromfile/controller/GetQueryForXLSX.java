package com.example.minimumfromfile.controller;

import com.example.minimumfromfile.service.SortMinElement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetQueryForXLSX {

    private final SortMinElement sortingAndMinElement;

    @GetMapping("/min")
    public Integer minNElement(@RequestParam String filePath,
                               @RequestParam Integer n) {
        return sortingAndMinElement.sortAndFindNMin(filePath, n);
    }
}
