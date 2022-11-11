package com.example.scanqr;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

@SpringBootConfiguration
public class ReadQRCode implements CommandLineRunner {

    public static void main(String[] args)  {
    }


    @Override
    public void run(String... args) throws Exception {
        try {

            BufferedImage readerImage = ImageIO.read(new FileInputStream("QRCode.png"));
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(readerImage)));
            Result resultObj = new MultiFormatReader().decode(binaryBitmap);

            System.out.println(resultObj.getText());

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
