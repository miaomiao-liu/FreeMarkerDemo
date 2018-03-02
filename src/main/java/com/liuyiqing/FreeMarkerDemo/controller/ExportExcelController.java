package com.liuyiqing.FreeMarkerDemo.controller;

import com.liuyiqing.FreeMarkerDemo.service.ExportExcelService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Map;

/**
 * Created by miaomiao on 18-3-1.
 */
@RestController
public class ExportExcelController {

    @Autowired
    private ExportExcelService exportExcelService;

    @RequestMapping("/excel")
    public void exportExcel(){

        try {
        //        Configuration(Configuration.VERSION_2_3_22);
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
        cfg.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
        Template studentTemplate = cfg.getTemplate("student.ftl");

        File file = new File("/home/miaomiao/download/excel_students.xls");
        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

        //按照ftl 模板规定的样式，将root 对象里的内容写入新的文件
        Map<String,Object> root = exportExcelService.exportExcel();
        studentTemplate.process(root, fw);

        fw.flush();
        fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
