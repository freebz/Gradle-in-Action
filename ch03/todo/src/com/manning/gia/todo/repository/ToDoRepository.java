package com.manning.gia.todo.repository;

import com.manning.gia.todo.model.ToDoItem;
import java.util.Collection;

public interface ToDoRepository {
    List<ToDoItem> findAll();
    Long insert(ToDoItem toDoItem);
    void update(ToDoItem toDoItem);
    void delete(ToDoItem toDoItem);
}
