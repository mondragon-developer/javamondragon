// Import necessary classes from the ZXing library for generating QR codes
import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

// Import classes for file handling
import java.io.File;
import java.nio.file.Path;

public class QRCodeGenerator {
    // Main method to run the QR code generation
    public static void main(String[] args) throws Exception {
        // Define the text to be encoded in the QR code
        String url = "https://www.linkedin.com/in/mondradev/";

        // Create a QRCodeWriter object for generating QR codes
        QRCodeWriter writer = new QRCodeWriter();

        // Generate a BitMatrix representing the QR code for the given text
        BitMatrix bitMatrix = writer.encode(url, BarcodeFormat.QR_CODE, 200, 200);

        // Define the path where the QR code image will be saved
        Path path = new File("QrCodeApp/qrcode.png").toPath();

        // Write the BitMatrix to an image file (PNG format)
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
}
