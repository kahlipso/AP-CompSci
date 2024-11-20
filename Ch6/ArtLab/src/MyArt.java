import java.awt.*;

/**
 * Write a description of class MyArt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyArt
{
    /** you put your code here  **/
    private Picture image;



    public MyArt()
    {
        image = new Picture("kitten.jpg");

    }
    public MyArt(String path)
    {
        image = new Picture(path);
    }

    public MyArt(int size)
    {
        final int WIDTH = size;
        final int HEIGHT = 2 * size;

        image = new Picture(WIDTH, HEIGHT);

        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel pixelObj = image.getPixel(x, y);

                pixelObj.setRed(r);
                pixelObj.setGreen(g);
                pixelObj.setBlue(b);
            }
        }
    }

    public MyArt(int width, int height)
    {
        image = new Picture(width, height);

        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);

                Pixel pixelObj = image.getPixel(x, y);

                pixelObj.setRed(r);
                pixelObj.setGreen(g);
                pixelObj.setBlue(b);
            }
        }
    }

    public void reflect()
    {
        for(int x = 0; x < image.getWidth()/2; x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel pixelObj = image.getPixel(x, y);
                Pixel reverse = image.getPixel(image.getWidth()-x-1, y);

                Color original = pixelObj.getColor();
                Color reverseColor = reverse.getColor();

                pixelObj.setColor(reverseColor);
                reverse.setColor(original);

            }
        }
    }

    public void doubleHorizontal()
    {
        Picture newImage = new Picture(image.getWidth() * 2, image.getHeight());

        System.out.println(image.getWidth());
        for(int x = 0; x < newImage.getWidth()/2; x++)
        {
            for(int y = 0; y < newImage.getHeight(); y++)
            {
                Pixel pixelObj = newImage.getPixel(x, y);
                Pixel otherSide = newImage.getPixel(x+image.getWidth(),y);

                pixelObj.setColor(image.getPixel(x,y).getColor());
                otherSide.setColor(image.getPixel(x,y).getColor());
            }
        }

        image = newImage;
    }

    public void doubleVertical()
    {
        Picture newImage = new Picture(image.getWidth(), image.getHeight() * 2);

        System.out.println(image.getWidth());
        for(int x = 0; x < newImage.getWidth(); x++)
        {
            for(int y = 0; y < newImage.getHeight()/2; y++)
            {
                Pixel pixelObj = newImage.getPixel(x, y);
                Pixel otherSide = newImage.getPixel(x,y+image.getHeight());

                pixelObj.setColor(image.getPixel(x,y).getColor());
                otherSide.setColor(image.getPixel(x,y).getColor());
            }
        }

        image = newImage;
    }

    public void border()
    {
        int borderX = (int) (image.getWidth() * 0.1);
        int borderY = (int) (image.getHeight() * 0.1);

        int borderWidth = (borderX)/2;
        int borderHeight = (borderY/2);
        System.out.println(borderWidth);

        System.out.println(borderWidth + ", " + borderHeight);

        int width = (int) (image.getWidth() * 0.1 + image.getWidth());
        int height = (int) (image.getHeight() * 0.1 + image.getHeight());

        Picture newImage = new Picture(width, height);

        for(int x = 0; x < newImage.getWidth(); x++)
        {
            for(int y = 0; y < newImage.getHeight(); y++)
            {
                Pixel pixelObj = newImage.getPixel(x, y);

                pixelObj.setColor(new Color(0, 0, 0));


            }
        }
        for(int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Pixel pixelObj = newImage.getPixel(x + borderWidth, y + borderHeight);

                pixelObj.setColor(image.getPixel(x, y).getColor());
            }

        }

        image = newImage;
        //System.out.println(image.getWidth() + ", " + image.getHeight());
    }
    public void swapColors()
    {
        for(int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {

                Pixel pixel = image.getPixel(x, y);

                int r = pixel.getRed();
                int g = pixel.getGreen();
                int b = pixel.getBlue();

                pixel.setColor(new Color(g, b, r));
            }
        }
    }

    public void grayscale()
    {
        for(int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {

                Pixel pixel = image.getPixel(x, y);

                int r = pixel.getRed();
                int g = pixel.getGreen();
                int b = pixel.getBlue();

                int gray = (r + g + b)/3;

                pixel.setColor(new Color(gray, gray, gray));
            }
        }
    }

    public void masterpiece()
    {
        int midX = image.getWidth() / 2;
        int midY = image.getHeight() / 2;

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Pixel pixel = image.getPixel(x, y);
                int r = pixel.getRed();
                int g = pixel.getGreen();
                int b = pixel.getBlue();

                if (x < midX && y < midY)
                {
                    int blurR = 0, blurG = 0, blurB = 0, count = 0;

                    for (int dx = -10; dx <= 10; dx++) {
                        for (int dy = -10; dy <= 10; dy++) {
                            int newX = x + dx;
                            int newY = y + dy;

                            if (newX >= 0 && newX < image.getWidth() && newY >= 0 && newY < image.getHeight()) {
                                Pixel neighborPixel = image.getPixel(newX, newY);
                                blurR += neighborPixel.getRed();
                                blurG += neighborPixel.getGreen();
                                blurB += neighborPixel.getBlue();
                                count++;
                            }
                        }
                    }

                    blurR /= count;
                    blurG /= count;
                    blurB /= count;
                    pixel.setColor(new Color(blurR, blurG, blurB));
                } else if (x >= midX && y < midY)
                {
                    pixel.setColor(new Color(g, r, b));
                } else if (x < midX && y >= midY)
                {
                    pixel.setColor(new Color(255 - r, 255 - g, 255 - b));
                } else
                {
                    pixel.setColor(new Color(r / 2, g / 2, b));
                }

                if(x < 10 || x > image.getWidth()-10 || y < 10 || y > image.getHeight()-10)
                {
                    int randR = (int) (Math.random() * 256);
                    int randG = (int) (Math.random() * 256);
                    int randB = (int) (Math.random() * 256);
                    pixel.setColor(new Color(randR,randG,randB));
                }
            }
        }
    }

    public void show()
    {
        image.show();
    }

    public Picture getImage()
    {
        return image;

    }

    public boolean equals(Object otherObject)
    {
        if (!(otherObject instanceof MyArt))
        {
            return false;
        }
        MyArt otherArt = (MyArt) otherObject;
        Picture otherImage = otherArt.getImage();
        if(otherImage.getWidth()!=image.getWidth() || otherImage.getHeight()!=image.getHeight())
        {
            return false;
        }
        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel otherPix = otherImage.getPixel(x, y);
                Pixel thisPix = image.getPixel(x, y);
                int thisRed = thisPix.getRed();
                int thisGreen = thisPix.getGreen();
                int thisBlue = thisPix.getBlue();
                int otherRed = otherPix.getRed();
                int otherGreen = otherPix.getGreen();
                int otherBlue = otherPix.getBlue();
                if ((thisRed != otherRed) || (thisGreen != otherGreen) || (thisBlue != otherBlue))
                {
                    return false;
                }
            }
        }
        return true;
    }

}
