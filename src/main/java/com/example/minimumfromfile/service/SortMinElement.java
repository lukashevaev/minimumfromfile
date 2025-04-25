package com.example.minimumfromfile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.PriorityQueue;

@Service
@RequiredArgsConstructor
public class SortMinElement {

    private final FileHandler fileHandler;

    public Integer sortAndFindNMin(String filePath, Integer n) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        fileHandler.readFile(filePath, cell -> putDataInQueue(priorityQueue, n, cell));

        return priorityQueue.peek();
    }

    private void putDataInQueue(PriorityQueue<Integer> priorityQueue, Integer n, Integer number) {
        if (priorityQueue.size() < n) {
            priorityQueue.add(number);
        } else if (priorityQueue.peek() > number) {
            priorityQueue.poll();
            priorityQueue.add(number);
        }
    }
}
