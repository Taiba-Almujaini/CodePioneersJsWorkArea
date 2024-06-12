package com.tracodepioneersapps.todo_list_app.controllers;

import com.tracodepioneersapps.todo_list_app.models.TodoItem;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(path = "/api/v1/todolist")
public class TodoListController {
    public CopyOnWriteArrayList<TodoItem> todoItems = new CopyOnWriteArrayList<>();

    @GetMapping
    public List<TodoItem> getAllItems() {
        return todoItems;
    }

    @PostMapping
    public TodoItem createItem(@RequestBody TodoItem incomingItem) {
        todoItems.add(incomingItem);
        return incomingItem;
    }

    @PutMapping(path = "/{itemId}")
    public TodoItem updateItem(@PathVariable String itemId, @RequestBody TodoItem incomingItem) {
        Optional<TodoItem> optionalFoundItem = todoItems.stream().filter((currItemObj) -> {
            return currItemObj.id.equals(itemId);
        }).findFirst();

        if (optionalFoundItem.isPresent()) {
            TodoItem foundItem = optionalFoundItem.get();
            foundItem.desc = incomingItem.desc;
            return foundItem;
        } else {
            return new TodoItem();
        }
    }

    @DeleteMapping(path = "/{itemId}")
    public TodoItem deleteItem(@PathVariable String itemId) {
        Optional<TodoItem> optionalFoundItem = todoItems.stream().filter((currItemObj) -> {
            return currItemObj.id.equals(itemId);
        }).findFirst();

        if (optionalFoundItem.isPresent()) {
            TodoItem foundItem = optionalFoundItem.get();
            todoItems.remove(foundItem);
            return foundItem;
        } else {
            return new TodoItem();
        }
    }
}
