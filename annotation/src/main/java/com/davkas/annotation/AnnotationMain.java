package com.davkas.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by davkas on 16/5/16.
 */
public class AnnotationMain {
    public static void main(String[] args) {
        Class<AnnotatedClass> object = AnnotatedClass.class;
        // Retrieve all annotations from the class
        Annotation[] annotations = object.getAnnotations();
        for( Annotation annotation : annotations )
        {
            System.out.println( annotation );
        }

        // Checks if an annotation is present
        if( object.isAnnotationPresent(AnnotationClass.class ) )
        {

            // Gets the desired annotation
            Annotation annotation = object.getAnnotation(AnnotationClass.class );

            System.out.println( annotation );

        }
        // the same for all methods of the class
        for( Method method : object.getDeclaredMethods() )
        {

            if( method.isAnnotationPresent(AnnotationMethod.class ) )
            {

                Annotation annotation = method.getAnnotation(AnnotationMethod.class );

                System.out.println( annotation );

            }

        }
    }
}
