package util;

import action.PDFAction;
import service.PDFService;

/**
 * Created by Hao HOU on 2017/5/2.
 */
public class DependencyInjector {
    public void start(){
        // initialization code
    }
    public void shutDown(){
        // clean-up code
    }

    public Object getObject(Class type){
        if (type == PDFService.class){
            return new PDFService();
        } else if (type == PDFAction.class){
            PDFService pdfService = (PDFService) getObject(PDFService.class);
            PDFAction action = new PDFAction();
            action.setPDFService(pdfService);
            return action;
        }
        return null;
    }
}
