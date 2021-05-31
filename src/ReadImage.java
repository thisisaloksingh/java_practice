
import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {
	
	public String getImgText(String imageLocation) {
		ITesseract instance = new Tesseract();
		try {
			String imgText = instance.doOCR(new File(imageLocation));
			return imgText;
		} catch (TesseractException e) {
			e.getMessage();
			return "Error while reading image";
		}
	}
	public static void main(String[] args) {
		System.out.println("ReadImage.main()");
		ReadImage app = new ReadImage();
		System.out.println(app.getImgText("D:\\WORKSPACE\\meetaloksngh\\RestApiPractice\\WebContent\\WEB-INF\\image\\tum.jpg"));
	}
}
