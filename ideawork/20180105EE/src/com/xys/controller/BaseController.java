package com.xys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/1/12.
 */
public interface BaseController {
    String  handleRequest(HttpServletRequest request, HttpServletResponse response);
}
