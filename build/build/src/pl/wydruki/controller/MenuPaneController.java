package pl.wydruki.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuPaneController implements Initializable {

    @FXML
    private MenuItem close;

    @FXML
    private MenuItem setErase;

    @FXML
    private MenuItem aboutApp;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		close.setOnAction(x -> Platform.exit());
		optionMenu();
		AboutMeMenu();
	}
	
	private void optionMenu() {
		setErase.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Parent parent = null;
				try {
					parent = FXMLLoader.load(getClass().getResource("/pl/wydruki/view/OptionPane.fxml"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				Scene scene = new Scene(parent);
				Stage stage = new Stage();
				stage.setTitle("");
				stage.setScene(scene);
				stage.setAlwaysOnTop(true);
				stage.show();	
				
			}
		});
		}
	
	private void AboutMeMenu() {
		aboutApp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Parent parent = null;
				try {
					parent = FXMLLoader.load(getClass().getResource("/pl/wydruki/view/AboutMePane.fxml"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				Scene scene = new Scene(parent);
				Stage stage = new Stage();
				stage.setTitle("");
				stage.setScene(scene);
				stage.setAlwaysOnTop(true);
				stage.show();	
				
			}
		});
		}



}
