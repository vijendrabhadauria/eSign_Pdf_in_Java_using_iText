# eSign_Pdf_in_Java_using_iText
It is a sample Java application to e-sign a PDF document using iText library.

The application works as follow:
- reads source PDF document from local path /store/pdf/InputFile.pdf
- reads source signature image from local path /store/img/signature.png
- generates the signed PDF document under local path /store/pdf/OutputFile.pdf

Above paths can easily be updated by editing the Java source file src/main/java/mfc/esignpdf/AppConstants.java

Run the Java file src/main/java/mfc/esignpdf/Signer.java, and it will generate the e-signed PDF document under the path /store/pdf/OutputFile.pdf

I hope it helps you
