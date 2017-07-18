package com.abdullah.Report.SalesReport;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by abdullah on 7/17/17.
 */
public class PDFBuilder extends AbstractITextPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // get data model which is passed by the Spring container

        // get data model which is passed by the Spring container
        List<DataClass> listBooks = (List<DataClass>) model.get("listBooks");

        doc.add(new Paragraph("Recommended books for Spring framework"));

        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(100.0f);
        table.setWidths(new float[] {3.0f, 2.0f, 2.0f, 2.0f, 1.0f,2.0f});
        table.setSpacingBefore(10);

        // define font for table header row
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(BaseColor.WHITE);

        // define table header cell
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BaseColor.BLUE);
        cell.setPadding(6);

        // write table header
        cell.setPhrase(new Phrase("Product", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Quantity", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Unit Price", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Total", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Tax", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Net Total", font));
        table.addCell(cell);


        // write table row data
        for (DataClass aBook : listBooks) {
            table.addCell(aBook.getProduct());
            table.addCell(aBook.getQuantity()+"");
            table.addCell(aBook.getUnitPrice()+"");
            table.addCell(aBook.getTotal()+"");
            table.addCell(aBook.getTax()+"");
            table.addCell(aBook.getNetTotal()+"");

        }
        doc.add(table);
    }
}
