package com.example.project.config;

import lombok.AllArgsConstructor;
import lombok.val;

@AllArgsConstructor
public class Ret<T> {
    public Integer code;
    public String message;
    public T data;
    public static <T>Ret Success(T data){
        final val ok = new Ret<>(0, "ok", data);
        return ok;
    }
    public static <T>Ret Error(T data){
        final val err = new Ret<T>(-1, "err", data);
        return err;
    }
}
