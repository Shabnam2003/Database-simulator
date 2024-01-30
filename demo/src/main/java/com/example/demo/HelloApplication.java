package com.example.demo;

import com.example.demo.impelementation.BPTree;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        صفحه را مستقیم به بخش جدول به همراه یک درخت برای تست فرستادیم
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("database-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        bpTree.addColumnName("name" , Type.stringT);
        bpTree.addColumnName("number" , Type.doubleT);
        bpTree.addColumnName("city" , Type.stringT);
//        تست کیس
        Pack pack = new Pack(bpTree.getColumnNames().size());
        pack.addValue("ehsan" , Type.stringT);
        pack.addValue(987, Type.doubleT);
        pack.addValue("tehran" , Type.stringT);
        Pack pack1 = new Pack(bpTree.getColumnNames().size()) ;
        pack1.addValue("yahi" , Type.stringT);
        pack1.addValue(918765, Type.doubleT);
        pack1.addValue("lkjd" , Type.stringT);
        Pack pack2 = new Pack(bpTree.getColumnNames().size());
        pack2.addValue("ehsdXZasdz can" , Type.stringT);
        pack2.addValue(931287, Type.doubleT);
        pack2.addValue("tehkslran" , Type.stringT);
        Pack pack3 = new Pack(bpTree.getColumnNames().size());
        pack3.addValue("ehdscsan" , Type.stringT);
        pack3.addValue(98712 , Type.doubleT);
        pack3.addValue("tehrakin" , Type.stringT);
        bpTree.insert("1" , pack);
        bpTree.insert("2" , pack1);
        bpTree.insert("5" , pack2);
        bpTree.insert("20" , pack3);
//        ----------------
        launch();
//        System.out.println(DatabaseController.checkDouble("87.6"));
    }
//    تست کیس
    static BPTree <String , Pack> bpTree = new BPTree<>();
    public static BPTree <String , Pack> getTree () {
        return bpTree ;
    }
}