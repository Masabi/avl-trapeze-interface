package com.masabi.platform.avl;

import java.time.LocalDateTime;

public class AvlVehicleState {

  public String routeId;
  public String vehicleId;
  public String stopId;
  public String tripId;
  public String opId;
  public LocalDateTime timestamp;

  public void reset() {
    routeId = vehicleId = stopId = tripId = opId = null;
    timestamp = null;
  }

  public String toString() {
    return String.format(
        "routeId='%s', vehicleId='%s', stopId='%s', tripId='%s', opId='%s, timestamp='%s'",
        routeId, vehicleId, stopId, tripId, opId, timestamp);
  }
}
