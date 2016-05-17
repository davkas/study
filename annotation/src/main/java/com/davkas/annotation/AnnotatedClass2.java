package com.davkas.annotation;

/**
 * Created by davkas on 16/5/16.
 */
@AnnotationClass( date = "2014-05-05" )
public class AnnotatedClass2 {

    @AnnotationMethod( date = "2014-06-05", description = "annotated method" )
    public String annotatedMethod()
    {
        return "nothing niente";
    }

    @AnnotationMethod( author = "friend of mine", date = "2014-06-05", description = "annotated method" )
    public String annotatedMethodFromAFriend()
    {
        return "nothing niente";
    }
}
