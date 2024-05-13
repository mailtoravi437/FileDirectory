package org.example;

import org.example.FileSystem;

import java.util.*;


class  Directory implements FileSystem{
private String directoryName;
List<FileSystem> fileSystemList;

    Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name " + directoryName);
        for(FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }
    }
}
