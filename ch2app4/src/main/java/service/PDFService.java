package service;

import util.PDFUtil;

/**
 * Created by Hao on 2017/5/2.
 */
public class PDFService {
    public void createPDF(String path, String input){
        PDFUtil.createDocument(path, input);
    }
}
