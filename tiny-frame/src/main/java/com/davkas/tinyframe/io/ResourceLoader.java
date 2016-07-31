package com.davkas.tinyframe.io;

import java.net.URL;

/**
 * Created by davkas on 16/7/29.
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
