package com.masabi.ticketcheck.services.avl;

public interface AvlStatusService {
  /**
   * Record that a fault status has been detected. Typically used to signal that
   * communication to the AVL has been lost.
   */
  void addFault();

  /**
   * Record that a fault status has been removed. Typically used to signal that
   * communication to the AVL has been regained.
   */
  void removeFault();
}
