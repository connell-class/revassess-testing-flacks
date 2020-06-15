package com.rev.servlet;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RevassessServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        JSONObject jsonObject = new JSONObject(IOUtils.toString(new URL("http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard"), StandardCharsets.UTF_8));
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.print(jsonObject.toString());
    }
}