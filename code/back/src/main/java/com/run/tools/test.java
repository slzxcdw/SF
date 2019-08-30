package com.run.tools;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {

        JSONArray createlist = new JSONArray();
        JSONObject newbook = new JSONObject();
        newbook.put("11",2);
        createlist.add(newbook);
        JSONObject tmp=createlist.getJSONObject(0);
    }
}
