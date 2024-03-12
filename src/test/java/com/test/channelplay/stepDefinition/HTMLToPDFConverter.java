package com.test.channelplay.stepDefinition;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HTMLToPDFConverter {

    public static void convertHTMLToPDF(String htmlFilePath, String pdfFilePath) throws IOException {
        File htmlFile = new File(htmlFilePath);
        File pdfFile = new File(pdfFilePath);

        try (FileInputStream htmlFileStream = new FileInputStream(htmlFile);
             FileOutputStream pdfFileStream = new FileOutputStream(pdfFile)) {

            // Convert HTML to PDF
            ConverterProperties converterProperties = new ConverterProperties();
            HtmlConverter.convertToPdf(htmlFileStream, pdfFileStream, converterProperties);
        }
    }

    public static void main(String[] args) {
        String htmlFilePath = "C:\\Users\\MD Taufik\\Documents\\GitHub\\channelplay-automated-testing\\Reports\\Assistivereport.pdf.html";
        String pdfFilePath = "C:\\Users\\MD Taufik\\Documents\\GitHub\\channelplay-automated-testing\\PDFReport\\pdfreport.pdf";

        try {
            convertHTMLToPDF(htmlFilePath, pdfFilePath);
            System.out.println("PDF Report generated successfully.");
        } catch (IOException e) {
            System.err.println("Error converting HTML to PDF: " + e.getMessage());
        }
    }
}

