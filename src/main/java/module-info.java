module com.tpv.timbersheep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tpv.timbersheep to javafx.fxml;
    exports com.tpv.timbersheep;
    exports com.tpv.timbersheep.controllers.main;
    exports com.tpv.timbersheep.controllers.componentsControllers.titleBar;

}