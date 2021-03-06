package com.practice;

import java.util.List;

public interface ISaveable {
    List<String> write();//, takes no arguments and returns a List containing objects of type String.
    void read(List<String> list);// takes a List of type String and doesn't return anything.
}
