
package com.google.sps.data;

/** An item on a todo list. */
public final class Task {

  //private final long id;
 // private final String textValue;
 // private final long timestamp;
    private final long id;
  private final String name;
  private final String email;
  private final String message;
  

  //public Task(long id, String textValue, long timestamp) {
  //  this.id = id;
    //this.textValue = textValue
  //  this.timestamp = timestamp;
 // }
  public Task(long id, String name, String email, String message) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.message = message;
  }
}