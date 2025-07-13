package com.xworkz.collection.List.LinkedList.Node;

public class TrainNode
{

    private String data;
    private TrainNode address;

    public TrainNode(String data){
        this.data=data;
        this.address=null;
    }



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TrainNode getAddress() {
        return address;
    }

    public void setAddress(TrainNode address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TrainNode{" +
                "data='" + data + '\'' +
                ", address=" + address +
                '}';
    }
}
