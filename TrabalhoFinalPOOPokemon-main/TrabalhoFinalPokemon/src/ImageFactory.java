import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageFactory {
    private static ImageFactory imgf = new ImageFactory();
    private Map<String, Image> images;

    public static ImageFactory getInstance() {
        return imgf;
    }

    private ImageFactory() {
        images = new HashMap<>();
    }

    private String id2File(String imgId) {
        switch (imgId) {
        case "img1":
            return ("/imagens/um.png");
        case "img2":
            return ("/imagens/dois.png");
        case "img3":
            return ("/imagens/tres.png");
        case "img4":
            return ("/imagens/quatro.png");
        case "img5":
            return ("/imagens/cinco.png");
        case "img6":
            return ("/imagens/seis.png");
        case "img7":
            return ("/imagens/sete.png");
        case "img8":
            return ("/imagens/oito.png");
        case "img9":
            return ("/imagens/nove.png");
        case "img10":
            return ("/imagens/dez.png");
        case "img11":
            return ("/imagens/onze.png");
        case "img12":
            return("/imagens/doze.png");
        default:
            throw new IllegalArgumentException("Invalid image Id");
        }
    }

    public ImageView createImage(String imgId) {
        Image img = images.get(imgId);
        if (img == null) {
//            img = new Image(id2File(imgId));
            img = new Image(getClass().getResourceAsStream(id2File(imgId)));
            images.put(imgId, img);
        }

        ImageView imgv = new ImageView(img);
        return imgv;
    }
}

