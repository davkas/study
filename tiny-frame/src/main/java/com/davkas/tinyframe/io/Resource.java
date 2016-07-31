package com.davkas.tinyframe.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by davkas on 16/7/29.
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
