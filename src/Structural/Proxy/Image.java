package Structural.Proxy;

// Subject
interface Image {
    void loadImage();
}

// RealSubject
class RealImage implements  Image{
    private final String filename;

    public RealImage(String filename){
        this.filename = filename;
    }

    @Override
    public void loadImage() {
        System.out.println("Image "+filename+" loaded");
    }
}

// Proxy
class ProxyImage implements Image{
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void loadImage() {
        if(realImage == null){
            realImage = new RealImage(filename);
        }

        realImage.loadImage();
    }
}

class Clint{
    static void main(String[] args) {
        Image image = new ProxyImage("picture.png");
        System.out.println("Image created");
        image.loadImage();
    }
}