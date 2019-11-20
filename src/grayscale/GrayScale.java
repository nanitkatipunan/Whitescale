/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grayscale;

/**
 *
 * @author 2ndyrGroupB
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class GrayScale {

    BufferedImage image;
    int width;
    int height;

    public GrayScale() {

        try {
            File input = new File("C:\\Users\\katipunanna_sd2082\\flower/myflower.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));
                    Color b= new Color(0, 0, 0);
                    Color w = new Color(255,255,255);
                            if ( c.getRGB() == b.getRGB() || (c.getRed() < 50 && c.getGreen()<50 &&c.getBlue()<50) ){
                                
                            }
                            else{
                                 image.setRGB(j, i, w.getRGB());
                            }
                            
//                    int red = (int) (c.getRed() * 0.299);
//                    int green = (int) (c.getGreen() * 0.587);
//                    int blue = (int) (c.getBlue() * 0.114);
                    //Color newColor = new Color(red+green+blue, red+green+blue, + red+green+blue);
                    
                   
                }
            }

            File ouptut = new File("C:\\Users\\katipunanna_sd2082\\flower/flower1.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (Exception e) {
        }
    }

    static public void main(String args[]) throws Exception {
        GrayScale obj = new GrayScale();
    }
}
