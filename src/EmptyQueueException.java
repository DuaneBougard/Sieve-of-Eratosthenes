/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
/**
 *
 * @author duane
 */
public class EmptyQueueException extends Exception {

    /**
     * Creates a new instance of <code>EmptyQueueException</code> without detail
     * message.
     */
    public EmptyQueueException() {
        super();
    }

    /**
     * Constructs an instance of <code>EmptyQueueException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyQueueException(String msg) {
        super("Queue is Empty");
    }
}
