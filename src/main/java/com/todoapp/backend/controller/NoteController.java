package com.todoapp.backend.controller;

import com.todoapp.backend.entity.Note;
import com.todoapp.backend.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")

public class NoteController {

    @Autowired
    private NoteService service;

    @GetMapping("get/notes")
    public List<Note> getAllNotes() {
        return service.getNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note) {
        return service.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note) {
        return service.updateNote(note);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id) {
        service.deleteNote(id);
    }
}