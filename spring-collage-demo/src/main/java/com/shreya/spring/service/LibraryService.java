package com.shreya.spring.service;

import com.shreya.spring.model.Library;
import lombok.Data;

@Data
public class LibraryService {

    private Library library;
    public void showLibrary(){
        System.out.println("Library " + library);
    }
}
