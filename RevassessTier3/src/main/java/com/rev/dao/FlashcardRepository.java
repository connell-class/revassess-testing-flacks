package com.rev.dao;

import com.rev.model.Category;
import com.rev.model.Flashcard;

import java.util.Set;

public class FlashcardRepository implements CrudRepository {
    @Override
    public Flashcard save(Object o) {
        return null;
    }

    @Override
    public Set<Flashcard> findAll() {
        return null;
    }

    @Override
    public Flashcard findById(Integer id) {
        return null;
    }

    public Flashcard findFlashcardByQuestion(String question) {
        return null;
    }

    public Set<Flashcard> findFlashcardsByCategory(Category category) {
        return null;
    }

    @Override
    public boolean update(Object card) {
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}