package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Logistic {
    String Transport;
    List<String> accessories=new ArrayList();
    public String toString(){
        return "Вид транспорта:" + "Транспорт \n"+ accessories;
    }
}
abstract class LogisticFactory{
    public abstract Logistic createLogistic();
}
class RoadLogisticFactory extends LogisticFactory {
    public Logistic createLogistic(){
        return new RoadLogistic();
    }}

class AirLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new AirLogistic();
    }}

class SeaLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new SeaLogistic();
    }}

class RoadLogistic extends Logistic{
    public RoadLogistic(){
        Transport="RoadLogistic";
        accessories.add("Производительность в тоннах");
        accessories.add("Расход топлива");
        accessories.add("Время в пути");
        accessories.add("Навигационная система");
    }
    @Override
    public String toString(){
        return "Вид транспорта:" + "Транспорт дорожный"+ accessories;
    }
}
class AirLogistic extends Logistic{
    public AirLogistic(){
        Transport="AirLogistic";
        accessories.add("Производительность в тоннах");
        accessories.add("Расход топлива");
        accessories.add("Время в пути");
        accessories.add("Навигационная система");
    }
    @Override
    public String toString(){
        return "Вид транспорта:" + "Транспорт воздушный"+ accessories;
    }
}
class SeaLogistic extends Logistic{
    public SeaLogistic(){
        Transport="SeaLogistic";
        accessories.add("Производительность в тоннах");
        accessories.add("Расход топлива");
        accessories.add("Время в пути");
        accessories.add("Навигационная система");
    }
    @Override
    public String toString(){
        return "Вид транспорта:" + "Транспорт морзкой"+ accessories;
    }
}
public class Main{
    public static void main(String args[]){
        LogisticFactory myRoadFactory=new RoadLogisticFactory();
        Logistic myRoadLogistic=myRoadFactory.createLogistic();
        System.out.println(myRoadLogistic);

        LogisticFactory myAirFactory=new AirLogisticFactory();
        Logistic myAirLogistic=myAirFactory.createLogistic();
        System.out.println(myAirLogistic);

        LogisticFactory mySeaFactory=new SeaLogisticFactory();
        Logistic mySeaLogistic=mySeaFactory.createLogistic();
        System.out.println(mySeaLogistic);
    }
}