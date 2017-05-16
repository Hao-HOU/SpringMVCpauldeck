package action;

import service.PDFService;
import util.PDFUtil;

/**
 * Created by Hao HOU on 2017/5/2.
 */
public class PDFAction {
    private PDFService pdfService;
    public void setPDFService(PDFService pdfService){
        this.pdfService = pdfService;
    }
    public void createPDF(String path, String input){
        pdfService.createPDF(path, input);
    }
}
