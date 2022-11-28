import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;

public class lutaPokemon implements Initializable {

    @FXML
    private Button batalhar;
    
    @FXML
    private ImageView imgPokemon1;

    @FXML
    private ImageView imgPokemon2;

    @FXML
    private ChoiceBox<String> cbPokemon1;

    @FXML
    private ChoiceBox<String> cbPokemon2;

    private String[] Pokemon = {"Charizard", "Arcanine", "Flareon", "Blastoise", "Gyarados", "Golduck", "Venusaur", "Victreebel", "Beedrill", "Tauros", "Snorlax", "Kangaskhan"};


    @FXML
    void batalhaPokemon(ActionEvent event) {
       
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbPokemon1.getItems().addAll(Pokemon);
        cbPokemon2.getItems().addAll(Pokemon);
        
    }

    public void getPokemon(ActionEvent event){
        String mypokemon = cbPokemon1.getValue();
        imgPokemon1.setImage();;

    }
    public void setImage(){
        if(
            
        )
    }

}
