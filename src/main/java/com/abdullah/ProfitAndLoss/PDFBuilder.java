package com.abdullah.ProfitAndLoss;

import com.abdullah.Purchase.PurchaseListBean;
import com.abdullah.Report.SalesReport.AbstractITextPdfView;
import com.abdullah.Sales.SalesListBean;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by abdullah on 7/17/17.
 */
public class PDFBuilder extends AbstractITextPdfView {
    @Autowired
    ProfitLossCalculate plc;
    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // get data model which is passed by the Spring container

        // get data model which is passed by the Spring container
        List<SalesListBean> listSales = (List<SalesListBean>) model.get("salesList");
        List<PurchaseListBean> listPurchase = (List<PurchaseListBean>) model.get("purchaseList");

        doc.add(new Paragraph("Rhivaan Group Of Industries"));
        doc.add(new Paragraph("Profit & Loss Statement"));
        doc.add(new Paragraph("Income : "));
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100.0f);
        table.setWidths(new float[] {3.0f, 2.0f, 2.0f,2.0f});
        table.setSpacingBefore(10);

        // define font for table header row
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(BaseColor.WHITE);

        // define table header cell
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BaseColor.BLUE);
        cell.setPadding(4);

        // write table header
        cell.setPhrase(new Phrase("Date", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Product", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Customer", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Total", font));
        table.addCell(cell);


        // write table row data
        for (SalesListBean aBook : listSales) {
            table.addCell(aBook.getDate()+"");
            table.addCell(aBook.getProduct()+"");
            table.addCell(aBook.getCustomer()+"");
            table.addCell(aBook.getNet()+"");


        }

        doc.add(table);
        doc.add(new Paragraph("Total Income : "+plc.getIncome()));

        doc.add(new Paragraph("Expense : "));
        PdfPTable tables = new PdfPTable(4);
        tables.setWidthPercentage(100.0f);
        tables.setWidths(new float[] {3.0f, 2.0f, 2.0f,2.0f});
        tables.setSpacingBefore(10);




        // write table header
        cell.setPhrase(new Phrase("Date", font));
        tables.addCell(cell);

        cell.setPhrase(new Phrase("Product", font));
        tables.addCell(cell);

        cell.setPhrase(new Phrase("Supplier", font));
        tables.addCell(cell);

        cell.setPhrase(new Phrase("Total", font));
        tables.addCell(cell);


        // write table row data
        for (PurchaseListBean aBook : listPurchase) {
            tables.addCell(aBook.getDate()+"");
            tables.addCell(aBook.getProduct()+"");
            tables.addCell(aBook.getSupplier()+"");
            tables.addCell(aBook.getNet()+"");


        }

        doc.add(tables);
        doc.add(new Paragraph("Total Expense : "+plc.getExpense()));
        doc.add(new Paragraph("."));
        doc.add(new Paragraph("."));
        doc.add(new Paragraph("."));
        if(plc.getIncome()>=plc.getExpense())
        {
            doc.add(new Paragraph("Profit : "+(plc.getIncome()-plc.getExpense())));
        }
        else
        {
            doc.add(new Paragraph("Loss : "+(plc.getExpense()-plc.getIncome())));
        }
    }
}
