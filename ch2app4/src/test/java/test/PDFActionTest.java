package test;

import action.PDFAction;
import util.DependencyInjector;

/**
 * Created by Hao on 2017/5/2.
 */
public class PDFActionTest {
    public static void main(String[] args){
        DependencyInjector dependencyInjector = new DependencyInjector();
        dependencyInjector.start();
        PDFAction pdfAction = (PDFAction) dependencyInjector.getObject(PDFAction.class);
        pdfAction.createPDF("E:/1.pdf", "Testing PDFAction... .");
        dependencyInjector.shutDown();
    }
}
