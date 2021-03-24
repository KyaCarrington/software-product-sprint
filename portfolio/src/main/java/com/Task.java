
package com.google.sps.data;

/** An item on a todo list. */
public final class Task {

  private final long id;
  private final String textValue;
  private final long timestamp;

  public Task(long id, String textValue, long timestamp) {
    this.id = id;
    this.textValue = textValue;
    this.timestamp = timestamp;
  }
}