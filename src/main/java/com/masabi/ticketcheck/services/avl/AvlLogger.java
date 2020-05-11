package com.masabi.ticketcheck.services.avl;

public interface AvlLogger {
    void d(String tag, String message);

    void e(String tag, String message, Exception e);

    void e(String tag, String message);

    void w(String tag, String message, Exception e);

    void w(String tag, String message);

    void v(String tag, String message);

    void i(String tag, String message);
}
