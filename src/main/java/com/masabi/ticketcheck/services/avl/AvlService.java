package com.masabi.ticketcheck.services.avl;

import com.masabi.platform.avl.AvlGpsState;
import com.masabi.platform.avl.AvlVehicleState;

public interface AvlService {

  void start();

  void stop();

  AvlGpsState getLatestGpsState();

  AvlVehicleState getLatestVehicleState();

}
