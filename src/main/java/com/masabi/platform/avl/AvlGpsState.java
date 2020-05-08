package com.masabi.platform.avl;

import java.time.LocalDateTime;

public class AvlGpsState {

  public double latitude;
  public double longitude;
  public LocalDateTime timestamp;

  public void reset() {
    timestamp = null;
    longitude = latitude = 0L;
  }

  public String toString() {
    return String.format(
        "lat='%s', lng='%s', timestamp='%s'",
        latitude, longitude, timestamp);
  }
}
