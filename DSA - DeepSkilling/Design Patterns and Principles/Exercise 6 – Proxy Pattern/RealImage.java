public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {

        this.fileName = fileName;

        loadImage();

    }

    private void loadImage() {

        System.out.println("Loading image from server: " + fileName);

    }

    public void display() {

        System.out.println("Displaying: " + fileName);

    }

}