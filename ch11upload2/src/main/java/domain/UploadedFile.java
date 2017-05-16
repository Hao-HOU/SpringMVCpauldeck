package domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by Hao HOU on 2017/5/12.
 */
public class UploadedFile implements Serializable {
    private static final long serialVersionUID = -783678928610448472L;

    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
