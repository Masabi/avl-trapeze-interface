package com.masabi.ticketcheck.services.avl;

public interface AvlServiceFactory {

  AvlService makeAvlService(String host, int port, AvlStatusService statusService,
      AvlStatusListener avlStatusListener, AvlLogger logger);
}
