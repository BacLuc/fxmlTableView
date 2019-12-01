package fxmltableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class FXMLTableViewController implements Initializable {

    public FXMLTableViewController() {
    }

    @FXML
    protected void addPerson(ActionEvent ignored) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public static class PeopleModel {
        ObservableList<Person> personList;

        public PeopleModel() {
            personList = FXCollections.observableList(Arrays.asList(
                    new Person("firstName", "lastName", "email"),
                    new Person("firstName2", "lastName2", "email2")
            ));
        }

        public ObservableList<Person> getPersonList() {
            return personList;
        }

        public void setPersonList(ObservableList<Person> personList) {
            this.personList = personList;
        }
    }
}