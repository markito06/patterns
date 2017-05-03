package strategy2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class EnviarParaPdf implements IEnviar {

	@Override
	public void envie(String conteudo) {
		 Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Pedido.pdf"));
	         document.open();
	         document.add(new Paragraph("Detalhes do pedido"));
	         document.add(new Paragraph(conteudo));
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }

	}

}
