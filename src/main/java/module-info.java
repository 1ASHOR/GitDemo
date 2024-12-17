module com.javaprogrammingtim.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javaprogrammingtim.gitdemo to javafx.fxml;
    exports com.javaprogrammingtim.gitdemo;
}