package Implementation;

import java.sql.Connection;
 
import Facade.ExcelRapport;
import Facade.HtmlRapport;
import Facade.PdfRapport;

public class RapportFacade {
 
	private PdfRapport pdfRapport;
	private HtmlRapport htmlRapport;
	private ExcelRapport excelRapport;
 
	public RapportFacade() {
		pdfRapport = new PdfRapportImpl();
		htmlRapport = new HtmlRapportImpl();
		excelRapport = new ExcelRapportImpl();
	}
 
	public void genererPdf(Connection connection, String uneTable) {
		pdfRapport.genererPdf(connection, uneTable);
	}
 
	public void genererHtml(Connection connection, String uneTable) {
		htmlRapport.genererHtml(connection, uneTable);
	}
 
	public void genererExcel(Connection connection, String uneTable) {
		excelRapport.genererExcel(connection, uneTable);
	}
}

