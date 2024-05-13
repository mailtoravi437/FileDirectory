package org.example;

public class File implements FileSystem{
    private final String fileName;

    File(String name){
        this.fileName = name;
    }

    @Override
    public void ls(){
        System.out.println("file name " + fileName);
    }
}
