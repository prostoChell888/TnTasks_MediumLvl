package org.example;


/**
 * Error that occurs when the matrix sizes are incorrect
 */
public class SizeOfMaterException extends RuntimeException{

    public SizeOfMaterException(String message) {
        super(message);
    }
}
