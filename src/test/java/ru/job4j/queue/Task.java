package ru.job4j.queue;

/**
 * 2024-01-08
 * 5. PriorityQueue [#504944]
 * модель данных Task
 */

public record Task(Position position,
                   String description,
                   int urgency) {
}