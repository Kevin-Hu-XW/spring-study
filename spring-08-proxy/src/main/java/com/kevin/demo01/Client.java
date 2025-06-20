package com.kevin.demo01;

/**
 * @author Kevin
 * @date 2025/6/17 22:20
 */
public class Client {

    public static void main(String[] args) {
        LandOwner landOwner = new LandOwner();
        HouseProxy houseProxy = new HouseProxy(landOwner);
        houseProxy.rentHouse();
        LandOwner2 landOwner2 = new LandOwner2();
        HouseProxy houseProxy2 = new HouseProxy(landOwner2);
        houseProxy2.rentHouse();
    }
}
