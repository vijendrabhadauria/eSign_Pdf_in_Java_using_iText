package mfc.esignpdf;

import static mfc.esignpdf.AppConstants.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.io.image.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import java.io.IOException;

public class Signer {

    public static void main(String args[]) throws IOException {
            //  1. set the path of source and destination pdf files
            Document document = new Document(new PdfDocument(
            new PdfReader(SOURCE_PDF), 
            new PdfWriter(DESTINATION_PDF)));

            //  2. read signature image from file system
            ImageData signImageData = ImageDataFactory.create(SIGNATURE_IMG);
            Image signImage = new Image(signImageData);

            //  3. resize the signature and set its location within the pdf document
            signImage.scaleAbsolute(140, 50);
            signImage.setFixedPosition(1, X_COORDINATE, Y_COORDINATE);

            //  4. paste image into SOURCE_PDF and create resultant signed pdf
            document.add(signImage);
            document.close();
    }
}
