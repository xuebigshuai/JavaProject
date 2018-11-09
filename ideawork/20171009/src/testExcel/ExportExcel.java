package testExcel;

import org.apache.poi.hssf.usermodel.*;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.E;

/**
 * Created by Administrator on 2017/12/14.
 */
public class ExportExcel {
    public void Export(String[] headers, List<Students> dataLists)  {
        //声明一个工作薄
        HSSFWorkbook wb=new HSSFWorkbook();
        //声明一个单子并命名
        HSSFSheet sheet=wb.createSheet("学生信息表");
        //给单子声明一个长度(short已经废弃)现在用int
        sheet.setDefaultColumnWidth(15);
        //生成一个样式
        HSSFCellStyle style=wb.createCellStyle();
        //样式的字体居中
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //创建第一行也称作表头（一个单子创建行时，行数从0开始）
        HSSFRow header=sheet.createRow(0);
        //给表头依次创建单元格，写上内容
        for (int i = 0; i <headers.length ; i++) {
                HSSFCell cell=header.createCell(i);
                cell.setCellStyle(style);
                cell.setCellValue(new HSSFRichTextString(headers[i]));
        }
        //给单子添加数据
        for (int i = 0; i <dataLists.size() ; i++) {
            HSSFRow row1=sheet.createRow(i+1);

            HSSFCell cell1=row1.createCell(0);
                     cell1.setCellValue(new HSSFRichTextString(dataLists.get(i).getName()));
            HSSFCell cell2=row1.createCell(1);
                     cell2.setCellValue(new HSSFRichTextString(dataLists.get(i).getSex()));
            HSSFCell cell3=row1.createCell(2);
                      cell3.setCellValue(new HSSFRichTextString(dataLists.get(i).getAge()));
            cell1.setCellStyle(style);
            cell2.setCellStyle(style);
            cell3.setCellStyle(style);


        }
        //导出到硬盘上，默认是E盘
        try {
            try (FileOutputStream out = new FileOutputStream("E://学生表.xls")) {
                try {
                    wb.write(out);
                    out.flush();
                    out.close();
                    JOptionPane.showMessageDialog(null, "导出成功!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExportExcel exportExcel = new ExportExcel();
        String[] header={"姓名","性别","年龄"};
        List<Students> studentss=new ArrayList<>();
        studentss.add(new Students("张三","男","25"));
        studentss.add(new Students("李四","女","27"));
        studentss.add(new Students("王五","男","26"));
        exportExcel.Export(header,studentss);
    }
}
