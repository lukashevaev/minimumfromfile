package com.example.minimumfromfile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

@Service
@RequiredArgsConstructor
public class SortMinElement {

    private final FileHandler fileHandler;

    public Integer sortAndFindNMin(String filePath, Integer n) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        fileHandler.readFile(filePath, cell -> putDatainQueue(priorityQueue, n, cell));
        return priorityQueue.peek();
    }

    private void putDatainQueue(PriorityQueue<Integer> priorityQueue, Integer n, Integer number) {
        if (priorityQueue.size() < n) {
            priorityQueue.add(number);
            System.out.println("added " + priorityQueue);
        } else if (priorityQueue.peek() > number) {
            priorityQueue.poll();
            priorityQueue.add(number);
            System.out.println("pQ " + priorityQueue);
        }
    }
}
