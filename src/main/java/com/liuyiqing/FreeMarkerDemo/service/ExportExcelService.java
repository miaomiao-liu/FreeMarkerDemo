package com.liuyiqing.FreeMarkerDemo.service;

import com.liuyiqing.FreeMarkerDemo.entities.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by miaomiao on 18-3-1.
 */
@Service
public class ExportExcelService {


    public Map<String,Object> exportExcel(){
        //设置表格标题
        List<String> titles = new ArrayList<>();
        titles.add("序号");
        titles.add("姓名");
        titles.add("年级");
        titles.add("班级");
        titles.add("英语");
        titles.add("语文");
        titles.add("数学");

        //设置表格内容
        List<Student> students = new ArrayList<>();
        for(int i=0; i<10; i++){
            Student student = new Student(100 + i, "zong_"+i, 1+i, 2+i, 90+i, 80+i, 100-i);
            students.add(student);
        }

        Map root = new HashMap();
        root.put("titles", titles);
        root.put("students", students);

        return root;

    }
}
