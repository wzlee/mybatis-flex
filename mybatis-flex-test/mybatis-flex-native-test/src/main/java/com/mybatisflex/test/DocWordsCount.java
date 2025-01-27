package com.mybatisflex.test;

import java.io.*;

public class DocWordsCount {

    private static long count = 0;

    public static void main(String[] args) {
        String rootPath = "/Users/michael/work/git/mybatis-flex/docs";
        File rootFile = new File(rootPath);
        calculate(rootFile);
        System.out.println("words count: " + count);
    }


    private static void calculate(File dir){
        File[] files = dir.listFiles(pathname -> !"node_modules".equals(pathname.getName()));
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    calculate(file);
                } else if (file.getName().endsWith(".md")) {
                    System.out.println(file);
                    String s = readString(file, "utf-8");
                    count += s.length();
                }
            }
        }
    }


    private static String readString(File file, String charsetName) {
        ByteArrayOutputStream baos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for (int len = 0; (len = fis.read(buffer)) > 0; ) {
                baos.write(buffer, 0, len);
            }
            return baos.toString(charsetName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeQuietly(fis, baos);
        }
        return null;
    }

    private static void closeQuietly(Closeable... closeables) {
        if (closeables != null) {
            for (Closeable closeable : closeables) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
