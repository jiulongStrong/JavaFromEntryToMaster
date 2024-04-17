package com.strong.java.basicdatatype;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.*;

/**
 * @author: strong
 * @since: 2024/3/17 22:39
 * @description:
 */
public class filestreamtest {

    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动创建

        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码

        writer.append("中文输入");
        //写入到缓冲区

        writer.append("\r\n");

        writer.append("English");
        //刷新缓冲区,写入到文件

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        writer.close();

        fop.close();

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
        // 构建InputStreamReader对象,参数可以指定编码,默认为操作系统默认编码

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭读取流

//        System.out.println("文件读取成功！");


    }
}
