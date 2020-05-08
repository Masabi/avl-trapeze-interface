package com.masabi.ticketcheck.services.avl;

import com.masabi.platform.avl.AvlGpsState;
import com.masabi.platform.avl.AvlVehicleState;

public interface AvlStatusListener {

  void reset();

  void update(AvlGpsState state);

  void update(AvlVehicleState state);
}
